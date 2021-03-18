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
public class AddYS2 {
	Connection con;
	Statement stmt;
	PreparedStatement pstmt;
	ResultSet rs;
	public AddYS2() {
		
		MemberVO ys = new MemberVO();
		//����� ȸ�� ������ �߰�
		ys.setName("�����");
		ys.setId("kieun");
		ys.setPw("12345");
		ys.setMail("kieun@increaps.com");
		ys.setTel("010-5555-5555");
		ys.setGen("M");
		ys.setAno(13);
		//������ ���̽� �۾�
		try {
			//����̹��ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//Ŀ�ؼ� ������
			String url ="jdbc:oracle:thin:@localhost:1521:xe";
			String id = "hello";
			String pw = "increpas";
			con =DriverManager.getConnection(url,id,pw);
			//���Ǹ�� �ۼ�
			StringBuffer buff = new StringBuffer();
			buff.append("insert into member ");
		    buff.append("	(mno,name,id,pw,mail,tel,gen,avt) ");
		    buff.append("values( ");
		    buff.append("	(SELECT NVL(MAX(MNO)+1,1001)FROM MEMBER), ");
		    buff.append("	?, ?, ?, ?, ?, ?, ? )");
		    String sql =buff.toString();
		    //preparedStatement �غ�
		    pstmt = con.prepareStatement(sql);
		    /*
		     * pstmt�� �����Ϸ��� ���Ǹ���� ������ ������ �ִ�.
		     * ���� ���Ǹ���� ������ ���� 
		     * �����͵��� ä�������� ���Ǹ���� �ϼ��� �� ���̴�.
		     * ���� �ᱹ ���Ǹ���� ������ ������ �����͸� ä���� 
		     * ���Ǹ���� �ϼ������ �Ѵ�.
		     * 
		     */
		    //���Ǹ�ɿϼ��ϱ�(������ ä���)
		    /*
		     * �����͸� ä�� �� ��ġ����?�� ������ ���� �ȴ�.
		     * ������ Ÿ���� �ڹٿ��� ����ϴ� Ÿ���� ����ȴ�.
		     */
		    pstmt.setString(1, ys.getName());
		    pstmt.setString(2, ys.getId());
		    pstmt.setString(3, ys.getPw());
		    pstmt.setString(4, ys.getMail());
		    pstmt.setString(5, ys.getTel());
		    pstmt.setString(6, ys.getGen());
		    pstmt.setInt(7, ys.getAno());
		    
		    //���� ���Ǹ���� �ϼ��� �����Ƿ� �����ϸ� �ȴ�.
		    int cnt = pstmt.executeUpdate();
		    //�̶� pstmt���� �̹� �ϼ��� ���Ǹ���� ��������Ƿ� 
		    //�Լ� ȣ��� ���Ǹ���� �Է����� �ʾƵ� �ȴ�.
		    
		    if(cnt ==1) {
		    	System.out.println("������ ���Լ���##########");
		    }else {
		    	System.out.println("#####���������� ��⸦...");
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
