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
	//����Լ�
	public void sString() {
		 System.out.printf("���� :%10s  ,�۰ :%5s   ,���� :%5s, �帣 : %6s \n",title, composer, singer, genre);
	}
}
