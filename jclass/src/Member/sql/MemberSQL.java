package Member.sql;

/**
 * �� Ŭ������ ȸ�� ������ ���õ� ���Ǹ���� �����ϴ� Ŭ����
 * @author �����
 * @since 2021.03.19
 *@version v.1.0
 *
 */
public class MemberSQL {
	//����ڰ� �ʿ��� ���Ǹ���� ��û�� �� ����� �ڵ庯��
	public final int SEL_ID_LIST = 1001; //ȸ�����̵� ����Ʈ ���
	public final int SEL_ID_INFO = 1002; // ȸ�� ���̵� �Է��� ���� ���
	public final int SEL_ALL_INFO = 1003;// ���ȸ������ ����Ʈ ���
	
	//�������Ǹ�� ��û �ڵ�
	public final int EDIT_MAIL   = 2001;
	public final int EDIT_AVT   = 2002;	//ȸ���� �ƹ�Ÿ ��ȣ�� �Է¹޾Ƽ� ����
	public final int EDIT_IDMAIL =2003;//ȸ�� ���̵��, ������ �Է¹޾Ƽ�  �������ִ� �Լ�
	//ȸ�� �߰� ���Ǹ�� ��û �ڵ�
	public final int ADD_MEMB   = 3001; //ȸ�� �߰�
	
	//ȸ�� Ż�� ���Ǹ�� ��û �ڵ�
	public final int SEL_MEMB_MNO   = 4001;
	public final int SEL_MEMB_ID   = 4002;
	
	//���� �ڵ带 �Է��ϸ鼭 ȣ���ϸ� �ڵ忡 �´� ���Ǹ���� ��ȯ���ִ� �Լ�
	public String getSQL(int code) {
		StringBuffer buff = new StringBuffer();
		switch(code){
			//��� ���̵� ����Ʈ�� �����ִ� ���Ǿ�
			case SEL_ID_LIST:
				buff.append("SELECT ");
				buff.append("	id ");
				buff.append("FROM ");
				buff.append("	member ");
				buff.append("WHERE ");
				buff.append("	isshow ='Y'");
				break;
			//�Է��� ���̵��� ȸ�������� �����ִ� ���Ǿ�
			case SEL_ID_INFO:
				buff.append("SELECT ");
				buff.append("	mno, id, name, mail, tel, gen, avt ano, joindate jdate ");
				buff.append("FROM ");
				buff.append("	member ");
				buff.append("WHERE ");
				buff.append("	isshow ='Y' ");
				buff.append("	AND id = ? ");
				break;
	
			//ȸ�� �߰� ���Ǿ�	
			case ADD_MEMB:
				buff.append("INSERT INTO ");
				buff.append("	member(mno, name, id, pw, mail, tel, gen, avt) ");
				buff.append("VALUES( ");
				buff.append("	(SELECT NVL(MAX(mno) + 1, 1001) FROM member), ");
				buff.append("	?,?,?,?,?,?,? ");
				buff.append(")");
				break;
			//ȸ���� �ƹ�Ÿ ��ȣ�� �Է¹޾Ƽ� ����
			case EDIT_AVT:
				buff.append("UPDATE ");
				buff.append("	member ");
				buff.append("SET ");
			    buff.append("	avt = ? ");
			    buff.append("WHERE ");
			    buff.append("	id = ? ");
			    break;
		  //ȸ�� ���̵��, ������ �Է¹޾Ƽ�  ����
			case  EDIT_IDMAIL:
				buff.append("UPDATE ");
			    buff.append("	member ");
			    buff.append("SET ");
			    buff.append("	mail = ? ");
			    buff.append("WHERE ");
			    buff.append("	id =?");
			    break;
		//��� ȸ���� ����Ʈ�� ���
			case SEL_ALL_INFO:
				buff.append("SELECT ");
			    buff.append("	 name, id, joindate jdate ");
			    buff.append("FROM ");
			    buff.append("	member ");
			    buff.append("WHERE ");
			    buff.append("	isshow ='Y' ");
			    break;
		}
		return buff.toString();
	}
	
	
}
