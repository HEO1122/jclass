package day15.ex;

public class Semo extends Figure {
	private int width;
	private int height;
	
	public Semo(){}
	public Semo(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	//변수 getter setter 함수
	public double getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}


	public double getHeight() {
		return height;
	}


	public void setHeight(int height) {
		this.height = height;
	}

		
		
	public double getArea() {
		return width * height * 0.5;
	}
	public  void toPrint(){
		System.out.printf(" 세모의 가로 : %3d, 세로 : %3d, 넓이 ; %3.2f\n",width ,height ,getArea());
	}

}
