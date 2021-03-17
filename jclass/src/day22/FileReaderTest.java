package day22;
/*
 * FileWriterTest01���� ������ ����(day22/data/fwTest.txt)�� �о��.
 */
import java.io.*;
public class FileReaderTest {

	public FileReaderTest() {
		//Ÿ�� ��Ʈ�� �غ�
		FileReader fr = null;
		try{
			//Ÿ�ٽ�Ʈ�� �����
			fr = new FileReader("src/day22/data/fwTest.txt");
			/*
			//1. �ѱ��� �о��
			int ch= fr.read();
			System.out.println((char)ch);
			*/
			//2. �������� �о��
			while(true) {
				char[] buff =new char[1024];
				int len = fr.read(buff); //�Էµ� ���ڹ迭�� ���� ���ڸ� ä���ְ� ���� ������ ������ ��ȯ���ش�.
				//���� ���ڰ� ���� ���� len�� -1�� ���ȴ�.
				if(len ==-1) {
					//�� ���� �ݺ����� �����Ѵ�.
					break;
				}
				String str = new String(buff, 0, len);
				
				System.out.println(str);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fr.close();
			}catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new FileReaderTest();

	}

}