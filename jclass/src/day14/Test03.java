package day14;
/*
 * jframe을 상속받은 클래스를 만들어보자
 */
import javax.swing.*;
public class Test03 extends JFrame{

	public Test03() {
		//super(); 첫줄에서 생성자 함수 자동 호출로 기능 구현
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//닫기버튼 기능 구현
		// TODO Auto-generated constructor stub
		setSize(450,500);//창사이즈
		//JFrame을 상속받았기 때문에  자동적으로 JFrame의 멤버는 이 클래스가
		//가지고 있는 상태가 됐다. 따라서 상속해준 클래스의 멤버는 모두 사용할 수 있다.
		setVisible(true);//만들어진 창 보여지게하는함수
		
	}
	public static void main(String[] args) {
		new Test03();
	}
}
