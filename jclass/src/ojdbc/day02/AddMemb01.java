package ojdbc.day02;

/*
 * member테이블에 회원 한명을 추가해보자
 * 
 */
import java.sql.*;
public class AddMemb01 {
	Connection con;
	Statement stmt;
	PreparedStatement pstmt;
	ResultSet rs;
	
	public AddMemb01() {
	try{
		//드라이버 로딩
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//커넥션 얻어오기
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id ="hello";
		String pw ="increpas";
		con = DriverManager.getConnection(url,id,pw);
		//이 작업이 완료되면 세션을 하나 얻어온 상태가된다.
		
		//질의명령 준비하기
		StringBuffer buff = new StringBuffer();
		buff.append("insert into member(mno,name,id,pw,mail,tel, gen,avt) ");
		buff.append("values( ");
		buff.append("(SELECT NVL(MAX(MNO)+1,1001)FROM MEMBER), ");
		buff.append("'전은석', 'euns','12345', ");
		buff.append("'euns@increpas.com','010-3175-9042','M',11");
		
		String sql = buff.toString();
		//append 는 끝에 공백붙이는 습관 들이기 
		//Statement를 꺼내오고
		stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
		//질의명령 보내고
//		boolean bool = stmt.execute(sql);
		//execute()함수는 반환값이 boolean타입인데 의미는 질의명령의 실행여부를알려주는것이아닌
		//JDBC에서 DBMS에게 질의명령이 전달되었는지 여부를 알려준다.
		
		int cnt = stmt.executeUpdate(sql);
		//executeUpdate()는 정수를 반환해즈눈데
		//반환값의 의미는 변경된 행 수를 반환해준다.
		//update명령의 경우 실행결과 변경된 행 수를 반환해주고 
		//insert 질의 명령의 경우 추가된 행 수(1 , 한번에 한행)를 반환해준다.
		
		//결과 받아서 처리
		if(cnt==1) {
			System.out.println("전은석 회원의 가입이 정상적으로 처리되었습니다.");
		}
	}catch(Exception e) {
		e.printStackTrace();
	}finally {
		//이 블럭에서는 사용했던 자원을 모두 반환해주어야 한다.
		//순서는 만든 순서의 역순으로 진행한다.
		try{
			stmt.close();
			con.close();
		}catch(Exception e) {}
	}
	}

	public static void main(String[] args) {
		new AddMemb01();

	}

}
