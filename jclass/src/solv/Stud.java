package day11.solv;
public class Stud {
	public String name, id, mail, tel;
	public char gen;
	
	//출력함수
	public void toPrint() {
		System.out.printf("이름: %3s, 아이디 : %-8s, 메일 :  %-20s, 휴대폰 %13s, 성별 : %2s\n",name, id,mail,tel, ((gen == 'M') ? "남자": "여자"));
	}
}
