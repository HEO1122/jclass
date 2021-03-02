package day11.ex;
/*문3
 * ㅅㅏㅁ각형을 5개를 기억할 배열을 만들고
 * 각 삼각형의 정보를 출력하세요
 * 단, 삼각형의 가로 세로 세팅은 함수로 각각 처리하세요.
 * (=> 생성자에서 처리하지 않도록 하세요.)
 * 출력함수도 삼각형클래스에서 출력함수를 정의해 놓고
 * 함수를 호출해서 처리하도록 하세요.
 */
public class Ex03 {
	public Ex03() {
		//배열 만들기
		Sam[] sam = new Sam[5];
		
		//삼각형 인스턴스셋팅
		for(int i=0; i<sam.length; i++) {
			sam[i] = new Sam();
		}
		//변수셋팅
		for(int i=0; i<sam.length; i++) {
			sam[i].samSet();
			sam[i].nulbSet();
		}
		
		//출력
		for(Sam s : sam) {
			s.print();
		}
	}
	
	public static void main(String[] args) {
		new Ex03();

	}

}
