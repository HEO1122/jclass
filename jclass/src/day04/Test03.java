package day04;
//구구단 5단 출력
public class Test03 {
	public static void main(String[] args) {
		int dan =5;
		for(int i=0; i<9; i++) {
			System.out.println(dan+"x"+(i+1)+"="+(dan*(i+1)));
		}
	}
}
