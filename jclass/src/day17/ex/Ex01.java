package day17.ex;

/*
 *  문제 1) 
 *  	삼각형의 정보를 기억할 Semo 클래스를 제작하고 
 *  	
 *  //삼각형의 넓이가 같으면 같은 삼각형으로 처리되도록 하세요(1)

 *  	삼각형의 밑변이 같으면 같은 삼각형으로 처리되도록 하세요(2)
 *  	삼각형의 높이가 같으면 같은 삼각형으로 처리되도록 하세요(3)
 *  	=>	각각의 클래스를 만든다. Semo1,Semo2,Semo3
 *  문제 2)
 *  => 문제 1의 삼각형 대신 사각형 클래스 (Nemo)로 처리하세요.
 */
public class Ex01 {

	public Ex01() {
		//semo1 넓이비교
		Semo1 semo1 = new Semo1(3,5);
		System.out.println(semo1);
		
		Semo1 semo1_2 = new Semo1(5,3);
		System.out.println(semo1_2);
		
		System.out.println(semo1.equals(semo1_2));
		
		//semo2 밑변비교
		Semo2 semo2 = new Semo2(3,3);
		System.out.println(semo2);
		
		Semo2 semo2_2 = new Semo2(3,3);
		System.out.println(semo2_2);
		
		System.out.println(semo2.equals(semo2_2));
		
		//semo3 높이비교
		Semo3 semo3 = new Semo3(3,3);
		System.out.println(semo3);
		
		Semo3 semo3_2 = new Semo3(3,3);
		System.out.println(semo3_2);
		
		System.out.println(semo3.equals(semo3_2));
		
		//사각형 넓이비교
		Nemo1 n1= new Nemo1(4,5);
		System.out.println(n1);
		
		Nemo1 n1_2 = new Nemo1(5,4);
		System.out.println(n1_2);
		
		System.out.println(n1.equals(n1_2));
		
		//사각형 밑변비교
		Nemo2 n2 = new Nemo2(4,6);
		System.out.println(n2);
		
		Nemo2 n2_2 = new Nemo2(4,7);
		System.out.println(n2_2);
		
		System.out.println(n2.equals(n2_2));
		
		//사각형 높이 비교
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
