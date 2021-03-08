package day15;

public class Test06 {

	public Test06() {
		/*
		 * ******
		 * Object 타입은 꺼내서 사용할 때 반드시 강제형변환을 해줘야 한다.
		 */
		int no= (int)abc(2);
		System.out.println(no+200);
	
		int num =(int)(Math.random()*5);
		//abc()함수를 num을 이용해서 호출해서 반환값의 원래 타입으로 변환해주세요.
		Object o = abc(num);
		if(o instanceof Boolean) {
		System.out.println("boolean : "+ (boolean) o);
		}
		else if(o instanceof Character ) {
			System.out.println("char : "+ (char) o);
			
		}else if(o instanceof Integer) {
			System.out.println("int : "+ (int) o);
		}
		else if(o instanceof Double) {
			System.out.println("double : "+ (double) o);
		}
		else if(o instanceof String) {
			System.out.println("String : "+ (String) o);
			
		}
	
	}
	
	

	public Object abc(int a) {
		switch(a) {
		case 0:
			return true;
		case 1 : 
			return 'A';
		case 2 : 
			return 100;
		case 3 :
			return 3.14;
		
		}
		return "abcd";
	}
	
	
	public static void main(String[] args) {
		new Test06();
	}

}
