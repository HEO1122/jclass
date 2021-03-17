package day22;

/*
 * ObjectTest02에서 저장한 map.txt
 * 파일을 읽어서 출력해보자
 * 
 */

import java.io.*;
import java.util.*;
public class MapReadTest {

	
	public MapReadTest() {
		//스트림준비
		FileInputStream fin =null;
		ObjectInputStream oin = null;
		try {
			//스트림만들고
			fin = new FileInputStream("src/day22/data/map.txt");
			oin = new ObjectInputStream(fin);
			
			//클래스를 통채로 읽는다. 저장한 클래스타입 그대로 가져오기
			HashMap data = (HashMap) oin.readObject();
			System.out.println(data);
			System.out.println();
			
			//변수 하나씩 출력해보자
			System.out.println("name : "+ data.get("name"));
			System.out.println("tel : "+ data.get("tel"));
			System.out.println("mail : "+ data.get("mail"));
			System.out.println("addr : "+ data.get("addr"));
			System.out.println("gen : "+ data.get("gen"));
			System.out.println("age : "+ data.get("age"));
			System.out.println("height : "+ data.get("height"));
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				oin.close();
				fin.close();
			}catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new MapReadTest();

	}

}
