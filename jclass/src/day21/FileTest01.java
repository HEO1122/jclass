package day21;
/*
 * 1. D:\폴더하나를 강제로 만들자
 * 
 * 2. D:\계층된 폴더를 강제로 만들자
 * 
 * 3. 만들어진 파일 중 하나를 삭제하자(폴더 삭제도 가능, 파일 삭제도 가능)
 */
import java.io.*;
public class FileTest01 {

	public FileTest01() {
		//만들고 싶은 폴더(없어도 상관없다.) 파일로 만들자
		/*
	
		
		//1.
		File file = new File("C:\\example");
		file.mkdir(); */
		//2. 
		/*
		File file = new File("C:\\class\\java\\example\\day20");
		file.mkdirs();
		*/
//		File file = new File("C:\\example");
//		file.delete();
		
//		특정 파일의 이름을 다른 이름으로 변경하자
		//작업순서
		//1. 현재파일과 바꿀이름의 파일을 둘다 File로 만든다.
		File oldFile=new File("C:\\\\class\\\\java\\\\example\\\\day20");
		File newFile = new File("C:\\\\class\\\\java\\\\example\\\\day21");
		//2. 바꾼다.
		oldFile.renameTo(newFile);
		
	}

	public static void main(String[] args) {
		new FileTest01();

	}

}
