package day19.ex;

/*
 * ����1) Vector�� ����� ������� ���Ϳ� ��� 10���� �־ ����ϼ���.
 */
import java.util.*;
public class Ex01 {
	public Vector vec = new Vector();

	public Ex01() {
		setData();
	}
	
	public void setData() {
		vec.add("�Ѹ�");
		vec.add("CELEBRITY");
		vec.add("dynamite");
		vec.add("���ϴ��� ����");
		vec.add("don't call me");
		vec.add("love day");
		vec.add("���� ���� �ʳ׿�");
		vec.add("lovesick girls");
		vec.add("��⸦ ����");
		vec.add("����");
		
		for(int i =0; i<vec.size(); i++) {
			System.out.print(vec.get(i));
			
		}
		
	}
	public static void main(String[] args) {
		new Ex01();

	}

}
