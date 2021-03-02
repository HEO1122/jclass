package day11.ex;
/* 문4
 * 사각형을 7개를 기억할 변수를 만들고
 * 정보를 출력하는 프로그램을 만드세요
 * 문제3과 동일하게 멤버를 처리하세요
 */
public class Ex04 {
	public Ex04() {
	//사각형 기억할 배열 변수생성
	Sagak[] sagak= new Sagak[7];
	//인스턴스 세팅
	for(int i=0; i<sagak.length; i++) {
		sagak[i]= new Sagak();
	}
	//변수 세팅
	for(int i =0; i<sagak.length;i++) {
		sagak[i].setGS();
		sagak[i].setDool();
		sagak[i].setNulb();
	}
	//출력
	for(Sagak s : sagak) {
		s.print();
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ex04();
	}

}
