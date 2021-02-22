package day6;

/*10개의 문자를 기억할 메모리를 만들고
 * 메모리에 'A'~'J'까지 차례로 기억한 후 출력하세요.
 */
public class Test05 {
	public static void main(String[] args) {
		char[] ch;
		//heap에 메모리 공간 확보
		ch =new char[10];
		
		for(int i =0;i<10; i++) {
			//'A' +0 ='A'
			//'A'+1 ='B'
			//'A'+2 ='C'
			ch[i] = (char)('A'+i);
		}
		//출력한다.
		for(int i =0; i<ch.length; i++) {
			System.out.print(ch[i]+",");
		}
		System.out.println();
		//향상된 for 명령 for each명령이라고도 한다.
		for(char c: ch) {
			//이 반복문은 배열(ch)에 담긴 내용을 하나씩 꺼내서 
			//변수 c에 순차적으로 대입시킨다.
			//결과적으로 모든 데이터를 순차적으로 꺼내서 처리하고 종료된다.
			System.out.print(c+",");
		}
	}
}
