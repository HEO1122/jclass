package Member.controller;

/*
 * ���Ե� ȸ���� ���̵���� ��ȸ�ؼ� ����ϰ� 
 * ���̵� �Է��ؼ� �ش� ���̵� ȸ���� ������ ����غ���
 * 
 * �� Ŭ������ ���� ��ǰ�� �̿��ؼ� ���α׷��� �����ϴ� Ŭ�����̴�.
 * 
 * ----------------------------------------------------------------
 * 1. "l"�� �Է��ϸ� ȸ������ ȸ���̸�, ���̵�, �������� ��ȸ�ؼ� �����ִ� ���
 * 2. "id"�� �Է� ȸ������ ����Ʈ�� ������ �� ���̵� �Է¹޾Ƽ� �����ִ� ���
 * 		�ش� ȸ���� ������ �����ִ� ���
 3. "add"�� �Է��ϸ� ȸ���� ������ �Է¹޾Ƽ� ȸ�������� ó�����ִ� ���
 4. "mail"�� �Է��ϸ� ���̵�� ���ο� ������ �Է¹޾Ƽ�
 		ȸ���� ������ �������ִ� ���
  5. "ano"�� �Է��ϸ� �ƹ�Ÿ��ȣ �������ִ� ���
  
  q�� �Է��ϸ� ���α׷� ����
 *
 */
import Member.dao.*;
import Member.vo.*;
import java.util.*;
public class Member {
	//�� Ŭ���������� �����ͺ��̽� �۾��� �ϴ� ����� �Լ��� �����ؼ� �������̴�
	//���� �����ͺ��̽� �۾�����Ŭ������ �����ͼ� ����ؾ� �Ѵ�.
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
	
	//��ü ��� ó���Լ�
	public void exec(Scanner sc) { 
		//���α׷��� ���� ������ �� �𸣹Ƿ� ���� �ݺ��ؼ� ó���Ѵ�.
		StringBuffer buff = new StringBuffer();
		buff.append("�۾��� �����ϼ��� !");
		buff.append("\n\t��üȸ�� ��� : l ");
		buff.append("\n\tid�� ������ȸ : id ");
		buff.append("\n\t ȸ������ ó�� : add ");
		buff.append("\n\t ȸ������ ���� : mail ");
		buff.append("\n\t ȸ���ƹ�Ÿ ���� : ano ");
		buff.append("\n\t���α׷����� :q ");
		buff.append("\n");
		buff.append("\n �ڵ弱�� : ");
		
		loop:
		for(;;) {
			/*
			 *  1. "l"�� �Է��ϸ� ȸ������ ȸ���̸�, ���̵�, �������� ��ȸ�ؼ� �����ִ� ���
 * 2. "id"�� �Է� ȸ������ ����Ʈ�� ������ �� ���̵� �Է¹޾Ƽ� �����ִ� ���
 * 		�ش� ȸ���� ������ �����ִ� ���
 3. "add"�� �Է��ϸ� ȸ���� ������ �Է¹޾Ƽ� ȸ�������� ó�����ִ� ���
 4. "mail"�� �Է��ϸ� ���̵�� ���ο� ������ �Է¹޾Ƽ�
 		ȸ���� ������ �������ִ� ���
  5. "ano"�� �Է��ϸ� �ƹ�Ÿ��ȣ �������ִ� ���
			 */
			//�޽��� ����ϰ�
			System.out.print(buff);
			
			String code = sc.nextLine();
			switch(code) {
			case "q":
				System.out.println("���α׷� ����#####");
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
	//ȸ�� ���̵�� �ƹ�Ÿ��ȣ�� �Է¹޾Ƽ�  �������ִ� �Լ�
	public void editAno(Scanner sc) {
			System.out.println("������ ȸ�� ���̵�");
			String id = sc.nextLine();
			
			System.out.println("�ٲ� �ƹ�Ÿ ��ȣ �Է�");
			int ano = sc.nextInt();
			
			MemberVO mVO = new MemberVO();
			
			mVO.setAno(ano);
			
			int cnt = mDao.editAno(id, ano);
			
			if(cnt ==1) {
				System.out.println("�ƹ�Ÿ��ȣ�� �ٲ���ϴ�.");
			}else {
				System.out.println("�ƹ�Ÿ��ȣ ���濡 �����Ͽ����ϴ�.");
			}
	}
	
	//ȸ�� ���̵��, ������ �Է¹޾Ƽ�  �������ִ� �Լ�
	public void editMail(Scanner sc) {
		System.out.print("������ ȸ�� ���̵� : ");
		String id = sc.nextLine();
		
		System.out.print("�����ּ� : ");
		String mail = sc.nextLine();
		
		MemberVO mVO = new MemberVO();
		
		mVO.setMail(mail);
		
		int cnt = mDao.editMail(id, mail);
		
		if(cnt ==1) {
			System.out.println("������ �����Ͽ����ϴ�.");
		}else {
			System.out.println("���Ϻ��濡 �����Ͽ����ϴ�.");
		}
		
	}
	//ȸ������ó���Լ�
	public void addMember(Scanner sc) {
		
		System.out.print("ȸ�� �̸� : ");
		String name = sc.nextLine();
		System.out.print("ȸ�� ���̵� : ");
		String id = sc.nextLine();
		System.out.print("ȸ�� ��й�ȣ : ");
		String pw = sc.nextLine();
		System.out.print("ȸ�� �����ּ� : ");
		String mail = sc.nextLine();
		System.out.print("ȸ�� ��ȭ��ȣ : ");
		String tel = sc.nextLine();
		System.out.print("ȸ�� ���� : ");
		String gen = sc.nextLine();
		System.out.print("ȸ�� �ƹ�Ÿ��ȣ : ");
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
		
		// ��� ó��
		if(cnt== 1) {
			System.out.println("ȸ�����Կ� �����Ͽ����ϴ�.");
		}else {
			System.out.println("ȸ�����Կ� �����Ͽ����ϴ�.");
		}
		
	}
	
	//��� ȸ���� ����Ʈ�����ִ� �Լ�
	public void showMemberList() {
		//getAllInfo()�Լ����� ȸ�������� ��ȯ�� �ش�.
		ArrayList<MemberVO> memList = mDao.getAllInfo();
		
		System.out.println("|");
		for(MemberVO vo : memList) {
			System.out.println("name : " + vo.getName()+", id :"+ vo.getId()+", jdate"+vo.getJdate());
		}
		System.out.println();
	}
//	���̵� ����Ʈ �����ͼ� ������ִ� �Լ�
	public void getIdList() {
		ArrayList<String>idList = mDao.getIdList();
		//MemberDao�� �ִ� getIdList()�Լ��� ���̵𸮽�Ʈ�� ���������ٵ�
		//�� Ŭ���������� �� �������ִ� �����͸� ����ؼ� ����ϸ� �ȴ�.
		System.out.print("|");
		for(int i =0; i<idList.size();i++) {
			System.out.print(idList.get(i)+" |");
		}
		System.out.println();
	}
	
	//���̵� �Է¹޾Ƽ� �ش� ���̵� ������ ������ִ� �Լ�
	public void getInfo(Scanner s) {
		while(true) {
			getIdList();
			System.out.println();
			//���� �޽����� ����ϰ�
			System.out.println("��ȸ�� ���̵� : ");
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
