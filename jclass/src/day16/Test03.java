package day16;

import java.io.*;
public class Test03 {

	public Test03() {
		//파일객체 만들고
	File file =new File("C:\\calss\\java\\source\\jclass\\bin\\day14");
	//파일 리스트 가져오고
	String[] list =file.list(new MyFilter());
	//리스트 내용 출력하고
	for(String s : list) {
		System.out.println(s);
	}
	System.out.println("정렬전");
	String[] list1 =file.list();
	for(String s : list1) {
		System.out.println(s);
	}
	}

	public static void main(String[] args) {
		new Test03();
	}

}

 class MyFilter implements FilenameFilter{
/*
 * 나는 day14 패키지에서 파일의 이름이 T로 시작하는 것만 출력하고자 한다.
 */
	@Override
	public boolean accept(File dir, String name) {
		if(name.startsWith("T")) {
			return true;
		}
		return false;
	}
	
}