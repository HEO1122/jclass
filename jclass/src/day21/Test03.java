package day21;

/*
 * Board객체를 기억할 ArrayList를 만들어서 
 * 게시글을 5개 입력하고
 * 리스트를 출력해보자.
 */
import java.util.*;

public class Test03 {

	public Test03() {
		ArrayList<Board> list = new ArrayList<Board>();
		addBoard(list);
		printList(list);
		//꺼내서 출력
	}
	
	//리스트에 게시글 등록해주는 함수
	public void addBoard(ArrayList<Board> l) {
		Board brd1 = new Board(1000,"kieun","내가첫번째");
		Board brd2 = new Board(1001,"shin", "오늘도 열심히");
		Board brd3 = new Board(1002,"sooyun","오늘도 껌이군");
		Board brd4 = new Board(1003,"soo","오늘은 앞자리");
		Board brd5 = new Board(1004,"gook","할만하군");

		//리스트에 담고
		l.add(brd1);
		l.add(brd2);
		l.add(brd3);
		l.add(brd4);
		l.add(brd5);
	
	}
	//리스트 출력해주는 함수
	public void printList(ArrayList<Board> l) {
		System.out.printf("%4s | %8s | %20s\n","글번호","아이디","글제목");
		System.out.println("---------------------------------------");
		for(int i=0; i<l.size(); i++) {
			//리스트에서 하나꺼내고
			Board brd =l.get(i);
			//내용 출력
			System.out.printf("%6d | %10s | %20s\n",brd.getBno(),brd.getId(),brd.getTitle());
			System.out.println("---------------------------------------");
		}
	}
	public static void main(String[] args) {
	new Test03();
	}

}
