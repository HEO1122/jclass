package day19;
import java.util.*;-
public class Test03 {

	public Test03() {
		//������ ������� �������� ���ؼ� ���͸� ������
		Vector vec = new Vector(5,5);
		
		int tcnt = vec.capacity();// �氹��
		int cnt =vec.size();//�����Ͱ���
		System.out.println(tcnt);
		System.out.println(cnt);
		
		//������ �Ѱ��߰�
		vec.add("���");

		 tcnt = vec.capacity();// �氹��
		 cnt =vec.size();//�����Ͱ���
		System.out.println(tcnt);
		System.out.println(cnt);
		
		//������ 5�� �߰�
		for(int i =0; i<5; i++) {
			vec.add("���");
		}

			 tcnt = vec.capacity();// �氹��
			 cnt =vec.size();//�����Ͱ���
			System.out.println(tcnt);
			System.out.println(cnt);
			
			//������ 5�� �߰�
			for(int i =0; i<5; i++) {
				vec.add("���");
			}
			
			tcnt = vec.capacity();// �氹��
			cnt =vec.size();//�����Ͱ���
			System.out.println(tcnt);
			System.out.println(cnt);
			
		
	}

	public static void main(String[] args) {
	new Test03();

	}

}
