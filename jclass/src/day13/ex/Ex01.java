package day13.ex;
/*
 * ����1�� 
 * ���� ������ ����� �ϴ� Student Ŭ������ ���弼��
 * �ʿ��� ������ �Լ����� ��� �ۼ��ؼ� ���弼��
 * toString() �Լ��� �߰��ϼ���
 * String name;
 * int ban, no, kor, eng, math,total;
 * 
 *5���� �л��� �����͸� �迭�� ��� ���뵵 ����ϼ���.
 *
 *�۾�����)
 *1 �ʿ��� ������ ������ Ŭ������ �ۼ��Ѵ�.
 *2 �ʿ��� �����ڸ� �����Ѵ�.
 *3 Ex01Ŭ���� ������ 5 �л��� �����͸� �迭�� �����.
 *4 ����Ѵ�.
 */

public class Ex01 {
	public Ex01() {
		Student[] stud = getStud();
		for(int i =0; i<stud.length; i++) {
			System.out.println(stud[i]);
			/*
			 * println()�Լ��� toString()�Լ��� �ڵ� ȣ���ؼ� ����Ѵ�.
			 */
		}
	}
	public Student[] getStud() {
		Student[] s = new Student[5];
		String[] name = { 
				"ȫ�浿","�Ѹ�","��浿", "����","�����"};
		int ban =2;
		int no=1;
		//�迭 ����
		for(int i =0; i<s.length; i++) {
			//���� ���� ���� �����ϰ� �����
			int k =(int)(Math.random()*41+60);
			int e =(int)(Math.random()*41+60);
			int m =(int)(Math.random()*41+60);
			//���� �� �濡 �ν��Ͻ��� ���� ����Ű��
		/*	2)
		 * 	s[i]= new Student(name[i],ban,no++,k,e,m);
			s[i].setTotal();
			s[i]
			3)
			s[i]= new Student();
			s[i].setName(name[i]);
			s[i].setBan(ban);
			s[i].setNo(no++);
			*/
		}
		return s;
	}
	
	public static void main(String[] args) {
		new Ex01();

	}

}
