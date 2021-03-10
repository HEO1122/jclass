package day17;
/*
 *    서시 - 윤동주
 * 
 * 죽는 날까지 하늘을 우러러
한 점 부끄럼이 없기를,
잎새에 이는 바람에도
나는 괴로워했다.
별을 노래하는 마음으로
모든 죽어 가는 것을 사랑해야지
그리고 나한테 주어진 길을
걸어가야겠다.

오늘 밤에도 별이 바람에 스치운다.

위 시를 하나의 변수에 기억시켜보자


 */
public class Test03 {

	public Test03() {
		String poem = new String(" 서시 - 윤동주\n");
		//문자열 중 변화가 많은 문자열은 StringBuffer로 작업을 처리하는 것이 좋다.
		StringBuffer buff = new StringBuffer(poem);
		
//		System.out.println(poem);
		
		//문자열을 계속해서 더해준다.
		buff.append("\n");
	
		buff.append("죽는 날까지 하늘을 우러러\n");
		buff.append("한 점 부끄럼이 없기를,\n");
		buff.append("잎새에 이는 바람에도\n");
		buff.append("나는 괴로워했다.\n");
		buff.append("별을 노래하는 마음으로\n");
		buff.append("모든 죽어 가는 것을 사랑해야지\n");
		buff.append("그리고 나한테 주어진 길을\n");
		buff.append("걸어가야겠다.\n");
		buff.append("\n");
		buff.append("오늘 밤에도 별이 바람에 스치운다.\n");
		
		//StringBuffer는 문자열 수정작업이 종료되면 반드시 String 타입으로 변환시켜주는 것이 좋다.
//1		poem = new String(buff); 둘중 한가지 방법 사용
		poem = buff.toString();//2
		
		//출력
		System.out.println(poem);
	}

	public static void main(String[] args) {
		new Test03();
	}
}
