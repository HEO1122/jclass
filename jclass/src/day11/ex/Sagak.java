package day11.ex;

public class Sagak {
	public int garo, sero;
	public int dool, nulb;
	
	public void setGS() {//가로 세로 세팅하는 함수
		garo = (int)(Math.random()*(15-5+1)+5);
		sero = (int)(Math.random()*(15-5+1)+5);
	}
	
	public void setDool() {//둘레 세팅하는 함수
		dool= 2*garo + 2*sero;
	}
	public void setNulb() {//넓이 세팅하는 함수
		nulb = garo*sero;
	}
	public void print() {//출력함수
		System.out.printf("가로 :%2d , 세로:%2d , 둘레: %2d ,  넓이: %2d\n", garo, sero, dool, nulb);
	}
	
	
}
