package day17.ex;

/*
 * ����2) �л��� ������ �����ϴ� Ŭ������ �ۼ��ϼ���
 * 			�л��� ������ �л���ȣ, �̸��� ����ϱ�� �ϰ�
 * 			������ java, db, web, jsp, ������ ����ϱ�� �Ѵ�.
 * 
 * 			�̶� �л���ȣ�� ������ ���� �л����� ó���ǰ� �ϼ���.
 * 			�� Ŭ������ ������ ����� �� �ش� �л��� ����(�⺻���� + ����)�� ��µǵ��� �ϼ���. 
 */
import java.util.*;
public class Ex02 {
Student[] stud= new Student[10];
	public Ex02() {
		Student s1 = new Student(1, "�Ѹ�");
		System.out.println(s1);
		
		Student s2 = new Student(1, "��");
		System.out.println(s2);
		
		System.out.println(s1.equals(s2));
	
	loop:
		for(int i =0; i<stud.length; i++) {
			int no =(int)(Math.random()*10+1);
			stud[i] = new Student(no, "�л�"+no + ":");
			for(int j =0; j<i; j++) {
				if(stud[i].equals(stud[j])) {
					i--;
					continue loop;
				}
			}
		}
	
		System.out.println(Arrays.toString(stud));
		
	}

	public static void main(String[] args) {
		new Ex02();

	}

}
