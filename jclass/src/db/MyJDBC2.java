package db;
/* 
 * �� Ŭ������ ������ JDBC �۾����� �� �ʿ��� ������ ��ǰ�� ���� �����̴�.
 * ��, JDBC�۾��� �ݺ����� �۾��� ���� ���ԵǾ� �ִ�.
 * 
 * �� �۾��� �� �� ���ϰ� �ϱ� ���ؼ�
 * ������ ��ǰ�� ���� ����� �����̴�.
 * (==> �ݺ� �۾��� �ڵ����� ���ִ� ����� ���鿹��);
 */
import java.sql.*;
public class MyJDBC2 {
	/*
	 * ������ �� ��ǰ�� �ʿ��ؼ� new ��Ű��
	 * ������ �Լ��� ����� ���̰�
	 * 1. ���� �� ������ ����̹��� �ε��ϴ� �۾��� �ڵ����� ���ְ� �ʹ�.
	 * 
	 * 2. ������ �����ּҿ� �����̸�, ��й�ȣ�� �Է��ؼ� new��Ű�� ��
	 * ������ ����ϰ� ����̹��ε��� �ϴ� �۾��� �ڵ����� �ϰ� �ʹ�.
	 */
	private String url, id, pw;
	public MyJDBC2() {
		//hello�������� �� Ŭ������ ��ü�� ������ִ� ������ �Լ�
		this("jdbc:oracle:thin:@localhost:1521:xe", "hello","increpas");
		
	}
	public MyJDBC2(String url, String id, String pw) {
		try{
			//����̹� �ε��ϰ�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//���� ����̹� �ε��� ������ ���� �� Ŭ������ ����������� ����� ���̴�.
			//���� url, id, pw ����ϴ� �۾��� �ʿ���Եȴ�.
			//����̹��� �ε��� �����ϸ� ����ϵ��� �ڵ��ϵ��� �Ѵ�.
			this.url =url;
			this.id = id;
			this.pw = pw;	
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	//Connection�� ��ȯ���ִ� �Լ�
	public Connection getCon() {
		Connection con = null;
		try {
			con = DriverManager.getConnection(url,id,pw);
			
		}catch(Exception e) {
			e.printStackTrace();
		}return con;
		
	}
	//Statement��ȯ���ִ� �Լ�
	public Statement getSTMT(Connection con) {
		Statement stmt = null;
		try {
			stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			/*
			 * ResultSet�� Ÿ�� A
			 * 1)TYPE_FORWARD_ONLY : scroll�� �Ұ����� forward only ��
			 * 2)TYPE_SCROLL_INSENSITIVE : scroll�� �����ϳ� ����� ������ ������� ����
			 * 3)TYPE_SCROLL_SENSITIVE : scroll�� �����ϰ� ����� ���׵� �����Ŵ
			 * 
			 * ResultSet�� Ÿ�� B
			 * 1) CONCUR_READ_ONLY : ResultSet�� ������ �Ұ���
			 * 2) CONCUR_UPDATABLE : ResultSet�� ������ ����
			 */
		}catch(Exception e) {
			e.printStackTrace();
		}return stmt;
	}
}
