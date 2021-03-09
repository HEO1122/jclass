package day16.ex;

/*
 * 인터페이스Dohyung을 구현한 클래스 Semo, Nemo, Won을 만들고
 * 배열에 랜덤하게 10개를 만들어서 채우고
 * 각 도형의 정보를 출력하세요.
 */
public class Ex01 {
	double[] d = new double[10];
	public Ex01() {
		setD();
	}

	public static void main(String[] args) {
		new Ex01();

	}
	//랜덤하게 배열에 클래스 채워주기
	public void setD(){
		for(int i=0; i<10;i++) {
		int no =(int)Math.random()*3;
			if(no==0) {
				d[i]= Semo();
			}else if(no==1) {
				d[i]=Nemo();
			}else if(no==2) {
				d[i]=Won();
			}
		}
	}

}
