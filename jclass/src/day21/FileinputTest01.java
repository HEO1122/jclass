package day21;
/*
 * InputTest01.java������ ������ �о��
 */
import java.io.*;
public class FileinputTest01 {

	public FileinputTest01() {
	//���� 
	//1. ���Ͽ� ����� Ÿ�ٽ�Ʈ�� �غ�
		FileInputStream fin = null;
		try {
			fin = new FileInputStream("src/day21/InputTest01.java");
			//�ѱ��ڸ��ͱ�
//			int ch =fin.read();
//			System.out.println((char)ch);
			//2. �������� ������
		/*	byte[] buff = new byte[1024];
			int len = fin.read(buff);
			String str = new String(buff, 0, len);
			System.out.println(str);
			*/
			//3. ���� ��ü ���� �о��
			// �̶� ����ڸ� �Ͼ�� ���� �𸣹Ƿ� �ݺ������� ó���Ѵ�.
			while(true) {
				//�ϴ� �ѹ� ���緮�� �˾ƺ���
				byte[] buff = new byte[1024];
				int len = fin.read(buff);
				//�̶� ��ȯ���� ���� ������ �����̴�. -1�� ��ȯ�� ���� ���̻� ���� �����Ͱ� ���� ����̴�.
				//���� �� �ݺ����� �����Ѵ�.
				if(len ==-1) {
					break;
				}
				//���� ������ŭ ���ڿ��� �����
				String str = new String(buff, 0 , len);	
//				����ϰ�
				System.out.println(str);
			
				
			}
		}catch(Exception e) {
			
		}finally {
			try {
				fin.close();
			}catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new FileinputTest01();

	}

}
