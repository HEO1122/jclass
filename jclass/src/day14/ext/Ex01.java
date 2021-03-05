package day14.ext;

/*
 * 전 예제에서 작성한 Samgak, Sagak, Won 클래스를  10개를 기억할배열을만들고
 * 랜덤하게 각 클래스의 인스턴스를 채워서 출력하는 프로그램을 작성하세요.
 */
public class Ex01 {

	
	public Ex01() {
		//1. Figure 클래스를 상속한 Samgak, Sagak, Won 클래스를 만들어준다.
		/*
		Figure f1 = new Samgak(5,2);//f1에 인스턴스 넣어주기
		Figure f2 = new Sagak(3,2); //f2에 인스턴스 넣어주기
		Figure f3 = new Won(2);   //f3에 인스턴스 넣어주기
		*/
			
		
		//2. 10개의 클래스를 기억할 배열 만들기
		Figure[] f = new Figure[10];//new 명령을 통해 초기화
		for(int i=0; i<f.length; i++) {//f 배열을 반복해서 채워준다.
			f[i]= getFigure(); //f[i]번째 인덱스에는 getFigure()함수를 통해서 초기화해준다.
			}
		for(Figure fa : f) {
			fa.toPrint(); 
		}
	
	
	}
	
	//3. 랜덤하게 반환해주는 함수
	public Figure getFigure() {
		Figure f =null;
		int no = (int)(Math.random()*3);//no는 3개 랜덤한 수 생성됨
		switch(no) {
		case 0: //0일 경우 Samgak 클래스
			f= new Samgak((int)(Math.random()*10 + 1), (int)(Math.random()*10 + 1));
			break;
		case 1 : //1일 경우 Sagak 클래스
			f =new Sagak((int)(Math.random()*10 + 1), (int)(Math.random()*10 + 1));
			break;
		case 2 :  //2일 경우 Won 클래스
			f=new Won((int)(Math.random()*10 + 1));
			break;
		}
		 return f;	
	}
	



	public static void main(String[] args) {
			new Ex01();

	}

}
