package day22;

import java.io.*;
import java.util.*;
public class ObjectTest02 {

	public ObjectTest02() {
		HashMap map = new HashMap();
		map.put("name", "박용수");
		map.put("tel", "010-1111-1111");
		map.put("mail", "ys@increpas.com");
		map.put("addr", "서울시 구로구");
		map.put("gen", '남');
		map.put("age", 31);
		map.put("height", "185.0");
		//스트림 준비
		FileOutputStream fout = null;
		ObjectOutputStream oout =null;
		
		System.out.println("파일저장성공");
		try {
			//스트림만들고
			fout = new FileOutputStream("src/day22/data/map.txt");
			oout = new ObjectOutputStream(fout);
			//데이터를 내보낸다.
			oout.writeObject(map);
			
			System.out.println("*** 저장 성공 ***");
		}catch(Exception e) {
			e.printStackTrace();
			
		}finally {
			try {
				oout.close();
				fout.close();
			}catch(Exception e) {}
			
		}
	}

	public static void main(String[] args) {
		new ObjectTest02();
	}

}
