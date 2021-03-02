package day11.ex;
/*
 * 문1 삼각형의 정보를 기억할 클래스(Semo)를 정의하고 
 * 그 클래스 타입의 데이터 다섯개를 기억할 배열을 만들어서
 * 밑변  : xx- 높이 :  xx -면적 :xxx의 형식으로 출력하세요
 * 밑변과 높이는 인스턴스가 만들어질 떄  5~15사이의 정수로 랜덤하게 입력이 되도록
 * 처리하세요
 * 면적은 함수로 처리하세요
 */
public class Ex01 {
	public Ex01() {
		//5개의 배열을 만들고
		Semo[] semo = new Semo[5];
		//배열에  세모 객체 채워넣기
		for(int i=0; i<semo.length; i++) {
			semo[i]= new Semo();
		}
		//밑변, 높이, 면적 출력
		for(int i=0; i<semo.length;i++) {
			int width = semo[i].width;//배열의 가로를 변수에 대입
			int height = semo[i].height;//배열의 세로를 변수에 대입
			double area = semo[i].semArea();//넓이 구하는 함수로 넓이 배열에 대입
			System.out.printf("밑변 : %2d - 높이 : %2d - 면적 : %5.2f\n", width, height, area);
		}
		
		
	}
	public static void main(String[] args) {
		new Ex01();
	}
}
