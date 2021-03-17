package day22;

/*
 * day22.data.desert.poem을 읽어보자
 * BufferedReader 스트림으 사용해서 읽어보자
 */

import java.io.*;
public class BufferedReaderTest {

	public BufferedReaderTest() {
		//스트림을 준비
		//타겟 스트림 준비(필터스트림을 사용하려면 반드시 타겟스트림이 준비되어야한다.)
		FileReader fr = null;
		//필터스트림 준비
		BufferedReader br = null;
		
		 try {
			 //타겟스트림을 장치에 연결한다.
			 fr = new FileReader("src/day22/data/desert.poem");
			 //타겟스트림에 연결하는 필터스트림을 만든다.
			 br = new BufferedReader(fr);
			 
			 //몇번 읽어야 할 지 모르므로 반복해서 처리한다.
			 for(;;) {
				 String line = br.readLine();
				 //readLine() 데이터의 한행을 읽는 함수
				 //줄바꿈기호 ("\r\n")을만나면 그 이전까지만 읽어온다.
				 if( line ==null) {
					 //읽어온 데이터가 없는 경우
					 break;
				 }
				 System.out.println(line);
				 //println() 함수는 출력 후 줄바꿈을 해주는 함수
			 }
		 }catch(Exception e) {
			 e.printStackTrace();
		 }finally {
			 try {
				 br.close();
				 fr.close();
			 }catch(Exception e) {}
		 }
	}

	public static void main(String[] args) {
		new BufferedReaderTest();

	}

}
