package day13.ex;
/*
 * 문제2번 
 * 1. 두 변수(int x,int y)를 기억하는 클래스 MyPoint를 작성하고
 * 2. 사용자가 이 클래스를 new 시킬 수 있는 생성자 함수를 만들고
 *  1)기본생성자 함수
 *  2) 두 수를 알려주면 그 수를 x,y에 기억하는 생성자 함수
 *  3)두 수를 배열로 알려주면 
 *    그 수를 x,y에 기억하는 생성자 함수를 만드세요
 * 3. 함수를 추가
 *  1)x값을 세팅해주는 함수
 *  2)y값을 셑이해주는 함수
 *  3)x,y를 동시에 셋팅해주는 함수
 *  4)x값을 꺼내오는 함수
 *  5)y값을 꺼내오는 함수
 *  6)x와 y값을 출력해주는 함수(display)
 */
public class Ex02 {

	public Ex02() {
		MyPoint p1 = new MyPoint();
		p1.display();
		
		// 변수 셋팅
		p1.setX(10);
		System.out.println("p1.x : " + p1.getX());
		
		MyPoint p2 = new MyPoint(3, 5);
		p2.display();
		System.out.println("p1.x : " + p2.getX());
		//배열로 객체만들기
		int[] no = {5,10};
		MyPoint p3 = new MyPoint(no);
		MyPoint p4 = new MyPoint(new int[] {5,10});
		
		p3.display();
		p4.display();
	}	

	public static void main(String[] args) {
		new Ex02();
	}

}
