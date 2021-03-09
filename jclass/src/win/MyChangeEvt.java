package win;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MyChangeEvt implements ActionListener{
/* 
 * 이 클래스는 MyFrame객체의 change버튼이 클릭이 되었을 때
 * 이벤트를 처리해주기 위한 클래스
 * 
 * 따라서 
 * 이 클래스는 MyFrame 객체를 기억하고 있어야 작업이 처리가 될 것이다.
 * 따라서 이 클래스가 MyFrame 객체의 주소를 찾는 것은 원칙적으로 불가능하다
 * 누군가 알려줘야 MyFrame의 멤버를 수정할 수 있게 된다.
 * 따라서 다른 클래스에서는 MyFrame의 객체의 주소를 알아내는 방법은 어렵고
 * 그러면 자기 자신은 자신의 주소를 알려줄 수는 있을 것이다.
 * 따라서 이 클래스가 객체가 되는 순간
 * MyFrame의 객체의 주소를 받아서 기억하고 있으면 된다.
 * 그러므로 이 클래스가 객첵가 되는 순간 실행되는 함수
 * 생성자가 호출되는 순간 MyFrame의 주소를 전달 받아서 기억시키고
 * 객체를 만들어 주면된다.
 */
	MyFrame fr;
	public MyChangeEvt() {
		
	}
	public MyChangeEvt(MyFrame fr) {
		this.fr=fr;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		/*
		 * 이 함수는 MyFrame의 change 버튼이 클릭이 되는 순간 자동 호출되는
		 * 함수이다.
		 * 따라서 이  함수에서 MyFrame의 내용을 변경시키는 작업을 한다면
		 * 결과적으로 버튼이 클릭될 때 창의 내용이변경이 될것이다.
		 * 우리는 버튼이 클릭이 될 때
		 * 창의 배경 색을 랜덤하게 변경시켜 주려고 한다.
		 * 
		 * 색은 Color 라는 클래스가 있고 이 클래스의 객체를 만들어서
		 * 사용해야한다.
		 * 객체를 만드는 방법은 빨강, 초록, 파랑 3 색상의 정수값으로 만들 수 있다.
		 * 
		 * 예)Color c= new Color(255,0,0); =빨강
		 * 그런데 우리는 색상을 랜덤하게 만들것이기 때문에
		 * 입력되는 숫자를 랜덤하게 만들어주기만하면 된다.
		 * 칼라 코드는 0~255까지 정수를 사용한다.
		 */
		//각 칼라 코드 만들고
		int red=(int)(Math.random()*256);
		int green=(int)(Math.random()*256);
		int blue=(int)(Math.random()*256);
		//칼라 객체를 만들고
		Color color = new Color(red,green,blue);
		//만들어진 칼라를 MyFrame의 멤버 중 pan에 적용시킨다.
		//우리는 MyFrame의 주소를 fr변수에 기억시켜놓았으므로
		//변수에 접근해서 처리하면 되겠다.
		fr.pan.setBackground(color);
	}

}
