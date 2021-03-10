package day17.ex;

class Student01{
	String name;
	Student01(String name){
		this.name= name;
	}
	public boolean equals(Object obj) {
		Student01 obj1 = (Student01)obj;
		return name ==obj1.name;
	}
}

public class Objectdemo {


	public static void main(String[] args) {
		Student01 s1 = new Student01("egoing");
		Student01 s2 = new Student01("egoing");
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));

	}

}
