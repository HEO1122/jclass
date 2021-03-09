package day16.ex;

public class Won  implements Dohyung{
private int rad;
private double area;

	//세팅함수
	public Won() {
		
	}
	//오버로딩
	public Won(int rad) {
		this.rad=rad;
		area =getArea();
	}
	
	//getter, setter
	public int getRad() {
		return rad;
	}
	public void setRad(int rad) {
		this.rad = rad;
	}

	public double getArea() {
			return area= rad*rad*3.14;
			
	}
		public void  toPrint() {
			System.out.printf("반지름 %3d, 넓이 : %5.2f",rad, area);
	}
}
