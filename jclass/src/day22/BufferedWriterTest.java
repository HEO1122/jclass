package day22;
/*
 * ��Ʈ���� �̿��ؼ� desert.poem �� �����ؼ� desert.txt������ 
 * ������
 */
import java.io.*;
public class BufferedWriterTest {

	public BufferedWriterTest() {
		//���縦 �ؾ��ϹǷ� ����� ��Ʈ�� ��� �غ��Ѵ�.
		//�Է�
		FileReader fr = null;
		BufferedReader br = null;
		
		//���
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			//��Ʈ�� �����
			//�Է�
			fr =new FileReader("src/day22/data/desert.poem");
			br=new BufferedReader(fr);
			//���
			fw = new FileWriter("src/day22/data/deser.txt");
			bw = new BufferedWriter(fw);
			
			// ���ʿ��� �а� �� ����� �����ϸ�ȴ�.
			for(;;) {
				String line = br.readLine();
				if(line == null) {
					break;
				}
				bw.write(line + "\r\n");
				
			}
			System.out.println("�������强��");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				bw.close();
				fw.close();
				br.close();
				fr.close();
			}catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new BufferedWriterTest();

	}

}
