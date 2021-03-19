package Member.sql;

/**
 * 이 클래스는 회원 정보에 관련된 질의명령을 관리하는 클래스
 * @author 허수경
 * @since 2021.03.19
 *@version v.1.0
 *
 */
public class MemberSQL {
	//사용자가 필요한 질의명령을 요청할 때 사용할 코드변수
	public final int SEL_ID_LIST = 1001; //회원아이디 리스트 출력
	public final int SEL_ID_INFO = 1002; // 회원 아이디 입력후 정보 출력
	public final int SEL_ALL_INFO = 1003;// 모든회원들의 리스트 출력
	
	//수정질의명령 요청 코드
	public final int EDIT_MAIL   = 2001;
	public final int EDIT_AVT   = 2002;	//회원의 아바타 번호를 입력받아서 수정
	public final int EDIT_IDMAIL =2003;//회원 아이디와, 메일을 입력받아서  수정해주는 함수
	//회원 추가 질의명령 요청 코드
	public final int ADD_MEMB   = 3001; //회원 추가
	
	//회원 탈퇴 질의명령 요청 코드
	public final int SEL_MEMB_MNO   = 4001;
	public final int SEL_MEMB_ID   = 4002;
	
	//위의 코드를 입력하면서 호출하면 코드에 맞는 질의명령을 반환해주는 함수
	public String getSQL(int code) {
		StringBuffer buff = new StringBuffer();
		switch(code){
			//모든 아이디 리스트를 보여주는 질의어
			case SEL_ID_LIST:
				buff.append("SELECT ");
				buff.append("	id ");
				buff.append("FROM ");
				buff.append("	member ");
				buff.append("WHERE ");
				buff.append("	isshow ='Y'");
				break;
			//입력한 아이디의 회원정보를 보여주는 질의어
			case SEL_ID_INFO:
				buff.append("SELECT ");
				buff.append("	mno, id, name, mail, tel, gen, avt ano, joindate jdate ");
				buff.append("FROM ");
				buff.append("	member ");
				buff.append("WHERE ");
				buff.append("	isshow ='Y' ");
				buff.append("	AND id = ? ");
				break;
	
			//회원 추가 질의어	
			case ADD_MEMB:
				buff.append("INSERT INTO ");
				buff.append("	member(mno, name, id, pw, mail, tel, gen, avt) ");
				buff.append("VALUES( ");
				buff.append("	(SELECT NVL(MAX(mno) + 1, 1001) FROM member), ");
				buff.append("	?,?,?,?,?,?,? ");
				buff.append(")");
				break;
			//회원의 아바타 번호를 입력받아서 수정
			case EDIT_AVT:
				buff.append("UPDATE ");
				buff.append("	member ");
				buff.append("SET ");
			    buff.append("	avt = ? ");
			    buff.append("WHERE ");
			    buff.append("	id = ? ");
			    break;
		  //회원 아이디와, 메일을 입력받아서  수정
			case  EDIT_IDMAIL:
				buff.append("UPDATE ");
			    buff.append("	member ");
			    buff.append("SET ");
			    buff.append("	mail = ? ");
			    buff.append("WHERE ");
			    buff.append("	id =?");
			    break;
		//모든 회원의 리스트를 출력
			case SEL_ALL_INFO:
				buff.append("SELECT ");
			    buff.append("	 name, id, joindate jdate ");
			    buff.append("FROM ");
			    buff.append("	member ");
			    buff.append("WHERE ");
			    buff.append("	isshow ='Y' ");
			    break;
		}
		return buff.toString();
	}
	
	
}
