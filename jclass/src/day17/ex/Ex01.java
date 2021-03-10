package day17.ex;

/*
 *  ���� 1) 
 *  	�ﰢ���� ������ ����� Semo Ŭ������ �����ϰ� 
 *  	
 *  //�ﰢ���� ���̰� ������ ���� �ﰢ������ ó���ǵ��� �ϼ���(1)

 *  	�ﰢ���� �غ��� ������ ���� �ﰢ������ ó���ǵ��� �ϼ���(2)
 *  	�ﰢ���� ���̰� ������ ���� �ﰢ������ ó���ǵ��� �ϼ���(3)
 *  	=>	������ Ŭ������ �����. Semo1,Semo2,Semo3
 *  ���� 2)
 *  => ���� 1�� �ﰢ�� ��� �簢�� Ŭ���� (Nemo)�� ó���ϼ���.
 */
public class Ex01 {

	public Ex01() {
		//semo1 ���̺�
		Semo1 semo1 = new Semo1(3,5);
		System.out.println(semo1);
		
		Semo1 semo1_2 = new Semo1(5,3);
		System.out.println(semo1_2);
		
		System.out.println(semo1.equals(semo1_2));
		
		//semo2 �غ���
		Semo2 semo2 = new Semo2(3,3);
		System.out.println(semo2);
		
		Semo2 semo2_2 = new Semo2(3,3);
		System.out.println(semo2_2);
		
		System.out.println(semo2.equals(semo2_2));
		
		//semo3 ���̺�
		Semo3 semo3 = new Semo3(3,3);
		System.out.println(semo3);
		
		Semo3 semo3_2 = new Semo3(3,3);
		System.out.println(semo3_2);
		
		System.out.println(semo3.equals(semo3_2));
		
		//�簢�� ���̺�
		Nemo1 n1= new Nemo1(4,5);
		System.out.println(n1);
		
		Nemo1 n1_2 = new Nemo1(5,4);
		System.out.println(n1_2);
		
		System.out.println(n1.equals(n1_2));
		
		//�簢�� �غ���
		Nemo2 n2 = new Nemo2(4,6);
		System.out.println(n2);
		
		Nemo2 n2_2 = new Nemo2(4,7);
		System.out.println(n2_2);
		
		System.out.println(n2.equals(n2_2));
		
		//�簢�� ���� ��
		Nemo3 n3 = new Nemo3(3,7);
		System.out.println(n3);
		
		Nemo3 n3_2 = new Nemo3(2,7);
		System.out.println(n3_2);
		
		System.out.println(n3.equals(n3_2));
		
	}

	public static void main(String[] args) {
		new Ex01();

	}

}
