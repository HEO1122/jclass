package day12;
/*
 * 노래 한곡의 데이터를 기억할 클래스 Song을 정의하고
 * 10곡의 데이터를 입력해서
 * 곡명을 입력하면 해당 곡의 정보를 출력해주는 프로그램을 작성하세요
 * 
 * 곡 정보는
 *  곡명(title), 작곡가(composer), 가수(singer), 장르(genre)를 기억하도록 하세요
 *  extra ]
			가수이름을 입력하면 해당 곡들이 출력되게 하세요.
 */
import java.util.*;

import day11.Student;
public class Ex01 {
	Scanner sc = new Scanner(System.in);//입력받기
	public Ex01() {
		Song[] song = setSong();//배열 채우기
		toPrint(song); //출력함수
		sc.close();//스캐너 닫기
	}
	
	//song배열에 인스턴스와 데이터채워주기
	public Song[] setSong() {
		//배열 만들기
		Song[] so = new Song[10];
		//인스턴스 채우기
		for(int i =0; i<so.length; i++) {
			so[i]= new Song();
		}
		//데이터 삽입용 배열
		String[] title = {"clebrity","여수밤바다","뚜두뚜두","버스","자동차","기차","지하철","비행기","자전거","오토바이"};
		String[] composer = {"김둘리","이길동","박또치","김희동","김돌돌","박똘똘","허수경","전은석","나비","갈매기"};
		String[] singer = {"아이유","장범준","블랙핑크","버스","자동차","기차","지하철","비행기","자전거","오토바이"};
		String[] genre = {"락","발라드","댄스","버스","자동차","기차","지하철","비행기","자전거","오토바이"};
		
		//데이터 채우기
		for(int i =0; i< so.length; i++) {
			so[i].setTitle(title[i]);
			so[i].setComposer(composer[i]);
			so[i].setSinger(singer[i]);
			so[i].setGenre(genre[i]);
		}
		
		System.out.println("# 데이터 채우기 완료 #");
		return so;
	}
	
	//곡명을 입력하면 해당 곡의 정보 출력
	public void outSong(Song[] so) {
		//입력도구 준비
		//메시지 출력
		System.out.print("곡명입력 :");
		String stitle= sc.nextLine();
		
		//각 인덱스의 이름을 비교해서 같은 이름이면 정보를 출력해준다.
		for(int i =0; i<so.length;i++) {
			String str = so[i].getTitle();
			if(str.equals(stitle)) {
				so[i].sString();
				break;
			}
		}
	}
	//extra) 가수명을 입력하면 헤당 곡이 출력
	public void outSinger(Song[] so) {
		System.out.println("가수입력 : ");
		String sSinger =sc.nextLine();//입력받은 데이터는sSinger에 대입
		
		//각 인덱스의 이름을 비교해서 정보출력
		for(int i =0; i<so.length; i++) {
			String str = so[i].getSinger();
			if(str.equals(sSinger)) {
				so[i].sString();
			}
		}
		
	}
	//출력용 함수
	public void toPrint(Song[] so) {
		for(int i=0; i<so.length; i++) {
			so[i].sString();
		}
	}
	
//메인함수 실행	
	public static void main(String[] args) {
		new Ex01();

	}

}
