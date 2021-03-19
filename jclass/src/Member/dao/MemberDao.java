package Member.dao;
/**
 * 이 클래스는 회원에 관련된 데이터베이스 작업을 전담해서 처리하는 클래스
 * @author class02
 *
 */
import java.util.*;
import java.sql.*;
import db.*;
import Member.sql.*;
import Member.vo.*;
public class MemberDao {
	//이 클래스는 데이터 베이스 작업전용 클래스이기때문에
	// 이클래스가 객체가 되는 순간 데이터베이스 작업을 할 준비가 되어있어야겠따.
	private MyJDBC db;
	private Connection con;
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	//질의명령 클래스 
	private MemberSQL mSQL;
	
	public MemberDao() {
		db =new MyJDBC();
		//이렇게 MyJDBC 생성자를 호출하는 순간
		//오라클 드라이버는 로딩이 끝난상태가 된다.
		
		//이제 질의명령을 사용할 수 있도록 질의명령 클래스를 메모리에 올리자.
		mSQL =new MemberSQL();
		
	}
	
	//회원들의 아이디 리스트 조회 전담 처리함수
	public ArrayList<String> getIdList(){
		//반환값 변수
		ArrayList<String> list = new ArrayList<String>();
		/*
		 * 이 함수는 오라클에 접속해서 
		 * 회원의 아이디만 조회해서 
		 * 그 결과를 반환해주는 함수
		 * 따라서 데이터베이스 작업을 해야 하는데
		 * 1. 먼저 접속을 하고 
		 * 2. 질의명령을 가져와서 
		 * 3. Statement에 실어서 
		 * 4. jdbc에게 전달하면 
		 * 5. 결과를 반환해줄텐데 그 결과를 받아서 반환해주면 된다.
		 * 
		 */
		//1. 접속
		con = db.getCon(); // 오라클에 접속을 하나 얻어온 상태
		//2. 질의명령
		String sql = mSQL.getSQL(mSQL.SEL_ID_LIST);
		/*
		 * 질의명령은 MemberSQL 클래스에 모두 만들어 뒀고
		 * 필요한 질의명령은 요청을 하면 반환을 해줄 것이다.
		 * 이때 필요한 질의명령 코드 역시 MemberSQL안에 만들어뒀으니
		 * 꺼내서 사용하기만 하면된다.
		 */
		//질의명령에 ? (채워야 할 데이터)가 없으므로 Statement로 처리한다.
		stmt = db.getSTMT(con);
		
		try {
			//지금 필요한 질의명령은 이미 완성된 상태의 질의명령이기 때문에
			//질의명령을 데이터를 채워서 완성하는 작업이 필요하지 않다.
			//질의명령을 보내고 결과 받고...
			//준비된 변수에 결과 받는다.
			rs = stmt.executeQuery(sql);
			/*
			 * Statement는 내부에 질의명령을 기억하지 않고 있기 때문에
			 * 질의명령을 실어서 jdbc에게 보내야 하고
			 * Prepared Statement의 경우는 만들때 질의명령의 구조를 가져와서 
			 * 만들어지므로 이미 내부에 질의명령이 들어있다.
			 * 따라서 실어서 보내지 않아도 된다.
			 */
			/*
			 * ResultSet은 인라인테이블을 가져올 때 레코드포인터가 BOF에 있고
			 * 따라서 데이터를 꺼낼 수 없는 상태이다.
			 * 그래서 우리는 레코드포인터를 한행 내려서 그 행의 데이터필드의
			 * 데이터를 꺼냈었다.
			 * 
			 * 이 때 rs.next() 함수를 호출해서 레코드 포인터를 한행 밑으로 내렸었는데
			 * next()함수는 반환값이 boolean타입이다.
			 * 의미는 한행 밑으로 내리는데 성공하면 true를 반환해주고
			 * 								실패하면 false를 반환한다.
			 * 
			 * 따라서 질의명령의 결과가 다중행으로(여러행으로) 발생하는 경우는
			 * 반복문으로 처리해야 할텐데 이 때 반복문의 조건식에 next()함수를 사용하면 
			 * 될것이다.
			 * 
			 */
			while(rs.next()) {
				//EOF로 이동하는순간 이 반복문은 종료가 된다.
				//이 반복문은 질의명령의 결과 만들어진 회원들의
				//아이디를 리스트에 담는작업을 하는 반복문이다.
				
				//데이터 꺼내고
				String sid = rs.getString("id");
				//리스트에 아이디 담기
				list.add(sid);
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			db.close(rs);
			db.close(stmt);
			db.close(con);
		}
		
		//데이터 반환
		return list;
	}
	
	//아이디를입력받아서 회원정보 조회 전담 처리 함수
	public MemberVO getMemberInfo(String id) {
		//반환값 변수
		MemberVO mVO = new MemberVO();
		System.out.println("dao id : " + id);
		//1. 커넥션 얻어오고
		con = db.getCon();
		
		//2. 질의명령 가져오고
		String sql = mSQL.getSQL(mSQL.SEL_ID_INFO);
		System.out.println("sql : " + sql);
		//3. PreparedStatement 꺼내오고 
		pstmt = db.getPSTMT(con, sql);
		
		//지금 이 상태는 질의명령이 완성되지 않은 상태이므로
		//질의명령을 완성해준다.
		try {
			//데이터 채워서 질의명령 완성
			pstmt.setString(1, id);
			//이제 질의명령은 완성이 됐고 보내서 결과를 받자.
			rs = pstmt.executeQuery();
			//레코드 포인터를 BOF에서 한행 내린다.
			rs.next();
			//데이터 꺼내서 VO에 담고
			mVO.setMno(rs.getInt("mno"));
			mVO.setName(rs.getString("name"));
			mVO.setId(rs.getString("id"));
			mVO.setMail(rs.getString("mail"));
			mVO.setTel(rs.getString("tel"));
			mVO.setGen(rs.getString("gen").equals("M")?"남자":"여자");
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
		
		//데이터 반환
		return mVO;
	}
	
	//회원리스트 전담함수
	public ArrayList<MemberVO> getAllInfo() {
		//반환값 변수
		ArrayList<MemberVO> list = new ArrayList<MemberVO>();
		
		//1. 커넥션 얻어오고
		con = db.getCon();
		
		//2. 질의명령 가져오고
		String sql = mSQL.getSQL(mSQL.SEL_ALL_INFO);
		
		//질의명령에 ?채워야할 데이터가 없으므로 Statement로 처리한다.
		stmt =db.getSTMT(con);
		
		try {
			//준비된 변수에 결과 받기
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
	
	//회원정보 입력받아서 추가 함수
	public int addMemb(MemberVO mVO) {
		//1. 커넥션 얻어오기
		con =db.getCon();
		//2. 질의명령어 가져오기
		String sql = mSQL.getSQL(mSQL.ADD_MEMB);
		
		//3. 질의명령담을 PreparedStatement준비
		pstmt = db.getPSTMT(con, sql);
		int cnt = 0;
		try {
				//회원 데이터 정보입력 name, id, pw, mail, tel, gen, avt ano
				pstmt.setString(1,mVO.getName());
				pstmt.setString(2,  mVO.getId());
				pstmt.setString(3, mVO.getPw());
				pstmt.setString(4, mVO.getMail());
				pstmt.setString(5, mVO.getTel());
				pstmt.setString(6, mVO.getGen());
				pstmt.setInt(7, mVO.getAno());
				
				//질의 명령이 완성되었으므로 전달
				cnt = pstmt.executeUpdate();
				//이때 pstmt에는 이미 완성된 질의 명령이 들어있으므로 
				//함수 호출 시 질의명령을 입력하지 않아도 된다.
				
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
	
	//아이디 입력 받아서 메일 수정함수
	public int editMail(String id, String mail) {
		//반환할 변수
		int cnt = 0;
		MemberVO mVO = new MemberVO();
		
		//1. 커넥션 얻어오고
		con = db.getCon();
		
		//2. 질의명령 가져오기
		String sql = mSQL.getSQL(mSQL.EDIT_IDMAIL);
		
		//3.PreparedStatement 꺼내오고
		pstmt =db.getPSTMT(con, sql);
		//질의명령 완성
		try {
			//데이터 채워서 질의명령 완성
			pstmt.setString(1, mail);
			pstmt.setString(2, id);
			//이제 질의명령은 완성이 됐고 보내서 결과를 받자
			cnt = pstmt.executeUpdate();
		/*
			//레코드 포인터를 BOF에서 한행 내리기
			rs.next();
			//데이터 꺼내서 VO에 담고
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
	
	// 회원 아바타 번호를 입력받아서 수정
	public int editAno(String id, int ano) {
		//반환값 변수
		MemberVO mVO = new MemberVO();
		int cnt =0;
		//1. 커넥션 얻어오기
		con = db.getCon();
		
		//2. 질의명령 가져오고
		String sql = mSQL.getSQL(mSQL.EDIT_AVT);
		
		//3.PreparedStatement 꺼내오기
		pstmt =db.getPSTMT( con, sql);
		
		//지금 이 상태는 질의명령이 완성되지 않은 상태이므로
		//질의명령을 완성해준다.
		try {
			//데이터 채워서 질의명령 완성
			pstmt.setInt(1, ano);
			pstmt.setString(2, id);
			//질의명령 결과 보내기
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
