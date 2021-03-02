package day11.ex;
/*
 * 문2 원의 정보를 기억할 클래스(Circle)을 정의하고 
 * 이 클래스를 10개를 관리할 배열을 만들어서
 * 반지름, 둘레, 넓이를 출력하세요 
 */
public class Ex02 {
		public static void main(String[] args) {
	//원 클래스 10개 관리할 배열 만들기
	Circle[] circle = new Circle[10];
	//배열 채워넣기
	for(int i=0; i<circle.length; i++) {
		circle[i]= new Circle();
	}
	//반지름, 둘레, 넓이 출력
//	for(int i=0; i<circle.length; i++) {
//		int ban= circle[i].ban;
//		double dool1 = circle[i].dool;
//		double nulb1 = circle[i].nulb;
//		double dool = circle[i].getDool();
//		double nulb = circle[i].getNulb();
//		System.out.printf("반지름 : %2d,둘레 : %5.2f, 넓이 : %5.2f\n", ban, dool1,nulb1);
		for(Circle c : circle) {
			c.toPrint();
		}
	}
}