package day6.ex;

/*
 * ��� ���忡 �߰� ���� ����
 * �� �������� 52
 * �ٸ� ���� 144
 * ��, �� ���� ������� ���
 */
public class Ex_05 {
	public static void main(String[] args) {
		int chic = 2;
		int sheep =4;
		
		for(int i=1;i<=52 ;i++) {
			for(int j=1; j<=52 ;j++) {
			if(chic*i+sheep*j==144) {
				
				break;
				
			}
			System.out.println("��" + i);
			System.out.println("��" + j);
			}
			
			
		}
	}
}
