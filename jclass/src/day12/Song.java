package day12;

public class Song {
	private String title, composer, singer, genre;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getComposer() {
		return composer;
	}

	public void setComposer(String composer) {
		this.composer = composer;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
	//출력함수
	public void sString() {
		 System.out.printf("제목 :%10s  ,작곡가 :%5s   ,가수 :%5s, 장르 : %6s \n",title, composer, singer, genre);
	}
}
