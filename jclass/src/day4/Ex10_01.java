package day4;

import javax.swing.*;
public class Ex10_01 {
	public static void main(String[] args) {
		String sno= JOptionPane.showInputDialog("해를 입력하세요");
		int year= Integer.parseInt(sno);
		String result ="";
		
		
		if(year%400==0) {
				result ="윤년";
		}else if(year%100==0) {
			result ="평년";
		}else if(year%4==0) {
			result ="윤년";
		}
		else{
			result ="평년";}
		JOptionPane.showMessageDialog(null, "입력한 해"+sno+ result);
		
		
	}
}
