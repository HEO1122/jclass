package day11;

public class Test07 {
	public Test07() {
		/*
	Nemo1 n1 = new Nemo1();
	Nemo1 n2 = new Nemo1();
	System.out.println("n1 가로 - 세로: "+ n1.garo+"/"+n1.sero);
	System.out.println("n2 가로 - 세로: "+ n2.garo+"/"+n2.sero);
		 */
		//5개의 Nemo를 관리할 배열을 만들고 각 네모의 면적을 출력해보자
		Nemo1[] nemo = new Nemo1[5];//이상태는 Nemo1의 인스턴스를 기억할 방 5개만 준비해놓은 상태이고
		//각 방에는 인스턴스가 채워지지 않은상태이다. 
		//따라서 각 방에 인스턴스를 만들어서 기억시켜야 한다.
		for(int i =0 ; i<nemo.length; i++) {
			nemo[i] = new Nemo1();
		}
		//이제 인스턴스가 채워졌으니 각 Nemo1에는 가로세로가 셋팅이 되어있을 것이고 면적출력
		for(int i =0; i<nemo.length; i++) {
			int garo =nemo[i].garo;
			int sero =nemo[i].sero;
			int area =nemo[i].getArea();			
			System.out.printf("가로 : %2d || 세로 : %2d 면적 %3d\n",garo,sero,area);
			
		}
		
		//향상된 for 명령으로 처리하는 방법
		for(Nemo1 n : nemo) {
			int garo =n.garo;
			int sero =n.sero;
			int area =n.getArea();
			System.out.printf("가로 : %2d || 세로 : %2d 면적 %3d\n",garo,sero,area);
		}
	}
		public static void main (String[] args) {
	}
}
