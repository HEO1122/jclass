package Member.dao;
/**
 * �� Ŭ������ ȸ���� ���õ� �����ͺ��̽� �۾��� �����ؼ� ó���ϴ� Ŭ����
 * @author class02
 *
 */
import java.util.*;
import java.sql.*;
import db.*;
import Member.sql.*;
import Member.vo.*;
public class MemberDao {
	//�� Ŭ������ ������ ���̽� �۾����� Ŭ�����̱⶧����
	// ��Ŭ������ ��ü�� �Ǵ� ���� �����ͺ��̽� �۾��� �� �غ� �Ǿ��־�߰ڵ�.
	private MyJDBC db;
	private Connection con;
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	//���Ǹ�� Ŭ���� 
	private MemberSQL mSQL;
	
	public MemberDao() {
		db =new MyJDBC();
		//�̷��� MyJDBC �����ڸ� ȣ���ϴ� ����
		//����Ŭ ����̹��� �ε��� �������°� �ȴ�.
		
		//���� ���Ǹ���� ����� �� �ֵ��� ���Ǹ�� Ŭ������ �޸𸮿� �ø���.
		mSQL =new MemberSQL();
		
	}
	
	//ȸ������ ���̵� ����Ʈ ��ȸ ���� ó���Լ�
	public ArrayList<String> getIdList(){
		//��ȯ�� ����
		ArrayList<String> list = new ArrayList<String>();
		/*
		 * �� �Լ��� ����Ŭ�� �����ؼ� 
		 * ȸ���� ���̵� ��ȸ�ؼ� 
		 * �� ����� ��ȯ���ִ� �Լ�
		 * ���� �����ͺ��̽� �۾��� �ؾ� �ϴµ�
		 * 1. ���� ������ �ϰ� 
		 * 2. ���Ǹ���� �����ͼ� 
		 * 3. Statement�� �Ǿ 
		 * 4. jdbc���� �����ϸ� 
		 * 5. ����� ��ȯ�����ٵ� �� ����� �޾Ƽ� ��ȯ���ָ� �ȴ�.
		 * 
		 */
		//1. ����
		con = db.getCon(); // ����Ŭ�� ������ �ϳ� ���� ����
		//2. ���Ǹ��
		String sql = mSQL.getSQL(mSQL.SEL_ID_LIST);
		/*
		 * ���Ǹ���� MemberSQL Ŭ������ ��� ����� �װ�
		 * �ʿ��� ���Ǹ���� ��û�� �ϸ� ��ȯ�� ���� ���̴�.
		 * �̶� �ʿ��� ���Ǹ�� �ڵ� ���� MemberSQL�ȿ� ����������
		 * ������ ����ϱ⸸ �ϸ�ȴ�.
		 */
		//���Ǹ�ɿ� ? (ä���� �� ������)�� �����Ƿ� Statement�� ó���Ѵ�.
		stmt = db.getSTMT(con);
		
		try {
			//���� �ʿ��� ���Ǹ���� �̹� �ϼ��� ������ ���Ǹ���̱� ������
			//���Ǹ���� �����͸� ä���� �ϼ��ϴ� �۾��� �ʿ����� �ʴ�.
			//���Ǹ���� ������ ��� �ް�...
			//�غ�� ������ ��� �޴´�.
			rs = stmt.executeQuery(sql);
			/*
			 * Statement�� ���ο� ���Ǹ���� ������� �ʰ� �ֱ� ������
			 * ���Ǹ���� �Ǿ jdbc���� ������ �ϰ�
			 * Prepared Statement�� ���� ���鶧 ���Ǹ���� ������ �����ͼ� 
			 * ��������Ƿ� �̹� ���ο� ���Ǹ���� ����ִ�.
			 * ���� �Ǿ ������ �ʾƵ� �ȴ�.
			 */
			/*
			 * ResultSet�� �ζ������̺��� ������ �� ���ڵ������Ͱ� BOF�� �ְ�
			 * ���� �����͸� ���� �� ���� �����̴�.
			 * �׷��� �츮�� ���ڵ������͸� ���� ������ �� ���� �������ʵ���
			 * �����͸� ���¾���.
			 * 
			 * �� �� rs.next() �Լ��� ȣ���ؼ� ���ڵ� �����͸� ���� ������ ���Ⱦ��µ�
			 * next()�Լ��� ��ȯ���� booleanŸ���̴�.
			 * �ǹ̴� ���� ������ �����µ� �����ϸ� true�� ��ȯ���ְ�
			 * 								�����ϸ� false�� ��ȯ�Ѵ�.
			 * 
			 * ���� ���Ǹ���� ����� ����������(����������) �߻��ϴ� ����
			 * �ݺ������� ó���ؾ� ���ٵ� �� �� �ݺ����� ���ǽĿ� next()�Լ��� ����ϸ� 
			 * �ɰ��̴�.
			 * 
			 */
			while(rs.next()) {
				//EOF�� �̵��ϴ¼��� �� �ݺ����� ���ᰡ �ȴ�.
				//�� �ݺ����� ���Ǹ���� ��� ������� ȸ������
				//���̵� ����Ʈ�� ����۾��� �ϴ� �ݺ����̴�.
				
				//������ ������
				String sid = rs.getString("id");
				//����Ʈ�� ���̵� ���
				list.add(sid);
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			db.close(rs);
			db.close(stmt);
			db.close(con);
		}
		
		//������ ��ȯ
		return list;
	}
	
	//���̵��Է¹޾Ƽ� ȸ������ ��ȸ ���� ó�� �Լ�
	public MemberVO getMemberInfo(String id) {
		//��ȯ�� ����
		MemberVO mVO = new MemberVO();
		System.out.println("dao id : " + id);
		//1. Ŀ�ؼ� ������
		con = db.getCon();
		
		//2. ���Ǹ�� ��������
		String sql = mSQL.getSQL(mSQL.SEL_ID_INFO);
		System.out.println("sql : " + sql);
		//3. PreparedStatement �������� 
		pstmt = db.getPSTMT(con, sql);
		
		//���� �� ���´� ���Ǹ���� �ϼ����� ���� �����̹Ƿ�
		//���Ǹ���� �ϼ����ش�.
		try {
			//������ ä���� ���Ǹ�� �ϼ�
			pstmt.setString(1, id);
			//���� ���Ǹ���� �ϼ��� �ư� ������ ����� ����.
			rs = pstmt.executeQuery();
			//���ڵ� �����͸� BOF���� ���� ������.
			rs.next();
			//������ ������ VO�� ���
			mVO.setMno(rs.getInt("mno"));
			mVO.setName(rs.getString("name"));
			mVO.setId(rs.getString("id"));
			mVO.setMail(rs.getString("mail"));
			mVO.setTel(rs.getString("tel"));
			mVO.setGen(rs.getString("gen").equals("M")?"����":"����");
			mVO.setAno(rs.getInt("ano"));
			mVO.setJdate(rs.getDate("jdate"));
			mVO.setJtime(rs.getTime("jdate"));
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			db.close(rs);
			db.close(pstmt);
			db.close(con);
		}
		
		//������ ��ȯ
		return mVO;
	}
	
	//ȸ������Ʈ �����Լ�
	public ArrayList<MemberVO> getAllInfo() {
		//��ȯ�� ����
		ArrayList<MemberVO> list = new ArrayList<MemberVO>();
		
		//1. Ŀ�ؼ� ������
		con = db.getCon();
		
		//2. ���Ǹ�� ��������
		String sql = mSQL.getSQL(mSQL.SEL_ALL_INFO);
		
		//���Ǹ�ɿ� ?ä������ �����Ͱ� �����Ƿ� Statement�� ó���Ѵ�.
		stmt =db.getSTMT(con);
		
		try {
			//�غ�� ������ ��� �ޱ�
			rs =stmt.executeQuery(sql);
			
			while(rs.next()) {
				MemberVO mVO = new MemberVO();
				mVO.setName(rs.getString("name"));
				mVO.setId(rs.getString("id"));
				mVO.setJdate(rs.getDate("jdate"));
				mVO.setJtime(rs.getTime("jdate"));
				
				list.add(mVO);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			db.close(rs);
			db.close(stmt);
			db.close(con);
		}
		
		return list;
	}
	
	//ȸ������ �Է¹޾Ƽ� �߰� �Լ�
	public int addMemb(MemberVO mVO) {
		//1. Ŀ�ؼ� ������
		con =db.getCon();
		//2. ���Ǹ�ɾ� ��������
		String sql = mSQL.getSQL(mSQL.ADD_MEMB);
		
		//3. ���Ǹ�ɴ��� PreparedStatement�غ�
		pstmt = db.getPSTMT(con, sql);
		int cnt = 0;
		try {
				//ȸ�� ������ �����Է� name, id, pw, mail, tel, gen, avt ano
				pstmt.setString(1,mVO.getName());
				pstmt.setString(2,  mVO.getId());
				pstmt.setString(3, mVO.getPw());
				pstmt.setString(4, mVO.getMail());
				pstmt.setString(5, mVO.getTel());
				pstmt.setString(6, mVO.getGen());
				pstmt.setInt(7, mVO.getAno());
				
				//���� ����� �ϼ��Ǿ����Ƿ� ����
				cnt = pstmt.executeUpdate();
				//�̶� pstmt���� �̹� �ϼ��� ���� ����� ��������Ƿ� 
				//�Լ� ȣ�� �� ���Ǹ���� �Է����� �ʾƵ� �ȴ�.
				
			}catch(Exception e) {
				e.printStackTrace();	
			}finally {
				try {
					db.close(pstmt);
					db.close(con);
				}catch(Exception e) {}
			}
		return cnt;
	}
	
	//���̵� �Է� �޾Ƽ� ���� �����Լ�
	public int editMail(String id, String mail) {
		//��ȯ�� ����
		int cnt = 0;
		MemberVO mVO = new MemberVO();
		
		//1. Ŀ�ؼ� ������
		con = db.getCon();
		
		//2. ���Ǹ�� ��������
		String sql = mSQL.getSQL(mSQL.EDIT_IDMAIL);
		
		//3.PreparedStatement ��������
		pstmt =db.getPSTMT(con, sql);
		//���Ǹ�� �ϼ�
		try {
			//������ ä���� ���Ǹ�� �ϼ�
			pstmt.setString(1, mail);
			pstmt.setString(2, id);
			//���� ���Ǹ���� �ϼ��� �ư� ������ ����� ����
			cnt = pstmt.executeUpdate();
		/*
			//���ڵ� �����͸� BOF���� ���� ������
			rs.next();
			//������ ������ VO�� ���
			mVO.setMail(rs.getString("mail"));
		*/
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			db.close(rs);
			db.close(pstmt);
			db.close(con);
		}
		return cnt;
	}
	
	// ȸ�� �ƹ�Ÿ ��ȣ�� �Է¹޾Ƽ� ����
	public int editAno(String id, int ano) {
		//��ȯ�� ����
		MemberVO mVO = new MemberVO();
		int cnt =0;
		//1. Ŀ�ؼ� ������
		con = db.getCon();
		
		//2. ���Ǹ�� ��������
		String sql = mSQL.getSQL(mSQL.EDIT_AVT);
		
		//3.PreparedStatement ��������
		pstmt =db.getPSTMT( con, sql);
		
		//���� �� ���´� ���Ǹ���� �ϼ����� ���� �����̹Ƿ�
		//���Ǹ���� �ϼ����ش�.
		try {
			//������ ä���� ���Ǹ�� �ϼ�
			pstmt.setInt(1, ano);
			pstmt.setString(2, id);
			//���Ǹ�� ��� ������
			cnt =pstmt.executeUpdate();
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				db.close(rs);
				db.close(pstmt);
				db.close(con);
				}
			return cnt;
	}
}
