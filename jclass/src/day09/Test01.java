package day09;

public class Test01 {

	public static void main(String[] args) {
	Object[] obj = new Object[] {"ȫ�浿", 18, 'M', false, 178.5};

	obj[4]= "178.5";
	
	obj[1] = (int)obj[1]+1;
	 for(Object o : obj) {
		 System.out.print(o+ " ,");
	 }
	}

}
