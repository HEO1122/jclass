package day21;
/*#- Hortense Vlou@
 # Desert@
#He felt so lonely@
#In this desert@
#That sometimes@
#He would walk backwards@
#Just to see tracks in front of him.@

�� �ø� �����غ��ڽ�����.
PrintStream�� ����ؼ� ó��
 */
import java.io.*;
public class PrintStreamTest {

	public PrintStreamTest() {
		//��Ʈ���� �غ��մϴ�.
		//PrintStream�� ���Ͱ迭Stream������ ��ġ�� ���������ؼ� ����ϴ½�Ʈ���̴�.
		PrintStream ps = null;
		try {
			ps = new PrintStream("src/day21/data/desert.txt");
			//���� ���Ͽ� ����� ��Ʈ���� ����� ���� ��Ʈ���̴�.
			
			ps.printf("- Hortense Vlou");
			 ps.println(" Desert");
			ps.println("He felt so lonely");
			ps.println("In this desert");
			ps.println("That sometimes");
			ps.println("He would walk backwards");
			ps.println("Just to see tracks in front of him.");
			
			ps.flush();
			//���������� Buffered�� ����� ������ �����Ƿ� 
			//�ݵ�� �������Ⱑ �������� ���۸� ����� �Ѵ�.
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				ps.close();
				/*
				 * close()�� ��ɿ��� ���������� 
				 * flush �Լ��� ����� �����ϰ� �ִ�.
				 * ���� close()�� ȣ���ϸ� 
				 * �ڵ� flush()�� �ȴ�.
				 */
			}catch(Exception e) {
				
			}
		}
	}

	public static void main(String[] args) {
		new PrintStreamTest();

	}

}
