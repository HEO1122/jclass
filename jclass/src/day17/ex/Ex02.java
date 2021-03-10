package day17.ex;

/*
 * 문제2) 학생의 성적을 관리하는 클래스를 작성하세요
 * 			학생의 정보는 학생번호, 이름을 기억하기로 하고
 * 			점수는 java, db, web, jsp, 총점을 기억하기로 한다.
 * 
 * 			이때 학생번호가 같으면 같은 학생으로 처리되게 하세요.
 * 			이 클래스의 변수를 출력할 때 해당 학생의 정보(기본정보 + 점수)가 출력되도록 하세요. 
 */
import java.util.*;
public class Ex02 {
Student[] stud= new Student[10];
	public Ex02() {
		Student s1 = new Student(1, "둘리");
		System.out.println(s1);
		
		Student s2 = new Student(1, "희동");
		System.out.println(s2);
		
		System.out.println(s1.equals(s2));
	
	loop:
		for(int i =0; i<stud.length; i++) {
			int no =(int)(Math.random()*10+1);
			stud[i] = new Student(no, "학생"+no + ":");
			for(int j =0; j<i; j++) {
				if(stud[i].equals(stud[j])) {
					i--;
					continue loop;
				}
			}
		}
	
		System.out.println(Arrays.toString(stud));
		
	}

	public static void main(String[] args) {
		new Ex02();

	}

}
