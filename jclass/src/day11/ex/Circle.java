package day11.ex;

public class Circle {

	public int ban;
	public double dool, nulb;

	public Circle() {//반지름 랜덤으로 대입
		ban =(int)(Math.random()*(15-5+1)+5);
		getDool();
		getNulb();
	}
	
	//둘레 구하는 함수
	public double getDool() {
		dool =ban *2*3.14;
		return dool;
				
	}
	//넓이 구하는 함수
	public double getNulb() {
		nulb=ban*ban*3.14;
		return nulb;
	}
	//출력하는 함수
	public void toPrint() {
		System.out.printf("반지름 %2d, 둘레 : %5.2f, 넓이 : %5.2f\n",ban,dool,nulb);
	}
}
