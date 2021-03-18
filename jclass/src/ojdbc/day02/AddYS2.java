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
public class AddYS2 {
	Connection con;
	Statement stmt;
	PreparedStatement pstmt;
	ResultSet rs;
	public AddYS2() {
		
		MemberVO ys = new MemberVO();
		//김기은 회원 데이터 추가
		ys.setName("김기은");
		ys.setId("kieun");
		ys.setPw("12345");
		ys.setMail("kieun@increaps.com");
		ys.setTel("010-5555-5555");
		ys.setGen("M");
		ys.setAno(13);
		//데이터 베이스 작업
		try {
			//드라이버로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//커넥션 얻어오기
			String url ="jdbc:oracle:thin:@localhost:1521:xe";
			String id = "hello";
			String pw = "increpas";
			con =DriverManager.getConnection(url,id,pw);
			//질의명령 작성
			StringBuffer buff = new StringBuffer();
			buff.append("insert into member ");
		    buff.append("	(mno,name,id,pw,mail,tel,gen,avt) ");
		    buff.append("values( ");
		    buff.append("	(SELECT NVL(MAX(MNO)+1,1001)FROM MEMBER), ");
		    buff.append("	?, ?, ?, ?, ?, ?, ? )");
		    String sql =buff.toString();
		    //preparedStatement 준비
		    pstmt = con.prepareStatement(sql);
		    /*
		     * pstmt는 전달하려는 질의명령의 구조만 가지고 있다.
		     * 따라서 질의명령을 실행할 때는 
		     * 데이터들이 채워져야지 질의명령이 완성이 될 것이다.
		     * 따라서 결국 질의명령을 보내기 직전에 데이터를 채워서 
		     * 질의명령을 완성싴줘야 한다.
		     * 
		     */
		    //질의명령완성하기(데이터 채우기)
		    /*
		     * 데이터를 채울 때 위치값은?의 순서를 쓰면 된다.
		     * 데이터 타입은 자바에서 사용하는 타입을 쓰면된다.
		     */
		    pstmt.setString(1, ys.getName());
		    pstmt.setString(2, ys.getId());
		    pstmt.setString(3, ys.getPw());
		    pstmt.setString(4, ys.getMail());
		    pstmt.setString(5, ys.getTel());
		    pstmt.setString(6, ys.getGen());
		    pstmt.setInt(7, ys.getAno());
		    
		    //이제 질의명령이 완성이 됐으므로 전달하면 된다.
		    int cnt = pstmt.executeUpdate();
		    //이때 pstmt에는 이미 완성된 질의명령이 들어있으므로 
		    //함수 호출시 질의명령을 입력하지 않아도 된다.
		    
		    if(cnt ==1) {
		    	System.out.println("막둥이 가입성공##########");
		    }else {
		    	System.out.println("#####막둥이한테 용기를...");
		    }
		}catch(Exception e) {
			e.printStackTrace();
			
		}finally {
			try {
				pstmt.close();
				con.close();
			}catch(Exception e) {}
		}
	}
		

	public static void main(String[] args) {
		new AddYS2();

	}

}
