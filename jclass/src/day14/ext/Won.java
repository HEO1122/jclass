package day14.ext;

public class Won extends Figure {//Figure 클래스 상속받기
	//변수 설정하기
	private int rad;
	private double area, dool;
	
	public Won() {	}//기본 생성자함수
	public Won(int rad) {//입력받은 값을 변수에 대입시키는 생성자함수
		this.rad = rad;
		setArea();//원의 반지름 입력 받으면 자동으로 넓이 세팅해주기
		setDool();//원의 반지름 입력 받으면 자동으로 둘레 세팅하기
	}
	//겟터셋터로 private 변수에 접근하는 함수 만들기
	public double getRad() {
		return rad;
		
	}
	public void setRad(int rad) {
		this.rad = rad;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	
	//area 변수에 넓이 세팅해주는 함수 오버로딩
	public void setArea() {
		this.area = rad*rad*Math.PI;
	}
	public double getDool() {
		return dool;
	}
	public void setDool(double dool) {
		this.dool = dool;
	}
	//dool 변수에 둘레를 세팅해주는 함수 오버로딩
	public void setDool() {
		this.dool = rad*2*Math.PI;
	}
	
	//원에 대한 정보를 출력해주는 함수
	public void toPrint() {//Figure에 있는 함수 오버라이딩
		System.out.printf("원의 반지름 %2d, 원의 넓이 : %5.3f, 원의 둘레 : %5.3f\n",rad, area, dool);
	}
	
	

}
