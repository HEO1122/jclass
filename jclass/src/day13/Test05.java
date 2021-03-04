package day13;

public class Test05 {

	public Test05() {
		int[] num = {1,2,3,4,5};
		for(float a : num) {
			//이경우는 자동 형변환이 이루어지기 때문에 처리된다.
			System.out.println(a);
		}
	}

	public static void main(String[] args) {
	 new Test05();
	}

}
