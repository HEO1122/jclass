package ojdbc.day01;

import java.sql.DriverManager;
import java.sql.Date;
import java.util.*;
import java.text.*;
/*
scott ������ �����ؼ� 
emp ���̺� ����� �����
�޿��� ���� ���� ����� 
	�����ȣ, ����̸�, ����, �޿�, �Ի���, �μ���ȣ
�� ��ȸ�ϼ���.
*/
import java.sql.*;

public class Ex01 {

	public Ex01() {
	try {
		//����̹� �ε�
		Class.forName("oracle.jdbc.driver.OracleDriver");
		/*
		 * �ش� ����̹��� �̿��ؼ� ������ �õ��Ѵ�.
		 */
		System.out.println("***����̹� �ε� ����");
		
		//2. ���ӽõ�
		String url ="jdbc:oracle:thin:@localhost:1521:xe";
		//url ���� �����ͺ��̽����� ���ݾ� �޶�����.
		String id = "SCOTT";
		String pw = " TIGER";
		
		Connection con =DriverManager.getConnection(url, id,pw);
		System.out.println("#####scott���� ���� ����####");
		/*
		 * ��ó�� ������ �ϸ�
		 * �����ڸ� �����ϴ� ������ �����ϰ� �ȴ�.
		 * �� ������ �����ϴ� Ŭ������Connection�̴�.
		 * 
		 * ��������� �����ͺ��̽����� ���ݾ� �ٸ� �����̴�.
		 * 
		 * �� ���� ���ʹ� �׻� ������ �������
		 * JDBC���� ����� ������
		 * JDBC�� �˾Ƽ� �ش� DBMS���� ����� �����Ѵ�.
		 */
		//���Ǹ���� ��������
		//SCOTT����� ������ ��ȸ�ؼ� ����غ���
		/*
		 * JDBC���� ���Ǹ���� ���� �� ���� statement�� �����ؾ� �Ѵ�.
		 * 
		 */
		Statement stmt = con.createStatement();
		//���� ���Ǹ���� ��Ƽ� ���� ������ �غ� �Ǿ��ֵ�.
		
		//���Ǹ�� �ۼ�
//		�޿��� ���� ���� ����� �����ȣ, ����̸�, ����, �޿�, �Ի���, �μ���ȣ
		String sql ="SELECT EMPNO, ENAME, JOB, SAL, HIREDATE, DEPTNO FROM EMP,(SELECT MAX(SAL) MAX FROM EMP)WHERE SAL =MAX";
		ResultSet rs =stmt.executeQuery(sql);//Statement�� ���� ����� �Ǿ JDBC�� �����Ѵ�.
		/*
		 * ����)ResultSet
		 * =>��ȸ���Ǹ��(SELECT���)�� ��ȸ ����� �����ϴ� Ŭ����
		 */
		//�����͸� ������
		//���� �����͸� ���� ������ �̵��ؾ� �Ѵ�.
		//���)rs.next();
		rs.next();
		int eno =rs.getInt("empno");
		String name =rs.getString("ENAME");
		String job =rs.getString("job");
		int sal = rs.getInt("sal");
		int deptno = rs.getInt("deptno");
		//jdbc������ ��¥�� �ð��� ���� �������� �Լ����� ��������ִ�.
		Date hdate =rs.getDate("hiredate");
		Time htime = rs.getTime("hiredate");
		//��¥ �����͸� ���ڿ��� ��ȯ���ش�.
		SimpleDateFormat form1 = new SimpleDateFormat("yyyy�� MM�� dd��");
		SimpleDateFormat form2 = new SimpleDateFormat("HH:mm:ss");
		String sdate = form1.format(hdate)+form2.format(htime);
		
		//����Ѵ�.
		System.out.println("�����ȣ : "+ eno);
		System.out.println("����̸� : "+ name);
		System.out.println("������� : "+ job);
		System.out.println("����޿� : "+ sal);
		System.out.println("�μ���ȣ : "+ deptno);
		System.out.println("�Ի��� : "+ sdate);

		}catch(Exception e) {
			e.printStackTrace();	
		}
		
	}

	public static void main(String[] args) {
		new Ex01();

	}

}
