package day6;

/*10���� ���ڸ� ����� �޸𸮸� �����
 * �޸𸮿� 'A'~'J'���� ���ʷ� ����� �� ����ϼ���.
 */
public class Test05 {
	public static void main(String[] args) {
		char[] ch;
		//heap�� �޸� ���� Ȯ��
		ch =new char[10];
		
		for(int i =0;i<10; i++) {
			//'A' +0 ='A'
			//'A'+1 ='B'
			//'A'+2 ='C'
			ch[i] = (char)('A'+i);
		}
		//����Ѵ�.
		for(int i =0; i<ch.length; i++) {
			System.out.print(ch[i]+",");
		}
		System.out.println();
		//���� for ��� for each����̶�� �Ѵ�.
		for(char c: ch) {
			//�� �ݺ����� �迭(ch)�� ��� ������ �ϳ��� ������ 
			//���� c�� ���������� ���Խ�Ų��.
			//��������� ��� �����͸� ���������� ������ ó���ϰ� ����ȴ�.
			System.out.print(c+",");
		}
	}
}
