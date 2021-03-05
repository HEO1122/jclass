package day14.ext;

public class Sagak extends Figure {
	private int width,height,area;// 변수 설정
	
	public Sagak() {}//기본 생성자 함수
	public Sagak(int width, int height) {
		this.width =width; //매개변수 대입
		this.height =height;
		setArea();
	}
	//private변수 접근 함수만들기
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
		return area;
	}
	public void setArea(int area) {
		this.area = area;
	}
	public void setArea() {//area 변수 초기화
		this.area = height *width;
	}
	public void toPrint() {//Figure.toPrint()함수 오버라이딩
		System.out.printf("사각형의 밑변 : %2d, 높이 :%2d, 넓이 : %4d\n", width, height,area);
	}

}
