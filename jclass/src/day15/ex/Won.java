package day15.ex;


public class Won extends Figure{
	int rad ;
	
	public Won() {}
	public Won(int a) {
		rad =a;
	}
	//getter ,setter
	
	public int getRad() {
		return rad;
	}


	public void setRad(int rad) {
		this.rad = rad;
	}


	public  double getArea() {
		
		return rad*rad*3.14;
	}

	
	public void toPrint() {
		System.out.printf("���� ������ : %2d, ����: %3.2f\n", rad, getArea());
	}
}
