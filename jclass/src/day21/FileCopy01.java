package day21;
/*
 * ������ �����ϴ� ���α׷��� ������
 */
import java.io.*;
public class FileCopy01 {

	public FileCopy01() {
		//����
		//��Ʈ���� �ܹ����̴�.
		//����� �Ѱ����� �о �ٸ����� �״�� ����Ǵ�.
		//���� ��Ʈ���� �ΰ� �غ�Ǿ�� ������.
		FileInputStream fin =null; //����
		FileOutputStream fout =null; //���纻
		
		try {
			//��Ʈ���� ����� 
			fin = new FileInputStream("C:\\class\\java\\example\\day21\\character.jfif");
			fout = new FileOutputStream("src/day21/character.jfif");
			
			//�Ѱ����� �о �״�� �ٸ����� ��
			//��� �о�� �� ���𸥴�.
			while(true) {
				//byte�迭 �غ��ϰ�
				byte[] buff = new byte[1024];
				//�о �迭�� ����ϰ�
				int len =fin.read(buff);
				if(len ==-1) {
					break;
				}
				fout.write(buff,0,len);
					}
			System.out.println("����Ϸ�!!!");
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			try {
				fout.close();
				fin.close();
			}catch(Exception e) {}
		}
		
	}

	public static void main(String[] args) {
		new FileCopy01();
	}

}
