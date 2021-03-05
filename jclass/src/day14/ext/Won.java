package day14.ext;

public class Won extends Figure {//Figure Ŭ���� ��ӹޱ�
	//���� �����ϱ�
	private int rad;
	private double area, dool;
	
	public Won() {	}//�⺻ �������Լ�
	public Won(int rad) {//�Է¹��� ���� ������ ���Խ�Ű�� �������Լ�
		this.rad = rad;
		setArea();//���� ������ �Է� ������ �ڵ����� ���� �������ֱ�
		setDool();//���� ������ �Է� ������ �ڵ����� �ѷ� �����ϱ�
	}
	//���ͼ��ͷ� private ������ �����ϴ� �Լ� �����
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
	
	//area ������ ���� �������ִ� �Լ� �����ε�
	public void setArea() {
		this.area = rad*rad*Math.PI;
	}
	public double getDool() {
		return dool;
	}
	public void setDool(double dool) {
		this.dool = dool;
	}
	//dool ������ �ѷ��� �������ִ� �Լ� �����ε�
	public void setDool() {
		this.dool = rad*2*Math.PI;
	}
	
	//���� ���� ������ ������ִ� �Լ�
	public void toPrint() {//Figure�� �ִ� �Լ� �������̵�
		System.out.printf("���� ������ %2d, ���� ���� : %5.3f, ���� �ѷ� : %5.3f\n",rad, area, dool);
	}
	
	

}
