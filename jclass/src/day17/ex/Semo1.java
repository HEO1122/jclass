package day17.ex;

//삼각형의 넓이가 같으면 같은 삼각형으로 처리되도록 하세요(1)
public class Semo1 {
	//변수
		private int width, height;
		private double area;
		
		//세팅
		public Semo1() {
		}
		public Semo1(int width, int height) {
			this.width = width;
			this.height =height;
			setArea();
		}
		
		//getter,setter
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
		public void setArea(double area) {
			this.area = area;
		}
		public void setArea() { // 오버로딩
			this.area = width*height*0.5;
		}
		
		//출력함수
		public String toString() {
			return "밑변" +width +"높이"+ height+ "넓이"+area;
		}
		
	
	public boolean equals(Object obj) {
		boolean bool = false;
		Semo1 tmp = (Semo1) obj;
		bool = this.area == tmp.area;
		return bool;
	}
	

}
