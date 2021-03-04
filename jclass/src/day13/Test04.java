package day13;

public class Test04 {

	public Test04() {
		String str = new String();
		str ="abcd";
		
		String str1 ="abcd";
		
		String str2 = new String("abcd");
		
		
		System.out.println("str==str1:"+(str==str1));
		System.out.println("str==str2:"+(str==str2));
	}

	public static void main(String[] args) {
		new Test04();
	}

}
