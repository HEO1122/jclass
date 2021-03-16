package day21;

import java.io.FileInputStream;

/*
 * DataOutputTest01���� ������ ������ �о��
 */
import java.io.*;
public class DataInputTest01 {

	public DataInputTest01() {
		//Ÿ�ٽ�Ʈ���غ�
		FileInputStream fin = null;
		//���ͽ�Ʈ���غ�
		DataInputStream din = null;
		
		try {
			//��Ʈ�� �����
			fin = new FileInputStream("src/day21/data/friend.txt");
			din = new DataInputStream(fin);//Ÿ�ٽ�Ʈ�� �����.
			
			//������ ������ �� �̸�,����, ����, ����, ��ȭ. ���� ������ ����
			//�ݵ�� ���� ���� ������ ���缭 �������Ѵ�.
			String name =din.readUTF();
			int age =din.readInt();
			double height = din. readDouble();
			boolean gen = din.readBoolean();
			String tel = din.readUTF();
			String mail = din.readUTF();
			
			//���
			System.out.println("�̸� : "+ name);
			System.out.println("���� : "+ age);
			System.out.println("���� : "+ height);
			System.out.println("���� : "+ gen);
			System.out.println("��ȭ : "+tel);
			System.out.println("���� : "+ mail);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				din.close();
				fin.close();
			}catch(Exception e) {}
		}
		
	}

	public static void main(String[] args) {
		new DataInputTest01();
	}

}
