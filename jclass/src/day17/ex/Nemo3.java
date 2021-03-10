package day17.ex;
//높이가 같으면 같은
public class Nemo3 {

	
	//변수
	private int width, height;
	private int area;
	
	//Nemo 세팅
	public Nemo3() {}
	public Nemo3(int width, int height) {
		this. width = width;
		this. height = height;
		setArea();
	}
	
	//getter, setter
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
	public int getArea() {
		return area;
	}
	public void setArea(int area) {
		this.area = area;
	}
	public void setArea() {//오버로딩 ,area세팅
		this.area = width * height;
	}
	
	//출력함수
	public String toString() {
		return "밑변" + width +"높이"+ height + "넓이"+ area;
	}
	
	//equals 함수 오버라이딩
	public boolean equals(Object obj) {
		boolean bool = false;
		Nemo3 tmp =(Nemo3) obj;
		bool =this.height == tmp.height;
		return bool;
	}


}
