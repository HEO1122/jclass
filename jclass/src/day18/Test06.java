package day18;

/*
 * ���� ��ǻ���� ��¥�� �ð��� ����غ���
 */
import java.util.*;
public class Test06 {

	public Test06() {
	Date date = new Date();
	try {
	Thread.sleep(3000);
	}catch(Exception e) {}
	
	for(int i = 0; i<10;i++) {
		try {
		Thread.sleep(1000);
		}catch(Exception e) {}
		date= new Date();
	}
	;
	//�⵵, ��, �� , ���� ,�ð�, �� , �ʸ� �������
	int year= date.getYear()+1900;
	//�⵵�� ������ 1900�� �������� �ϱ� ������ ������ �����Ϳ� 1900�� 
	//������� ��Ȯ�� �⵵�� ���´�
	int month =date.getMonth()+1;
	System.out.println(year+"��");
	//���� ������ 0 ���� ����ϱ� ������ ��Ȯ�� ���� +1�� ����� �Ѵ�.
	System.out.println(month+"��");
	
	int day = date.getDate();
	System.out.println(day+"��");
	
	int week =date.getDay();
	String sweek= getSweek(week);
	//������ 0~6������ ���ڷ� ��ȯ���ְ� ���� �Ͽ��Ϻ��� ����� ������ �ǹ��Ѵ�.
	System.out.println(week);
	System.out.println(sweek+",");
	//�ð�
	int hour =date.getHours();
	System.out.println(hour+"��");
	//��
	int min =date.getMinutes();
	System.out.println(min);
	//��
	int sec =date.getSeconds();
	System.out.println(sec);
	
	}
	public String getSweek(int week) {
		String sweek="";
		switch(week) {
		case 0 :
			sweek= "�Ͽ���";
			break;
		case 1 :
			sweek= "������";
			break;
		case 2 :
			sweek= "ȭ����";
			break;
		case 3 :
			sweek= "������";
			break;
		case 4 :
			sweek= "�����";
			break;
		case 5 :
			sweek= "�ݿ���";
			break;
		case 6 :
			sweek= "�����";
			break;
		}
		
		return sweek;
	}

	public static void main(String[] args) {
		new Test06();

	}

}
