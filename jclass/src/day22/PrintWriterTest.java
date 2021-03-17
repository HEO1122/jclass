package day22;
/* 
 * PrintWriter 스트림을이용해서 파일을 저장해보자
# A Drinking Song@
#@
#William Butler Yeats@
#@
#Wine comes in at the mouth@
#And love comes in at the eye;@
#That’s all we shall know for truth@
#Before we grow old and die.@
#I lift the glass to my mouth,@
#I look at you, and sigh. @
 
 */
import java.io.*;
public class PrintWriterTest {

	public PrintWriterTest() {
		//스트림 준비하고
		//PrintWriter도 파일에 직접 연결할 수 있는 필터스트림이다.
		PrintWriter pw = null;
		try {
			pw =new PrintWriter("src/day22/data/darkingSong.poem");
			//파일에 내용기록
			pw.println(" A Drinking Song");
			pw.println();
			pw.println("William Butler Yeats");
			pw.println();
			pw.println("Wine comes in at the mouth");
			pw.println("And love comes in at the eye;");
			pw.println("That’s all we shall know for truth");
			pw.println("Before we grow old and die.");
			pw.println("I lift the glass to my mouth,");
			pw.println("I look at you, and sigh. ");
			
			System.out.println("작업종료");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				pw.close();
				//이 스트림도 내부적으로 Buffered 스트림을 가지고 처리하므로
				//자동 flush()가 된다.
			}catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new PrintWriterTest();
	}

}
