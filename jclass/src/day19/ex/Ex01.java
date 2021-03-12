package day19.ex;

/*
 * 문제1) Vector를 만들고 만들어진 벡터에 곡명 10개를 넣어서 출력하세요.
 */
import java.util.*;
public class Ex01 {
	public Vector vec = new Vector();

	public Ex01() {
		setData();
	}
	
	public void setData() {
		vec.add("롤린");
		vec.add("CELEBRITY");
		vec.add("dynamite");
		vec.add("밤하늘의 별을");
		vec.add("don't call me");
		vec.add("love day");
		vec.add("잠이 오질 않네요");
		vec.add("lovesick girls");
		vec.add("취기를 빌려");
		vec.add("에잇");
		
		for(int i =0; i<vec.size(); i++) {
			System.out.print(vec.get(i));
			
		}
		
	}
	public static void main(String[] args) {
		new Ex01();

	}

}
