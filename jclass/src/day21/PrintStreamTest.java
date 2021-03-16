package day21;
/*#- Hortense Vlou@
 # Desert@
#He felt so lonely@
#In this desert@
#That sometimes@
#He would walk backwards@
#Just to see tracks in front of him.@

위 시를 저장해보겠습ㄴ디ㅏ.
PrintStream을 사용해서 처리
 */
import java.io.*;
public class PrintStreamTest {

	public PrintStreamTest() {
		//스트림을 준비합니다.
		//PrintStream은 필터계열Stream이지만 장치에 직접연결해서 사용하는스트림이다.
		PrintStream ps = null;
		try {
			ps = new PrintStream("src/day21/data/desert.txt");
			//직접 파일에 연결된 스트림을 만드는 보조 스트림이다.
			
			ps.printf("- Hortense Vlou");
			 ps.println(" Desert");
			ps.println("He felt so lonely");
			ps.println("In this desert");
			ps.println("That sometimes");
			ps.println("He would walk backwards");
			ps.println("Just to see tracks in front of him.");
			
			ps.flush();
			//내부적으로 Buffered의 기능을 가지고 있으므로 
			//반드시 내보내기가 끝났으면 버퍼를 비워야 한다.
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				ps.close();
				/*
				 * close()의 기능에는 내부적으로 
				 * flush 함수의 기능을 포함하고 있다.
				 * 따라서 close()를 호출하면 
				 * 자동 flush()가 된다.
				 */
			}catch(Exception e) {
				
			}
		}
	}

	public static void main(String[] args) {
		new PrintStreamTest();

	}

}
