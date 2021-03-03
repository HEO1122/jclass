package day12.ex;

/*
 * 5~20사이의 정수를 랜덤하게 발생시켜서 그 정수개 만큼의 1~10 사이의 
 * 정수를 발생시켜서 합을 구하는 프로그램을 작성하세요
 */
public class Ex02 {
	int no, sum, cycle;
	int[] narray =  new int[no];// 반복할 횟수만큼의 배열
	public Ex02() {
		ranNum();
		getSum(no);//,합구하는 함수호출
	}
	public void ranNum() {//1~10사이의 정수 생성
		no= (int)(Math.random()*(10-1+1)+1);
	}
	
	public void getSum(int ...no){//반복할 횟수 생성후 합구하고 출력
		cycle =(int)(Math.random()*(20-5+1)+5);
		for(int i=0; i<cycle; i++) {
			sum= sum+no[i];
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {
		new Ex02();//함수실행

	}

}
