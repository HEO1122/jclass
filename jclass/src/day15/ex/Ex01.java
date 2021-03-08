package day15.ex;


//문제 ) Figure 클래스를 상속받은 Semo, Nemo, Won 클래스를 만들고
//* 각 도형의 정보를 출력하세요.
/*
 * 작업순서
 * 1. 상속받은 클래스를 정의한다.
 * 2. 상속받은 클래스의 객체를 만들어서 Figure 클래스의 변수로 받아서 사용한다.
 * 3. 정보를 출력한다.
 */
public class Ex01 {
	
	public Ex01() {
		Figure f1 = new Semo((int)(Math.random()*10 + 1), (int)(Math.random()*10 + 1));
		Figure f2 = new Nemo((int)(Math.random()*10 + 1), (int)(Math.random()*10 + 1));
		Figure f3 = new Won((int)(Math.random()*10 + 1));
		
		//출력
		f1.toPrint();
		f2.toPrint();
		f3.toPrint();
	}

	public static void main(String[] args) {
		new Ex01();

	}

}
