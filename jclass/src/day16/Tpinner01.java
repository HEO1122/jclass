package day16;

public class Tpinner01 {
	int num =100;
	void abc() {
		System.out.println("Tprinner01.num : "+ num);
	}
	class GInner {//전역 내부클래스
		int no1 =50;
		public GInner() {
			System.out.println("여기는 GInner()####");
		}
	}
	static class TPCls{//탑레벨 내부 클래스
		int no2= 5000;
		public void xyz() {
			System.out.println("******여기는 TPCls *****");
		}
	}
	
	void aaa() {
		class Aaa{//지역 내부 클래스
			public Aaa() {
				System.out.println("########여기는 Aaa ######");
			}
		}
		new Aaa();
	}
}
