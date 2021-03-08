package day15.ex;

public class Nemo extends Figure{

	private int width; 
	private int height;
	
	//�������Լ�
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
	System.out.printf("�׸��� ���� : %3d, ���� : %3d, ���� ; %5.2f\n",width,height ,getArea());
	}

}


