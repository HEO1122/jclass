package Member.controller;

/*
 * 가입된 회원의 아이디들을 조회해서 출력하고 
 * 아이디를 입력해서 해당 아이디 회원의 정보를 출력해보자
 * 
 * 이 클래스는 만든 부품을 이용해서 프로그램을 조립하는 클래스이다.
 * 
 * ----------------------------------------------------------------
 * 1. "l"을 입력하면 회원들의 회원이름, 아이디, 가입일을 조회해서 보여주는 기능
 * 2. "id"을 입력 회원들의 리스트를 보여주 고 아이디를 입력받아서 보여주는 기능
 * 		해당 회원의 정보를 보여주는 기능
 3. "add"를 입력하면 회원의 정보를 입력받아서 회원가입을 처리해주는 기능
 4. "mail"을 입력하면 아이디와 새로운 메일을 입력받아서
 		회원의 메일을 수정해주는 기능
  5. "ano"를 입력하면 아바타번호 수정해주는 기능
  
  q를 입력하면 프로그램 종료
 *
 */
import Member.dao.*;
import Member.vo.*;
import java.util.*;
public class Member {
	//이 클래스에서는 데이터베이스 작업을 하는 기능의 함수를 조립해서 쓸예정이다
	//따라서 데이터베이스 작업전담클래스를 가져와서 사용해야 한다.
	private MemberDao mDao;
	
	public Member() {
		mDao = new MemberDao();
		Scanner sc = new Scanner(System.in);
		
//		while(true) {
			/*
			getIdList();
			System.out.println();
			
			getInfo(sc);
			*/
			exec(sc);
//		}
	}
	
	//전체 명령 처리함수
	public void exec(Scanner sc) { 
		//프로그램을 언제 종료할 지 모르므로 무한 반복해서 처리한다.
		StringBuffer buff = new StringBuffer();
		buff.append("작업을 선택하세요 !");
		buff.append("\n\t전체회원 출력 : l ");
		buff.append("\n\tid로 정보조회 : id ");
		buff.append("\n\t 회원가입 처리 : add ");
		buff.append("\n\t 회원메일 수정 : mail ");
		buff.append("\n\t 회원아바타 수정 : ano ");
		buff.append("\n\t프로그램종료 :q ");
		buff.append("\n");
		buff.append("\n 코드선택 : ");
		
		loop:
		for(;;) {
			/*
			 *  1. "l"을 입력하면 회원들의 회원이름, 아이디, 가입일을 조회해서 보여주는 기능
 * 2. "id"을 입력 회원들의 리스트를 보여주 고 아이디를 입력받아서 보여주는 기능
 * 		해당 회원의 정보를 보여주는 기능
 3. "add"를 입력하면 회원의 정보를 입력받아서 회원가입을 처리해주는 기능
 4. "mail"을 입력하면 아이디와 새로운 메일을 입력받아서
 		회원의 메일을 수정해주는 기능
  5. "ano"를 입력하면 아바타번호 수정해주는 기능
			 */
			//메시지 출력하고
			System.out.print(buff);
			
			String code = sc.nextLine();
			switch(code) {
			case "q":
				System.out.println("프로그램 종료#####");
				break loop;
			case "l":
				showMemberList();
				break;
			case "id":
				getInfo(sc);
				break;
			case "add":
				addMember(sc);
				break;
			case "mail":
				editMail(sc);
				break;
			case "ano":
				editAno(sc);
				break;
			}
		}
	}
	//회원 아이디와 아바타번호를 입력받아서  수정해주는 함수
	public void editAno(Scanner sc) {
			System.out.println("수정할 회원 아이디");
			String id = sc.nextLine();
			
			System.out.println("바꿀 아바타 번호 입력");
			int ano = sc.nextInt();
			
			MemberVO mVO = new MemberVO();
			
			mVO.setAno(ano);
			
			int cnt = mDao.editAno(id, ano);
			
			if(cnt ==1) {
				System.out.println("아바타번호를 바꿨습니다.");
			}else {
				System.out.println("아바타번호 변경에 실패하였습니다.");
			}
	}
	
	//회원 아이디와, 메일을 입력받아서  수정해주는 함수
	public void editMail(Scanner sc) {
		System.out.print("수정할 회원 아이디 : ");
		String id = sc.nextLine();
		
		System.out.print("메일주소 : ");
		String mail = sc.nextLine();
		
		MemberVO mVO = new MemberVO();
		
		mVO.setMail(mail);
		
		int cnt = mDao.editMail(id, mail);
		
		if(cnt ==1) {
			System.out.println("메일을 변경하였습니다.");
		}else {
			System.out.println("메일변경에 실패하였습니다.");
		}
		
	}
	//회원가입처리함수
	public void addMember(Scanner sc) {
		
		System.out.print("회원 이름 : ");
		String name = sc.nextLine();
		System.out.print("회원 아이디 : ");
		String id = sc.nextLine();
		System.out.print("회원 비밀번호 : ");
		String pw = sc.nextLine();
		System.out.print("회원 메일주소 : ");
		String mail = sc.nextLine();
		System.out.print("회원 전화번호 : ");
		String tel = sc.nextLine();
		System.out.print("회원 성별 : ");
		String gen = sc.nextLine();
		System.out.print("회원 아바타번호 : ");
		int ano = sc.nextInt();
		
		MemberVO mvo = new MemberVO();
		
		mvo.setName(name);
		mvo.setId(id);
		mvo.setPw(pw);
		mvo.setMail(mail);
		mvo.setTel(tel);
		mvo.setGen(gen);
		mvo.setAno(ano);
		
		int cnt = mDao.addMemb(mvo);
		
		// 결과 처리
		if(cnt== 1) {
			System.out.println("회원가입에 성공하였습니다.");
		}else {
			System.out.println("회원가입에 실패하였습니다.");
		}
		
	}
	
	//모든 회원의 리스트보여주는 함수
	public void showMemberList() {
		//getAllInfo()함수에서 회원정보를 반환해 준다.
		ArrayList<MemberVO> memList = mDao.getAllInfo();
		
		System.out.println("|");
		for(MemberVO vo : memList) {
			System.out.println("name : " + vo.getName()+", id :"+ vo.getId()+", jdate"+vo.getJdate());
		}
		System.out.println();
	}
//	아이디 리스트 가져와서 출력해주는 함수
	public void getIdList() {
		ArrayList<String>idList = mDao.getIdList();
		//MemberDao에 있는 getIdList()함수는 아이디리스트를 내보내줄텐데
		//이 클래스에서는 그 내보내주는 데이터를 기억해서 사용하면 된다.
		System.out.print("|");
		for(int i =0; i<idList.size();i++) {
			System.out.print(idList.get(i)+" |");
		}
		System.out.println();
	}
	
	//아이디를 입력받아서 해당 아이디에 정보를 출력해주는 함수
	public void getInfo(Scanner s) {
		while(true) {
			getIdList();
			System.out.println();
			//먼제 메시지를 출력하고
			System.out.println("조회할 아이디 : ");
			String sid = s.nextLine();
			if(sid.equals("q")) {
				break;
			}
			MemberVO mVO = mDao.getMemberInfo(sid);
			System.out.println(mVO);
			System.out.println();
			
		}
	}
	public static void main(String[] args) {
		new	Member();
		
	}

}
