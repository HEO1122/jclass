package day6.ex;
/* ù���� 1���� �����ϰ� �������� ������ 2�踦 �����Ѵٸ�
   ����° 1����� ������ �� �ִ��� ������ִ� ���α׷��� �ۼ��ϼ���.
    
*/    
public class Ex_04 {
	public static void main(String[] args) {
		int day=1;
		int money =1;
		for(day=1; ;day++) {
			money=money*2;
			if(money>100000000) {break;}
		}System.out.println("1��� �����µ� �ɸ��� ��¥ : "+ day);
		System.out.println("1��� �����µ� �ɸ��� ��¥�ݾ� : "+money);
	}
}
