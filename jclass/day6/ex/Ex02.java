package day6.ex;

/*�����̰� ������(100m)�ö󰡴µ� 
 * ������ 0.87m�� �ö󰡰�
 * �㿡�� 0.35m�� �̲�������.
 * �� �ϸ��� �� �����̴� ���� �ö� ���ΰ�?
 * �� ����⿡ �ö󰡸� �̲���������.
 */
public class Ex02 {

	public static void main(String[] args) {
		
		double snail=0;
		int day=0;
		while(true){
			
			day++;
			snail=snail+0.87;
			if(snail>=100) {break;}
			snail=snail-0.35;
			
		}
		System.out.println("�ɸ� ��¥"+day);

	}

}
