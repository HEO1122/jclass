package day16.ex;

import java.util.*;

/*
�������̽� Dohyung �� ������ Ŭ����
	Semo, Nemo, Won 
�� �����
�迭�� �����ϰ� 10���� ���� ä���
�� ������ ������ ����ϼ���.
*/
public class Ex01 {
	Dohyung[] d = new Dohyung[10];
	public Ex01() {
		setD();
		System.out.println(Arrays.toString(d));
	}

	public static void main(String[] args) {
		new Ex01();

	}
	//�����ϰ� �迭�� Ŭ���� ä���ֱ�
	public void setD(){
		for(int i=0; i<10;i++) {
		int no =(int)(Math.random()*3);
		System.out.println(no);
			if(no==0) {
				d[i]= new Semo((int)(Math.random()*10),(int)(Math.random()*10));
			}else if(no==1) {
				d[i]= new Nemo((int)(Math.random()*10),(int)(Math.random()*10));
			}else if(no==2) {
				d[i]= new Won((int)(Math.random()*10));
			}
		}
	}

}
