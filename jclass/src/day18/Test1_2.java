package day18;
/*
 * ���̵� 8���� ù���� �ҹ���, �ޱ��� ���ڸ����
 */
import java.util.regex.*;

public class Test1_2 {

	public Test1_2() {
		String id = "adfdd2f2";
		Pattern pattern = Pattern.compile("[a-z][a-zA-Z0-9]{6}[0-9]");
		Matcher mat = pattern.matcher(id);
		
		boolean bool = mat.matches();
		if(bool) {
			System.out.println("�ùٸ� ���̵� �Դϴ�.");
		}else {
			System.out.println("�ùٸ� ���̵� �ƴմϴ�.");
		}
	}

	public static void main(String[] args) {
		new Test1_2();

	}

}
