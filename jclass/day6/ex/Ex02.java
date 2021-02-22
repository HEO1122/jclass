package day6.ex;

/*달팽이가 전봇대(100m)올라가는데 
 * 낮에는 0.87m를 올라가고
 * 밤에는 0.35m를 미끌어진다.
 * 몇 일만에 이 달팽이는 정상에 올라갈 것인가?
 * 단 꼭대기에 올라가면 미끄럼은없다.
 */
public class Ex02 {

	public static void main(String[] args) {
		
		double snail=0;
		int day=0;
		while(true){
			
			day++;
			snail=snail+0.87;
			if(snail>=100) {break;}
			snail=snail-0.35;
			
		}
		System.out.println("걸린 날짜"+day);

	}

}
