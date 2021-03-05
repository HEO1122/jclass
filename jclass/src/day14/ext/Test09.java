package day14.ext;

import static java.lang.Math.*;
public class Test09 {

	public Test09() {
		Figure f1 = new Samgak((int)(random()*10)+1,(int)(random()*10)+1);
		f1.toPrint();
		Figure f2 = new Sagak((int)(random()*10)+1,(int)(random()*10)+1 );
		f2.toPrint();
		Figure f3 = new Won((int)(random()*10)+1);
		f3.toPrint();
	}

	public static void main(String[] args) {
		new Test09();

	}

}
