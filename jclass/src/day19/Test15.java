package day19;

import static java.lang.Math.*;
import java.util.*;
public class Test15 {

	public Test15() {
		TreeSet set = new TreeSet();
		
		//데이터 채우기
		while(set.size()<5) {
			set.add(new Samgak((int)(random()*10+1),(int)(random()*10+1)));
		}
		
		//출력
		ArrayList list =new ArrayList(set);
		for(Object o : list) {
			Samgak s = (Samgak) o ;
			s.toPrint();
		}
	}
	public static void main(String[] args) {
		new Test15();

	}


}
