package win;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MyCloseEvt extends MouseAdapter {
/*
 * ����) 1. �� Ŭ������ ��ü�� �� �� MyFrame ��ü�� �ּҸ� ����ؾ��Ѵ�.
 * 			���� MyFrame�� �ּҸ� ���� �޾Ƽ� ����� ���´�.
 * 
 *  	2. WindowClosing()�� �������̵� �Ѵ�.
 */

	@Override
	public void mouseClicked(MouseEvent e) {
		//�������� ���α׷��� �����ϴ� ���
		System.exit(0);
	}
}
