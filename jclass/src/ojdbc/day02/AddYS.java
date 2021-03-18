package ojdbc.day02;

/*
 * hello 계정의 member테이블에 박용수 회원을 추가하세요
	  이름 : 박용수
	  아이디 ; ys
	  비번 : 12345
	  메일 : ys@increpas.com
	  tel : 010-8888-8888
	  gen ;'M'
	  avt : 12
 */
import java.sql.*;
public class AddYS {
	Connection con;
	Statement stmt;
	PreparedStatement pstmt;
	ResultSet rs;
	public AddYS() {
		
	try{
		//드라이버 로딩
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//커넥션 얻어오기
		String url ="jdbc:oracle:thin:@localhost:1521:xe";
		String id ="hello";
		String pw ="increpas";
		con = DriverManager.getConnection(url,id,pw);
		//이 작업이 완료되면 세션을 하나 얻어온 상태가 된다.
		
		//질의명령 준비하기
		StringBuffer buff = new StringBuffer();
		buff.append("insert into member ");
	    buff.append("(mno,name,id,pw,mail,tel,gen,avt) ");
	    buff.append("values( ");
	    buff.append("(SELECT NVL(MAX(MNO)+1,1001)FROM MEMBER), ");
	    buff.append("'박용수','YS',12345, 'YS@INCREPAS.COM','010-8888-8888','M',12) ");
	    
	    String sql = buff.toString();
	    //append는 끝에 공백 붙이는 습관 들이기
	   //Statement를 꺼내오고
	    stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
	    //질의 명령보내고 
	    int cnt = stmt.executeUpdate(sql);
	    
	    if(cnt==1) {
	    	System.out.println("박용수 회원의 가입이 정상적으로 처리되었습니다.");
	    }
	}catch(Exception e) {
		e.printStackTrace();
	}finally {
		//이 블럭에서는 사용햇던 자원을 모두 반환해 주어야 한다.
		//순서는 만든 순서의 역순으로 진행한다.
		try {
			stmt.close();
			con.close();
		}catch(Exception e) {}
	}
	}
		

	public static void main(String[] args) {
	new AddYS();

	}

}
