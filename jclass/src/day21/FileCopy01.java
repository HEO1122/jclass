package day21;
/*
 * 파일을 복사하는 프로그램을 만들어보자
 */
import java.io.*;
public class FileCopy01 {

	public FileCopy01() {
		//할일
		//스트림은 단방향이다.
		//복사는 한곳에서 읽어서 다른곳에 그대로 쓰면되다.
		//따라서 스트림이 두개 준비되어야 ㅎ나다.
		FileInputStream fin =null; //원본
		FileOutputStream fout =null; //복사본
		
		try {
			//스트림을 만들고 
			fin = new FileInputStream("C:\\class\\java\\example\\day21\\character.jfif");
			fout = new FileOutputStream("src/day21/character.jfif");
			
			//한곳에서 읽어서 그대로 다른곳에 씀
			//몇번 읽어야 할 지모른다.
			while(true) {
				//byte배열 준비하고
				byte[] buff = new byte[1024];
				//읽어서 배열에 기억하고
				int len =fin.read(buff);
				if(len ==-1) {
					break;
				}
				fout.write(buff,0,len);
					}
			System.out.println("복사완료!!!");
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			try {
				fout.close();
				fin.close();
			}catch(Exception e) {}
		}
		
	}

	public static void main(String[] args) {
		new FileCopy01();
	}

}
