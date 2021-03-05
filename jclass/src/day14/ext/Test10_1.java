package day14.ext;

public class Test10_1 {

	public Test10_1() {
		/*Grand g1 = new Grand(); // Grand 클래스에 Grand인스턴스 생성
		Grand g2 = new Father(); // Grand 클래스에Father인스턴스 생성
		Grand g3 = new Uncle();// Grand 클래스에Uncle인스턴스 생성
		
		Grand[] gg = {g1,g2, g3}; //Grand데이터타입의 gg배열에 초기화
		
		for(Grand g : gg) {// 향상된 for 문으로 Grand데이터타입 g에 gg배열 집어넣기
			g.toPrint(); //
		}
		*/
		
		//랜덤하게 배열에 데이터 넣기
		Grand[] g = new Grand[10];// 일단 Grand[]타입의 g를 초기화하면서 배열생성
		for(int i =0; i<g.length; i++) {
			g[i] = getGrand();
			}
		//배열에 넣어준 데이터 출력
		for(Grand gg : g) { //g에 있는 toPrint()함수를 gg에서도 쓸 수 있다.
			gg.toPrint();
		}
		
		}
		//Grand 타입의 데이터 랜덤하게 반환해주는 함수
		public Grand getGrand() { //[접근지정자][반환값] 함수이름
			Grand g =null; //반환해줄 변수 생성
			
			int no = (int)(Math.random()*3);//0~2사이의 랜덤한 숫자를 만든다.
			//숫자에 따라서 어떤 클래스를 반환해줄지 결정
			switch (no) { //인스턴스를 넣으면 변수와 함수 모두 넣어진다.
			case 0 : 
				g= new Grand(); //0일때는 Grand의 인스턴스를 넣어준다.
				break;
			case 1 :
				g= new Father();// 1일때는 Father의 인스턴스를 넣어준다.
				break;
			case 2 : 
				g = new Uncle();//2일 때는Uncle의 인스턴스를 넣어준다.
				break;
			} 
			return g;
		}
	public static void main(String[] args) {
		new Test10_1();//메인함수에서 Test10()생성자 함수 사용
	}
	
}