package day11;

public class Stud {
	public String name, id, mail, tel;
	public char gen;
	
	public String toString() {
		String str= "이름"+name +"\n아이디 :"+ id+"\n 메일"+mail+
				"\n전화"+ tel +"\n성별"+((gen=='M')?"남자": "여자");
		
		return str;
	}
}
/*이 클래스 처럼 클래스 멤버로 변수들로만 구성된 클래스를 
 * ******
 * VO(Value Object)또는 DTO(Data Transfer Object)라고 부르며
 * 이런 크래스를 사용하는 이유는
 * 데이터를 전달할 목적으로 이런 클래스를 사용한다.
 */
