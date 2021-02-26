package day10.ex;
/* 1.width에 정수를 입력받아 대입해주는 함수
 * 2. height에 정수를 입력받아 대입해주는 함수
 * 3. width와 height를 이용해서 사각형의 면적을 계산하고 반환해주는 함수
 * 4. 정수 두개를 입력받아서 위에서 만든 함수를 사용해서 사각형의 가로세로를 셋팅하고
 * 면적을 출력해주는 기능의 함수
 */
import java.util.*;
public class Ex03 {
	int width, height;
	public Ex03(){//4.함수
		width(w);
		height(h);
		System.out.println(a);
	}
	//1.width에 정수를 입력받아 대입해주는 함수
	public void width(int w) {
		width = w;		
	}
	// 2. height에 정수를 입력받아 대입해주는 함수	 
	public void height(int h) {
		height =h;
		
	}
// 3. width와 height를 이용해서 사각형의 면적을 계산하고 반환해주는 함수
	public int area() {
		int area = width * height;
		return a;
	}
	public static void main(String[] args) {
		new Ex03();
	}
}
