package day14.ext;

public class Test10_1 {

	public Test10_1() {
		/*Grand g1 = new Grand(); // Grand Ŭ������ Grand�ν��Ͻ� ����
		Grand g2 = new Father(); // Grand Ŭ������Father�ν��Ͻ� ����
		Grand g3 = new Uncle();// Grand Ŭ������Uncle�ν��Ͻ� ����
		
		Grand[] gg = {g1,g2, g3}; //Grand������Ÿ���� gg�迭�� �ʱ�ȭ
		
		for(Grand g : gg) {// ���� for ������ Grand������Ÿ�� g�� gg�迭 ����ֱ�
			g.toPrint(); //
		}
		*/
		
		//�����ϰ� �迭�� ������ �ֱ�
		Grand[] g = new Grand[10];// �ϴ� Grand[]Ÿ���� g�� �ʱ�ȭ�ϸ鼭 �迭����
		for(int i =0; i<g.length; i++) {
			g[i] = getGrand();
			}
		//�迭�� �־��� ������ ���
		for(Grand gg : g) { //g�� �ִ� toPrint()�Լ��� gg������ �� �� �ִ�.
			gg.toPrint();
		}
		
		}
		//Grand Ÿ���� ������ �����ϰ� ��ȯ���ִ� �Լ�
		public Grand getGrand() { //[����������][��ȯ��] �Լ��̸�
			Grand g =null; //��ȯ���� ���� ����
			
			int no = (int)(Math.random()*3);//0~2������ ������ ���ڸ� �����.
			//���ڿ� ���� � Ŭ������ ��ȯ������ ����
			switch (no) { //�ν��Ͻ��� ������ ������ �Լ� ��� �־�����.
			case 0 : 
				g= new Grand(); //0�϶��� Grand�� �ν��Ͻ��� �־��ش�.
				break;
			case 1 :
				g= new Father();// 1�϶��� Father�� �ν��Ͻ��� �־��ش�.
				break;
			case 2 : 
				g = new Uncle();//2�� ����Uncle�� �ν��Ͻ��� �־��ش�.
				break;
			} 
			return g;
		}
	public static void main(String[] args) {
		new Test10_1();//�����Լ����� Test10()������ �Լ� ���
	}
	
}