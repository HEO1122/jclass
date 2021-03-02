package day11;

public class Nemo1 {
	public int garo, sero;
	//가로 세로가 랜덤하게 세팅이 되는 기본 생성자
	public Nemo1() {
		//반환값 타입이 없는 것이 생성자 함수
		garo =(int)(Math.random()*15+1);
		sero =(int)(Math.random()*15+1);
	}
	//가로 세로를 이용해서 면적을 반환해주는 함수
	public int getArea() {//이미 객체가 된 이들의 기능실행
		return garo*sero;
	}
}
