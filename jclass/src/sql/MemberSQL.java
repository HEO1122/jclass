package sql;
/*
 * ��Ŭ������ ȸ�����̺��� �����ͺ��̽� �۾��� �ʿ���
 * ���Ǹ���� ��Ƴ��� ������ ��û�ϸ� ���Ǹ���� ��ȯ���ִ�
 * ����� ���� Ŭ�����̴�.
 */

public class MemberSQL {
	public final int SEL_ALL = 1001;
	public final int SEL_ID_INFO =1002;
	public final int EDIT_MEMB = 2001;
	
	public final int ADD_MEMB = 3001;
	
	//�ʿ��� ���Ǹ���� ����� ���� �ڵ带 ����� �̶� �ڵ尪�� �ٸ��� �����Ѵ�.
	//�����ڵ忡 �ش��ϴ� ���Ǹ���� case���� �߰����ָ� �ȴ�.
	//���� �ڵ尪�� �ش��ϴ� ���Ǹ���� �䱸�ϸ� 
	//�ش����Ǹ���� ��ȯ���ִ� �Լ�
	public String  getSQL(int code) {
		StringBuffer buff = new StringBuffer();
		switch(code) {
		case SEL_ALL:
			buff.append("SELECT ");
		   buff.append(" MNO,NAME,ID,MAIL,TEL,GEN, AVT ANO,JOINDATE ");
		buff.append("FROM ");
		    buff.append("MEMBER ");
		buff.append("WHERE ");
		    buff.append("ISSHOW ='Y' ");
			break;
		case SEL_ID_INFO:
			buff.append("SELECT ");
		   buff.append(" MNO,NAME,ID,MAIL,TEL,GEN, AVT ANO,JOINDATE ");
		buff.append("FROM ");
		    buff.append("MEMBER ");
		buff.append("WHERE ");
		    buff.append("ISSHOW ='Y' ");
			break;
		case EDIT_MEMB:
			buff.append("update ");
		   buff.append(" member ");
		buff.append("set ");
		   buff.append("avt = ? ");
		buff.append("where ");
		    buff.append("mno =? ");
			
			break;
		case ADD_MEMB:
			buff.append("insert into member ");
		    buff.append("	(mno,name,id,pw,mail,tel,gen,avt) ");
		    buff.append("values( ");
		    buff.append("	(SELECT NVL(MAX(MNO)+1,1001)FROM MEMBER), ");
		    buff.append("	?, ?, ?, ?, ?, ?, ? )");
			
			break;
		}
		return buff.toString();
	}
}
