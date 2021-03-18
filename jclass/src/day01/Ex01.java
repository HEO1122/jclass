package ojdbc.day01;

import java.sql.DriverManager;
import java.sql.Date;
import java.util.*;
import java.text.*;
/*
scott 계정에 접속해서 
emp 테이블에 저장된 사원중
급여가 제일 높은 사원의 
	사원번호, 사원이름, 직급, 급여, 입사일, 부서번호
를 조회하세요.
*/
import java.sql.*;

public class Ex01 {

	public Ex01() {
	try {
		//드라이버 로딩
		Class.forName("oracle.jdbc.driver.OracleDriver");
		/*
		 * 해당 드라이버를 이용해서 연결을 시도한다.
		 */
		System.out.println("***드라이버 로딩 성공");
		
		//2. 접속시도
		String url ="jdbc:oracle:thin:@localhost:1521:xe";
		//url 역시 데이터베이스마다 조금씩 달라진다.
		String id = "SCOTT";
		String pw = " TIGER";
		
		Connection con =DriverManager.getConnection(url, id,pw);
		System.out.println("#####scott계정 접속 성공####");
		/*
		 * 이처럼 접속을 하면
		 * 접속자를 관리하는 세션을 제공하게 된다.
		 * 이 세션을 관리하는 클래스가Connection이다.
		 * 
		 * 여기까지는 데이터베이스마다 조금씩 다른 내용이다.
		 * 
		 * 이 이후 부터는 항상 동일한 방식으로
		 * JDBC에게 명령을 내리면
		 * JDBC가 알아서 해당 DBMS에게 명령을 전달한다.
		 */
		//질의명령을 보내보자
		//SCOTT사원의 정보를 조회해서 출력해보자
		/*
		 * JDBC에게 질의명령을 전달 할 때는 statement로 전달해야 한다.
		 * 
		 */
		Statement stmt = con.createStatement();
		//이제 질의명령을 담아서 보낼 도구가 준비가 되어있따.
		
		//질의명령 작성
//		급여가 제일 높은 사원의 사원번호, 사원이름, 직급, 급여, 입사일, 부서번호
		String sql ="SELECT EMPNO, ENAME, JOB, SAL, HIREDATE, DEPTNO FROM EMP,(SELECT MAX(SAL) MAX FROM EMP)WHERE SAL =MAX";
		ResultSet rs =stmt.executeQuery(sql);//Statement에 질의 명령을 실어서 JDBC에 전달한다.
		/*
		 * 참고)ResultSet
		 * =>조회질의명령(SELECT명령)의 조회 결과를 관리하는 클래스
		 */
		//데이터를 꺼내서
		//먼저 데이터를 꺼낼 행으로 이동해야 한다.
		//명령)rs.next();
		rs.next();
		int eno =rs.getInt("empno");
		String name =rs.getString("ENAME");
		String job =rs.getString("job");
		int sal = rs.getInt("sal");
		int deptno = rs.getInt("deptno");
		//jdbc에서는 날짜와 시간을 따로 꺼내도록 함수들이 만들어져있다.
		Date hdate =rs.getDate("hiredate");
		Time htime = rs.getTime("hiredate");
		//날짜 데이터를 문자열로 반환해준다.
		SimpleDateFormat form1 = new SimpleDateFormat("yyyy년 MM월 dd일");
		SimpleDateFormat form2 = new SimpleDateFormat("HH:mm:ss");
		String sdate = form1.format(hdate)+form2.format(htime);
		
		//출력한다.
		System.out.println("사원번호 : "+ eno);
		System.out.println("사원이름 : "+ name);
		System.out.println("사원직급 : "+ job);
		System.out.println("사원급여 : "+ sal);
		System.out.println("부서번호 : "+ deptno);
		System.out.println("입사일 : "+ sdate);

		}catch(Exception e) {
			e.printStackTrace();	
		}
		
	}

	public static void main(String[] args) {
		new Ex01();

	}

}
