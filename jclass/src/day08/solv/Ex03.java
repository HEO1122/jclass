package day08.solv;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=1;
		for(int i=0;i<5;i++) {
			for(int j =0; j< i+1;j++) {
				System.out.printf("%2d", no++);
				
			}
			System.out.println();
		}
		for(int i=0; i<5;i++) {
			for(int j=0; j<i+1; j++) {
				System.out.printf("%2d",(i*(i+1)/2+1+j));
			}
			System.out.println();
		}
	}

}
