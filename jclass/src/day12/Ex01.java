package day12;
/*
 * �뷡 �Ѱ��� �����͸� ����� Ŭ���� Song�� �����ϰ�
 * 10���� �����͸� �Է��ؼ�
 * ����� �Է��ϸ� �ش� ���� ������ ������ִ� ���α׷��� �ۼ��ϼ���
 * 
 * �� ������
 *  ���(title), �۰(composer), ����(singer), �帣(genre)�� ����ϵ��� �ϼ���
 *  extra ]
			�����̸��� �Է��ϸ� �ش� ����� ��µǰ� �ϼ���.
 */
import java.util.*;

import day11.Student;
public class Ex01 {
	Scanner sc = new Scanner(System.in);//�Է¹ޱ�
	public Ex01() {
		Song[] song = setSong();//�迭 ä���
		toPrint(song); //����Լ�
		sc.close();//��ĳ�� �ݱ�
	}
	
	//song�迭�� �ν��Ͻ��� ������ä���ֱ�
	public Song[] setSong() {
		//�迭 �����
		Song[] so = new Song[10];
		//�ν��Ͻ� ä���
		for(int i =0; i<so.length; i++) {
			so[i]= new Song();
		}
		//������ ���Կ� �迭
		String[] title = {"clebrity","������ٴ�","�ѵζѵ�","����","�ڵ���","����","����ö","�����","������","�������"};
		String[] composer = {"��Ѹ�","�̱浿","�ڶ�ġ","����","�赹��","�ڶʶ�","�����","������","����","���ű�"};
		String[] singer = {"������","�����","����ũ","����","�ڵ���","����","����ö","�����","������","�������"};
		String[] genre = {"��","�߶��","��","����","�ڵ���","����","����ö","�����","������","�������"};
		
		//������ ä���
		for(int i =0; i< so.length; i++) {
			so[i].setTitle(title[i]);
			so[i].setComposer(composer[i]);
			so[i].setSinger(singer[i]);
			so[i].setGenre(genre[i]);
		}
		
		System.out.println("# ������ ä��� �Ϸ� #");
		return so;
	}
	
	//����� �Է��ϸ� �ش� ���� ���� ���
	public void outSong(Song[] so) {
		//�Էµ��� �غ�
		//�޽��� ���
		System.out.print("����Է� :");
		String stitle= sc.nextLine();
		
		//�� �ε����� �̸��� ���ؼ� ���� �̸��̸� ������ ������ش�.
		for(int i =0; i<so.length;i++) {
			String str = so[i].getTitle();
			if(str.equals(stitle)) {
				so[i].sString();
				break;
			}
		}
	}
	//extra) �������� �Է��ϸ� ��� ���� ���
	public void outSinger(Song[] so) {
		System.out.println("�����Է� : ");
		String sSinger =sc.nextLine();//�Է¹��� �����ʹ�sSinger�� ����
		
		//�� �ε����� �̸��� ���ؼ� �������
		for(int i =0; i<so.length; i++) {
			String str = so[i].getSinger();
			if(str.equals(sSinger)) {
				so[i].sString();
			}
		}
		
	}
	//��¿� �Լ�
	public void toPrint(Song[] so) {
		for(int i=0; i<so.length; i++) {
			so[i].sString();
		}
	}
	
//�����Լ� ����	
	public static void main(String[] args) {
		new Ex01();

	}

}
