package ojdbc.day02;

/*
 * hello ������ member���̺� �ڿ�� ȸ���� �߰��ϼ���
	  �̸� : �ڿ��
	  ���̵� ; ys
	  ��� : 12345
	  ���� : ys@increpas.com
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
		//����̹� �ε�
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//Ŀ�ؼ� ������
		String url ="jdbc:oracle:thin:@localhost:1521:xe";
		String id ="hello";
		String pw ="increpas";
		con = DriverManager.getConnection(url,id,pw);
		//�� �۾��� �Ϸ�Ǹ� ������ �ϳ� ���� ���°� �ȴ�.
		
		//���Ǹ�� �غ��ϱ�
		StringBuffer buff = new StringBuffer();
		buff.append("insert into member ");
	    buff.append("(mno,name,id,pw,mail,tel,gen,avt) ");
	    buff.append("values( ");
	    buff.append("(SELECT NVL(MAX(MNO)+1,1001)FROM MEMBER), ");
	    buff.append("'�ڿ��','YS',12345, 'YS@INCREPAS.COM','010-8888-8888','M',12) ");
	    
	    String sql = buff.toString();
	    //append�� ���� ���� ���̴� ���� ���̱�
	   //Statement�� ��������
	    stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
	    //���� ��ɺ����� 
	    int cnt = stmt.executeUpdate(sql);
	    
	    if(cnt==1) {
	    	System.out.println("�ڿ�� ȸ���� ������ ���������� ó���Ǿ����ϴ�.");
	    }
	}catch(Exception e) {
		e.printStackTrace();
	}finally {
		//�� �������� ����޴� �ڿ��� ��� ��ȯ�� �־�� �Ѵ�.
		//������ ���� ������ �������� �����Ѵ�.
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
