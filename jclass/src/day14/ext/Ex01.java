package day14.ext;

/*
 * �� �������� �ۼ��� Samgak, Sagak, Won Ŭ������  10���� ����ҹ迭�������
 * �����ϰ� �� Ŭ������ �ν��Ͻ��� ä���� ����ϴ� ���α׷��� �ۼ��ϼ���.
 */
public class Ex01 {

	
	public Ex01() {
		//1. Figure Ŭ������ ����� Samgak, Sagak, Won Ŭ������ ������ش�.
		/*
		Figure f1 = new Samgak(5,2);//f1�� �ν��Ͻ� �־��ֱ�
		Figure f2 = new Sagak(3,2); //f2�� �ν��Ͻ� �־��ֱ�
		Figure f3 = new Won(2);   //f3�� �ν��Ͻ� �־��ֱ�
		*/
			
		
		//2. 10���� Ŭ������ ����� �迭 �����
		Figure[] f = new Figure[10];//new ����� ���� �ʱ�ȭ
		for(int i=0; i<f.length; i++) {//f �迭�� �ݺ��ؼ� ä���ش�.
			f[i]= getFigure(); //f[i]��° �ε������� getFigure()�Լ��� ���ؼ� �ʱ�ȭ���ش�.
			}
		for(Figure fa : f) {
			fa.toPrint(); 
		}
	
	
	}
	
	//3. �����ϰ� ��ȯ���ִ� �Լ�
	public Figure getFigure() {
		Figure f =null;
		int no = (int)(Math.random()*3);//no�� 3�� ������ �� ������
		switch(no) {
		case 0: //0�� ��� Samgak Ŭ����
			f= new Samgak((int)(Math.random()*10 + 1), (int)(Math.random()*10 + 1));
			break;
		case 1 : //1�� ��� Sagak Ŭ����
			f =new Sagak((int)(Math.random()*10 + 1), (int)(Math.random()*10 + 1));
			break;
		case 2 :  //2�� ��� Won Ŭ����
			f=new Won((int)(Math.random()*10 + 1));
			break;
		}
		 return f;	
	}
	



	public static void main(String[] args) {
			new Ex01();

	}

}
