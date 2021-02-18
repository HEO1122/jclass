package day4;

//게시물을 게시판에 출력하는데
//하나의 게시판 페이지에는 게시물을 15개를 출력할 수 있다.
//게시물의 갯수를 랜덤하게 발생시킨후
//몇개의 페이지가 필요한지 계산해서 출력해주는 
//프로그램을 작성하세요.
/*
 * 게시물 갯수가 0개인 경우는 적어도 1페이지가 필요하다
 * 게시물 갯수가 15로 나눠 떨어지는 경우는 필요한 페이지 수는 게시물갯수/15
 * 게시물 갯수가 15로 나눠 떨어지지 않는 경우는 게시물 갯수/15+1
 */
public class Ex09 {
	public static void main(String[] args) {
		//게시물수 발생
		int text = (int)(Math.random()*100-0+1)+0;
		
		/*//페이지수 계산
		int page = (text/15);
		
		//페이지수 출력
		System.out.println("게시물 수:"+text);
		System.out.println("페이지 수:"+page);*/
		int page=0;
		
		/*if(text==0) {
			page = -1;
		}else {
				if
			{(text % 15 == 0){
				page=text/15;
			}else {
				page=text/15+1;
			}
		}
		System.out.println("게시물 수:"+text);
		System.out.println("페이지 수:"+page);
		*/
		if(text ==0) {
			page=1;
		}else if (text%15==0) {
			page=text/15;
		}else {page=text/15+1;
		}
		System.out.println("게시물 수:"+text);
		System.out.println("페이지 수:"+page);
	}
}