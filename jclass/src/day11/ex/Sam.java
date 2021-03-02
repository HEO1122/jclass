package day11.ex;

public class Sam {
	public int garo, sero;
	public double  nulb;
	
	public void samSet() {//가로 세로 세팅함수
		garo = (int)(Math.random()*(15-5+1)+5);
		sero = (int)(Math.random()*(15-5+1)+5);
	}

	public void nulbSet() {
		nulb = garo*sero *0.5;
	}
	public void print() {
		System.out.printf("삼각형의 가로 %2d, 세로 %2d, 넓이%5.2f\n",garo,sero, nulb);
	}
}
