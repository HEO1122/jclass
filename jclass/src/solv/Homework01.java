package day11.solv;
/*
	Stud 클래스(HomeWork01))를 이용해서
	우리반 친구들 5명을 관리할 배열을  만들고
	출력하는 프로그램을 가각 제작하세요.
*/
public class Homework01 {
	public Homework01() {
		//배열변수 준비
		Stud[] stud = new Stud[5];
		//인스턴스 채우고 데이터채우기
		setData(stud);
		//출력한다.
		for(Stud st : stud) {
			st.toPrint();
		}
	}
	
	//배열을 입력하면 배열에 데이터를 채워주는 함수
	public void setData(Stud[] st) {
		//데이터 삽입용 배열을 준비
		String[] name = {"윤태성","최용훈","허수경","최다연","김기은"};
		String[] id = {"tsung","hoon","soo","yun","ki"};
		String[] mail = {"tsung@increpas.com","hoon@increpas.com","soo@increpas.com",
				"yun@increpas.com","ki@increpas.com"};
		String[] tel = {"010-1111-1111","010-2222-2222","010-3333-3333","010-4444-4444","010-5555-5555"};
		char[] gen = {'M','M','F','F','M'};
		
		//먼저 배열에 인스턴스 채우고
		for(int i=0; i<st.length; i++) {
			st[i] = new Stud();
			//데이터 채우기
			st[i].name=name[i];
			st[i].id=id[i];
			st[i].mail=mail[i];
			st[i].tel=tel[i];
			st[i].gen=gen[i];
		}
		
	}
	public static void main(String[] args) {
		
		new Homework01();
	}
}
