package day16.ex;

import java.util.*;

/*
인터페이스 Dohyung 을 구현한 클래스
	Semo, Nemo, Won 
을 만들고
배열에 랜덤하게 10개를 만들어서 채우고
각 도형의 정보를 출력하세요.
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
	//랜덤하게 배열에 클래스 채워주기
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
