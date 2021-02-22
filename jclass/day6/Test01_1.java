package day6;

public class Test01_1 {
	public static void main(String[] args) {
		
		int sec=0;
		
		double up =0;
		double down=0;
		while(true) {
			++sec;
			up=0.54*sec;
			down=7654-(1.07*sec);
			
			if(up>=down) {
				break;
			}
		}
		System.out.println(sec+ "초 후에 올라가는 사람의 위치는"+up+
				"\n내려가는 사람의 위치"+ down+ sec+"후에 만남" );
		
	}
}
