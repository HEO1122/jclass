package day4;

import javax.swing.*;
public class Ex10_01 {
	public static void main(String[] args) {
		String sno= JOptionPane.showInputDialog("�ظ� �Է��ϼ���");
		int year= Integer.parseInt(sno);
		String result ="";
		
		
		if(year%400==0) {
				result ="����";
		}else if(year%100==0) {
			result ="���";
		}else if(year%4==0) {
			result ="����";
		}
		else{
			result ="���";}
		JOptionPane.showMessageDialog(null, "�Է��� ��"+sno+ result);
		
		
	}
}
