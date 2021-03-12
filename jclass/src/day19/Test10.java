package day19;

import static java.lang.Math.*;
import java.util.*;
public class Test10 {

	public Test10() {
		/*
		 * ArrayList에 랜덤하게 숫자를 입력한 후 
		 * 이것을 정렬해서 출력하자
		 * 
		 */
		ArrayList list = new ArrayList();
		//데이터 채우고
		for(int i = 0; i<10; i++) {
			int tmp=(int)(random()*20+1);
			list.add(tmp);
			
		}
		//list 내용 확인
		System.out.println(list);
		
		//정렬을 해야하는데 여기서는 Collections.sort(List list, Comparator c) 함수를 호출
		Collections.sort(list, new MySort());
		//list 내용 확인
				System.out.println(list);
		
	}

	public static void main(String[] args) {
	new Test10();

	}
	//이 클래스는 전역내부클래스(Global Inner Class)
	public class MySort implements Comparator{
		/*
		 * 정렬방식을 변경하기 위해서는 comparator 인터페이스를 그현하는 클래스를 만들어야한다.
		 */
		/*
		 * 이 클래스도 클래스이기 때문에 당연하게 Object 클래스를 상속받아서 만들어진 클래스이다.
		 * 따라서 Object클래스의 멤버는 모두 이 클래스내에 존재하게 된다.
		 * 
		 * 그 중 equal() 함수도 포함이 되는데
		 * 정렬을 할 때는 equals()를 사용해서 처리하는 것이 아니다.
		 * 
		 * 정렬을 할 때는 특정기준에 따라서 두개의 속성이 크냐 작냐로 정렬을 한다.
		 */
		@Override
		public int compare(Object o1, Object o2) {
			/*
			 * 이 함수는 정렬을 할 때 비교할 대상이 o1, o2가 전달되어 들어온다.
			 * (몰론 JVM이 자동으로 호출해서 넣어준다.)
			 * 우리가 할 일은 이 두개의 데이터를 비교해서 위치를 바꿀지 말지만 
			 * 결정하면 된다.
			 * 이때 반환값이 음수이면 두 개의 위치를 바꾸지 않고
			 * 					양수이면 바꾼다.
			 * 				0이면 두 데이터가 같다.는 의미가 된다.
			 */
			int no1= (int)o1;
			int no2 =(int)o2;
			
			return -(no2-no1);
		}
		
	}

}
