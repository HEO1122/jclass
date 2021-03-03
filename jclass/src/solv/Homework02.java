package day11.solv;
import java.util.*;
import day11.Student;
/* 
 * �̸� �Ǵ� ���̵� �Է��ϸ� �ش� ģ���� ������ ������ִ� ���α׷���
 * �����ϼ���
 */
public class Homework02 {
	public Homework02() {
		//�迭 �غ��ϰ�
		Stud02[] stud =getDataArr();
		//�����ϸ� �ν��Ͻ��� ������ ��� ä���� ��ȯ���ִ� �Լ��� �̹� ����� �������� 
		//ȣ�⸸ �ϸ� ���ϴ� ��Ʃ��Ʈ �迭�� ���� �� �ִ�.
		
		//���
		toPrint(stud);
	}
	//���� ó���Լ�
	public void exec(Stud02[] st) {
		//����
		//���ѹݺ��ؼ� ģ���� �̸��� �Է��� ������ �ƴϸ� ���̵� �Է��� �������� �Է¹޴´�.
		//�̸� �Է��� 0�� ���̵� �Է��� 1������ ó���ϱ�� �Ѵ�.
		//�Էµ��� �غ�
		Scanner sc= new Scanner(System.in);
		
		while(true) {
			//�޽��� ���
			System.out.println("�̸����� �˻��� 0 ���̵�� �˻��� 1�� �Է��ϼ��� ����� 9��:");
			int no = sc.nextInt();
			//�����ڵ�˻�
			if(no==9) {
				System.out.println("����");
			//�߸��� �Է����� �˻�
			if (!(no == 0|| no==1 )) {
				System.out.println("�߸��Է��߽��ϴ�.~");
				continue;
			}
			sc.close();
			switch(no) {
			case 0 :
				//�̸����� �˻��ϴ� ��� ó��
				nameToInfo(st);
				break;
			case 1://���̵�� �˻��ϴ� ��� ó��
				idToInfo(st);
				break;
			}
		}
	}
	//�迭�� �Է��ؼ� �����ϸ� �̸��� �Է¹޾Ƽ� �ش��̸��� �л�������������ִ� �Լ�
	public void nameToInfo(Stud02[] st) {
		//�Էµ��� �غ�
		Scanner sc = new Scanner(System.in);
		//�޽��� ���
		System.out.print("�̸��Է� : ");
		String name = sc.nextLine();
		
		//�� �ε����� �̸��� ���ؼ� ���� �̸��̸� ������ ����Ѵ�.
		for(int i =0; i<st.length;i++) {
			if(st[i].getName().equals(name)) {
				System.out.println(st[i].toString());
				break;
			}
		}
		sc.close();
	}
	//�迭�� �Է��ؼ� �����ϸ� ���̵��Է¹ް�
	//�ش� ���̵��� �л������� ������ִ� �Լ�
	
	public void idToInfo(Student[] st) {
		Scanner sc = new Scanner(System.in);
		//�޽��� ���
		System.out.print("���̵��Է� : ");
		String name = sc.nextLine();
		
		//�� �ε����� �̸��� ���ؼ� ���� �̸��̸� ������ ����Ѵ�.
		for(int i =0; i<st.length;i++) {
			if(st[i].getId().equals(Id)) {
				System.out.println(st[i].toString());
				break;
			}
		}
		sc.close();
	}	
	}
	public static void main(String[] args) {
		new Homework01();
	}
	
	//�ν��Ͻ��� ������ ä���ִ� �Լ�
	public Stud02[] getDataArr() {
		//��ȯ�� ���� �����
		Stud02[] st = new Stud02[5];
		
		for(int i =0; i<st.length; i++) {
			st[i]= new Stud02();
		}
		//������ ���Կ� �迭�� �غ�
		String[] name = {"���¼�","�ֿ���","�����","�ִٿ�","�����"};
		String[] id = {"tsung","hoon","soo","yun","ki"};
		String[] mail = {"tsung@increpas.com","hoon@increpas.com","soo@increpas.com",
				"yun@increpas.com","ki@increpas.com"};
		String[] tel = {"010-1111-1111","010-2222-2222","010-3333-3333","010-4444-4444","010-5555-5555"};
		char[] gen = {'M','M','F','F','M'};
		
		//������ ä���
		for(int i =0; i<st.length; i++) {
			String irum =name[i];
			String aidi =id[i];
			String juso= mail[i];
			String hp = tel [i];
			char gender = gen[i];
			
			st[i].setId(aidi);
			st[i].setName(name[i]);
			st[i].setMail(juso);
			st[i].setTel(hp);
			st[i].setGen(gender);
		}
		//�ϼ��� �迭 ��ȯ
		return st;
}
	//��¿� �Լ�
	public void toPrint(Stud02[] st) {
		for(int i=0; i<st.length; i++) {
			System.out.println(st[i].toString());
		}
	}//�Լ� �����ε� ( �Ű����� ������ �ٸ�)
	public void toPrint(Stud02[] st, int idx) {
		System.out.println(st[idx].toString());
		
	}
	
//	public String toPrint(Stud02[] st) { �Ű����� ����Ʈ�� ���°� ���� ������ �ȵȴ�.
//		String str = "";
//		return str;
	}
