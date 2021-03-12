package day19;

import static java.lang.Math.*;
import java.util.*;
public class Test14 {

	public Test14() {
		TreeSet set= new TreeSet((new Test11()).new MySort());
	//Semo 5개를 랜덤하게 입력
		while(set.size()<5) {
			set.add(new Semo((int)(random()*10+1),(int)(random()*10+1)));
		}
		System.out.println("_____________");
		Iterator itor = set.iterator();
		while(itor.hasNext()) {
			Semo s = (Semo)set.iterator();
			while(itor.hasNext()) {
				
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
