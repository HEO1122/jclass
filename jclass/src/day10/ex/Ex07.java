package day10.ex;
/* ��7
 * �� ������ �����ȣ(+,-,*,/,%) ���ڸ� �Է��ϸ� �ش� ������ �����
 * ó�����ִ� �Լ� (calc)�� ���� �����ϰ� ������ּ���
 */
public class Ex07 {
	public Ex07() {
	int no1 =0;
	char buho =0;
	int no2 =0;
	double result =0;
	System.out.println("���� ������ �Է��ϼ���.");
	}
	public static void main(String[] args) {
		new Ex07();
	}
	public double calc(int a, char b, int c) {
		no1= a;
		buho= b;
		no2 =c;
		result= (no1+buho+no2);
		return result;
	}

}
