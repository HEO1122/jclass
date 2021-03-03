package day11.solv;
import java.util.*;
import day11.Student;
/* 
 * 이름 또는 아이디를 입력하면 해당 친구의 정보를 출력해주는 프로그램을
 * 제작하세요
 */
public class Homework02 {
	public Homework02() {
		//배열 준비하고
		Stud02[] stud =getDataArr();
		//실행하면 인스턴스와 데이터 모두 채워서 반환해주는 함수를 이미 만들어 놓았으니 
		//호출만 하면 원하는 스튜던트 배열을 얻을 수 있다.
		
		//출력
		toPrint(stud);
	}
	//실행 처리함수
	public void exec(Stud02[] st) {
		//할일
		//무한반복해서 친구의 이름을 입력할 것인지 아니면 아이디를 입력할 것인지를 입력받는다.
		//이름 입력은 0번 아이디 입력은 1번으로 처리하기로 한다.
		//입력도구 준비
		Scanner sc= new Scanner(System.in);
		
		while(true) {
			//메시지 출력
			System.out.println("이름으로 검색은 0 아이디로 검색은 1을 입력하세요 종료는 9번:");
			int no = sc.nextInt();
			//종료코드검사
			if(no==9) {
				System.out.println("종료");
			//잘못된 입력인지 검사
			if (!(no == 0|| no==1 )) {
				System.out.println("잘못입력했습니다.~");
				continue;
			}
			sc.close();
			switch(no) {
			case 0 :
				//이름으로 검색하는 기능 처리
				nameToInfo(st);
				break;
			case 1://아이디로 검색하는 기능 처리
				idToInfo(st);
				break;
			}
		}
	}
	//배열을 입력해서 실행하면 이름을 입력받아서 해당이름의 학생정보를출력해주는 함수
	public void nameToInfo(Stud02[] st) {
		//입력도구 준비
		Scanner sc = new Scanner(System.in);
		//메시지 출력
		System.out.print("이름입력 : ");
		String name = sc.nextLine();
		
		//각 인덱스의 이름을 비교해서 같은 이름이면 정보를 출력한다.
		for(int i =0; i<st.length;i++) {
			if(st[i].getName().equals(name)) {
				System.out.println(st[i].toString());
				break;
			}
		}
		sc.close();
	}
	//배열을 입력해서 실행하면 아이디를입력받고
	//해당 아이디의 학생정보를 출력해주는 함수
	
	public void idToInfo(Student[] st) {
		Scanner sc = new Scanner(System.in);
		//메시지 출력
		System.out.print("아이디입력 : ");
		String name = sc.nextLine();
		
		//각 인덱스의 이름을 비교해서 같은 이름이면 정보를 출력한다.
		for(int i =0; i<st.length;i++) {
			if(st[i].getId().equals(Id)) {
				System.out.println(st[i].toString());
				break;
			}
		}
		sc.close();
	}	
	}
	public static void main(String[] args) {
		new Homework01();
	}
	
	//인스턴스와 데이터 채워주는 함수
	public Stud02[] getDataArr() {
		//반환값 변수 만들고
		Stud02[] st = new Stud02[5];
		
		for(int i =0; i<st.length; i++) {
			st[i]= new Stud02();
		}
		//데이터 삽입용 배열을 준비
		String[] name = {"윤태성","최용훈","허수경","최다연","김기은"};
		String[] id = {"tsung","hoon","soo","yun","ki"};
		String[] mail = {"tsung@increpas.com","hoon@increpas.com","soo@increpas.com",
				"yun@increpas.com","ki@increpas.com"};
		String[] tel = {"010-1111-1111","010-2222-2222","010-3333-3333","010-4444-4444","010-5555-5555"};
		char[] gen = {'M','M','F','F','M'};
		
		//데이터 채우고
		for(int i =0; i<st.length; i++) {
			String irum =name[i];
			String aidi =id[i];
			String juso= mail[i];
			String hp = tel [i];
			char gender = gen[i];
			
			st[i].setId(aidi);
			st[i].setName(name[i]);
			st[i].setMail(juso);
			st[i].setTel(hp);
			st[i].setGen(gender);
		}
		//완성된 배열 반환
		return st;
}
	//출력용 함수
	public void toPrint(Stud02[] st) {
		for(int i=0; i<st.length; i++) {
			System.out.println(st[i].toString());
		}
	}//함수 오버로딩 ( 매개변수 갯수가 다름)
	public void toPrint(Stud02[] st, int idx) {
		System.out.println(st[idx].toString());
		
	}
	
//	public String toPrint(Stud02[] st) { 매개변수 리스트의 형태가 같기 때문에 안된다.
//		String str = "";
//		return str;
	}
