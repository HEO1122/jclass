package day18;

/*
 * Scanner�� �̿��ؼ� ���Ͽ� ����� ������ �о ����غ���
 * day18.ex.Ex01.java
 */
import java.io.*;
import java.util.*;
public class Test03 {

	public Test03() {
		//���ϰ�ü�� �����.
		File file = new File("C:\\class\\java\\source\\jclass\\jclass\\src\\day18\\Test01.java");
		//��ĳ�� �غ�
		Scanner sc = null;
		try {
			sc=new Scanner(file);
			String str = sc.nextLine();
			System.out.println("EX01 ����"+str);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new Test03();

	}

}
