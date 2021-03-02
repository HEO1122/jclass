package day11.ex;
/*
 * 문5 원의 정보를 5개 기억할 배열을 만들어서 정보를 출력해주는 프로그램을 작성하세요
 * 멤버처리는 문3과 동일하게 하세요
 */
public class Ex05 {
	public Ex05() {
	//5개 배열 만들기
	Won[] won = new Won[5];
	//배열에 인스턴스 세팅
	for(int i =0; i<won.length;i++) {
		won[i]= new Won();
	}
	//인스턴스 채우기
	for(int i=0; i<won.length; i++) {
		won[i].radSet();
		won[i].doolSet();
		won[i].nulbSet();
		won[i].print();
	}
//	//출력
//	for(Won w : won) {
//		w.print();
//	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ex05();
	}
}
