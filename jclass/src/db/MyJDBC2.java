package db;
/* 
 * 이 클래스는 앞으로 JDBC 작업을할 때 필요한 나만의 부품을 만들 예정이다.
 * 즉, JDBC작업은 반복적인 작업이 많이 포함되어 있다.
 * 
 * 이 작업을 좀 더 편하게 하기 위해서
 * 나만의 부품을 만들어서 사용할 예정이다.
 * (==> 반복 작업을 자동으로 해주는 기능을 만들예정);
 */
import java.sql.*;
public class MyJDBC2 {
	/*
	 * 누군가 이 부품이 필요해서 new 시키면
	 * 생성자 함수가 실행될 것이고
	 * 1. 나는 그 순간에 드라이버를 로딩하는 작업을 자동으로 해주고 싶다.
	 * 
	 * 2. 누군가 서버주소와 계정이름, 비밀번호를 입력해서 new시키면 그
	 * 정보를 기억하고 드라이버로딩을 하는 작업을 자동으로 하고 싶다.
	 */
	private String url, id, pw;
	public MyJDBC2() {
		//hello계정으로 이 클래스를 객체로 만들어주는 생성자 함수
		this("jdbc:oracle:thin:@localhost:1521:xe", "hello","increpas");
		
	}
	public MyJDBC2(String url, String id, String pw) {
		try{
			//드라이버 로딩하고
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//만약 드라이버 로딩에 실패한 경우는 이 클래스가 쓸모없어지는 경우일 것이다.
			//따라서 url, id, pw 기억하는 작업도 필요없게된다.
			//드라이버가 로딩이 성공하면 기억하도록 코딩하도록 한다.
			this.url =url;
			this.id = id;
			this.pw = pw;	
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	//Connection을 반환해주는 함수
	public Connection getCon() {
		Connection con = null;
		try {
			con = DriverManager.getConnection(url,id,pw);
			
		}catch(Exception e) {
			e.printStackTrace();
		}return con;
		
	}
	//Statement반환해주는 함수
	public Statement getSTMT(Connection con) {
		Statement stmt = null;
		try {
			stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			/*
			 * ResultSet의 타입 A
			 * 1)TYPE_FORWARD_ONLY : scroll이 불가능한 forward only 형
			 * 2)TYPE_SCROLL_INSENSITIVE : scroll은 가능하나 변경된 사항은 적용되지 않음
			 * 3)TYPE_SCROLL_SENSITIVE : scroll은 가능하고 변경된 사항도 적용시킴
			 * 
			 * ResultSet의 타입 B
			 * 1) CONCUR_READ_ONLY : ResultSet의 변경이 불가능
			 * 2) CONCUR_UPDATABLE : ResultSet의 변경이 가능
			 */
		}catch(Exception e) {
			e.printStackTrace();
		}return stmt;
	}
}
