package win;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MyCloseEvt extends MouseAdapter {
/*
 * 할일) 1. 이 클래스가 객체가 될 때 MyFrame 객체의 주소를 기억해야한다.
 * 			따라서 MyFrame의 주소를 전달 받아서 기억해 놓는다.
 * 
 *  	2. WindowClosing()를 오버라이드 한다.
 */

	@Override
	public void mouseClicked(MouseEvent e) {
		//실행중인 프로그램을 종료하는 명령
		System.exit(0);
	}
}
