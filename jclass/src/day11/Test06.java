package day11;

public class Test06 {
	public Test06() {
		Nemo sagak1 = new Nemo();
		System.out.println("가로 -세로: "+sagak1.garo + "/"+ sagak1.sero);
		sagak1.garo =2;
		sagak1.sero=3;
		System.out.println("가로 -세로: "+sagak1.garo + "/"+ sagak1.sero);
		Nemo sagak2 = new Nemo();
		System.out.println("sagak1의 면적 : "+ sagak1.getArea());
		
		//2단계 . 배열을 만들어 보자.
		Nemo[] nemo = new Nemo[3];//이 상태는 3개짜리 네모를 방만 만들어 놓은 상태이다
		//이 배열을 정상적으로 사용하려면 각 방에 네모의 인스턴스를 기억시켜줘야한다.
//		System.out.println("첫번째 네모의 가로 : "+ nemo[0].garo);//아직 배열의 방에 데이터가 결정이 되지 않아 에러발생
		for(int i =0; i<nemo.length; i++) {
			nemo[i] = new Nemo();
		}
		/*nemo[0]= new Nemo();
		 * nemo[1]= new Nemo();
		 * nemo[2]= new Nemo();
		 */
		System.out.println(nemo[0].garo);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Test06();
	}

}
