package day17.ex;

//�ﰢ���� ���̰� ������ ���� �ﰢ������ ó���ǵ��� �ϼ���(1)
public class Semo1 {
	//����
		private int width, height;
		private double area;
		
		//����
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
		public void setArea() { // �����ε�
			this.area = width*height*0.5;
		}
		
		//����Լ�
		public String toString() {
			return "�غ�" +width +"����"+ height+ "����"+area;
		}
		
	
	public boolean equals(Object obj) {
		boolean bool = false;
		Semo1 tmp = (Semo1) obj;
		bool = this.area == tmp.area;
		return bool;
	}
	

}
