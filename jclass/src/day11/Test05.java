package day11;

import java. awt. *;
import javax.swing.*;
public class Test05 {
	public Test05() {
		/*
		 * 대화상자 하나를 만들고 싶다
		 * 객체지향 언어는 대화상자를 만들어주는 부품(클래스)가 이미 만들어져 있고 
		 * 우리는 이것을 사요만 하면 된다
		 * 다시말해서 실행 가능한 상태로 만들어주면된다.
		 */
		//프레임을 하나 만들었따.
		JFrame f= new JFrame();
		//레이아웃 정책 변경하고
		f.setLayout(new FlowLayout());
		
		//창에다 버튼을 추가해보자
		//먼저 버튼을 만든다. 이것역시 자바에서 클래스로 만들어 놓았따.
		JButton btn1 =new JButton("태연");
		JButton btn2 =new JButton("써니");
		JButton btn3 =new JButton("서현");
		JButton btn4 =new JButton("티파니");
		JButton btn5 =new JButton("윤아");

		//실행가능한 물건 버튼을 창에다 추가한다.
		f.add(btn1);
		f.add(btn2);
		f.add(btn3);
		f.add(btn4);
		f.add(btn5);

		// 이 창의 사이즈를 400 * 400으로 지정하고
		f.setSize(400,400);
		f.setVisible(true);
	}
	public static void main(String[] args) {
		new Test05();//클래스에 인스턴스 만듦
	}
}
