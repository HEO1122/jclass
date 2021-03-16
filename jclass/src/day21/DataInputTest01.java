package day21;

import java.io.FileInputStream;

/*
 * DataOutputTest01에서 저장한 파일을 읽어보자
 */
import java.io.*;
public class DataInputTest01 {

	public DataInputTest01() {
		//타겟스트림준비
		FileInputStream fin = null;
		//필터스트림준비
		DataInputStream din = null;
		
		try {
			//스트림 만들고
			fin = new FileInputStream("src/day21/data/friend.txt");
			din = new DataInputStream(fin);//타겟스트림 만든다.
			
			//파일을 저장할 때 이름,나이, 신장, 성별, 전화. 메일 순서로 저장
			//반드시 꺼낼 때도 순서를 맞춰서 꺼내야한다.
			String name =din.readUTF();
			int age =din.readInt();
			double height = din. readDouble();
			boolean gen = din.readBoolean();
			String tel = din.readUTF();
			String mail = din.readUTF();
			
			//출력
			System.out.println("이름 : "+ name);
			System.out.println("나이 : "+ age);
			System.out.println("신장 : "+ height);
			System.out.println("성별 : "+ gen);
			System.out.println("전화 : "+tel);
			System.out.println("메일 : "+ mail);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				din.close();
				fin.close();
			}catch(Exception e) {}
		}
		
	}

	public static void main(String[] args) {
		new DataInputTest01();
	}

}
