package day19;
/*
 * 
 */
import java.util.*;
public class Test09 {
	public ArrayList names, ages, gens,kees;

	public Test09() {
		setNames();
		setAges();
		setGens();
		setKees();
	}
	//names Setting
	public void setNames() {
		//어레이 리스트 만들기
		names = new ArrayList();
		//데이터 채우기
		names.add("루피");
		names.add("쵸파");
		names.add("상지");
		names.add("조로");
		names.add("보아핸콕");
		names.add("로빈");
		names.add("나미");
		names.add("우솝");
		names.add("브룩");
		names.add("프랭키");
	}
	//ages Setting
	public void setAges() {
		ages= new ArrayList();
		ages.add(34);
		ages.add(14);
		ages.add(54);
		ages.add(55);
		ages.add(76);
		ages.add(37);
		ages.add(34);
		ages.add(34);
		ages.add(146);
		ages.add(55);
	}
	public void setGens() {
		gens = new ArrayList();
		gens.add('M');
		gens.add('M');
		gens.add('M');
		gens.add('M');
		gens.add('F');
		gens.add('F');
		gens.add('F');
		gens.add('M');
		gens.add('M');
		gens.add('M');
	}
	public void setKees() {
		kees = new ArrayList();
		kees.add(165.0);
		kees.add(130.0);
		kees.add(175.0);
		kees.add(175.0);
		kees.add(177.5);
		kees.add(175.5);
		kees.add(170.5);
		kees.add(168.0);
		kees.add(165.0);
		kees.add(170.5);
	}
	public static void main(String[] args) {
	new Test09();

	}

}
