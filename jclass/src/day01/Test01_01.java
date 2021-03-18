package ojdbc.day01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Test01_01 {

	public Test01_01() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			System.out.println("*** 드라이버 로딩 성공 ***");
				
			String url = "jdbc:oracle:thin@localhost:1521:xe";
			String id = "SCOTT";
			String pw = "TIGER";
			
			Connection con = DriverManager.getConnection(url, id, pw);
			System.out.println("### scott 계정 접속 성공 #####");
			
			Statement stmt = con.createStatement();
			
			String sql = "SELECT * FROM emp WHERE ename = 'KING'";
			
			ResultSet rs = stmt.executeQuery(sql);
			
			rs.next();
			
			String name = rs.getString("ename");
			int eno = rs.getInt("empno");
			String job = rs.getString("job");
			int mgr = rs.getInt("mgr");
			int sal = rs.getInt("sal");
			int comm = rs.getInt("comm");
			int dno = rs.getInt("deptno");
			
			Date hdate = rs.getDate("hiredate");
			Time htime = rs.getTime("hiredate");
			
			SimpleDateFormat form1 = new SimpleDateFormat("yyyy년MM월dd일");
			SimpleDateFormat form2 = new SimpleDateFormat("HH:mm:ss");
			
			String sdate = form1.format(hdate) + form2.format(htime);
			
			System.out.println("사원번호 : " + eno);
			System.out.println("사원이름 : " + name);
			System.out.println("사원직급 : " + job);
			System.out.println("상사번호 : " + mgr);
			System.out.println("사원급여 : " + sal);
			System.out.println("커 미 션 : " + comm);
			System.out.println("부서번호 : " + dno);
			System.out.println("입 사 일 : " + sdate);
			
			
		} catch(Exception e) {
			e.printStackTrace();
		} 
	}

	public static void main(String[] args) {
		new Test01();

	}

}
