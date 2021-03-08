package day15.ex;

public class Nemo extends Figure{

	private int width; 
	private int height;
	
	//생성자함수
	public Nemo() {}
	
	public Nemo(int a,int b) {
		width=a;
		height =b;
	}
//getter ,setter
	
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public double getArea() {
	
	return width*height;
	}
	
public  void toPrint(){
	System.out.printf("네모의 가로 : %3d, 세로 : %3d, 넓이 ; %5.2f\n",width,height ,getArea());
	}

}


