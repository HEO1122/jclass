package day14;
/*
 * jframe�� ��ӹ��� Ŭ������ ������
 */
import javax.swing.*;
public class Test03 extends JFrame{

	public Test03() {
		//super(); ù�ٿ��� ������ �Լ� �ڵ� ȣ��� ��� ����
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//�ݱ��ư ��� ����
		// TODO Auto-generated constructor stub
		setSize(450,500);//â������
		//JFrame�� ��ӹ޾ұ� ������  �ڵ������� JFrame�� ����� �� Ŭ������
		//������ �ִ� ���°� �ƴ�. ���� ������� Ŭ������ ����� ��� ����� �� �ִ�.
		setVisible(true);//������� â ���������ϴ��Լ�
		
	}
	public static void main(String[] args) {
		new Test03();
	}
}
