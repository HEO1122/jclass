package day20;
/*
 * sample.txt ������ �о Map���� ������ ����.
 */
import java.io.*;
import java.util.*;
public class Test10 {
	Properties prop =new Properties();
	/*
	 * Properties�� Map�� �������� 
	 * �ܺ���ġ�� �����͸� Map���� ������ �� �ִ�.
	 * 
	 */
	public Test10() {
		/*
		 * �ܺ� ���ϰ� ������ �����̴�.
		 */
		FileInputStream fin = null;
		try {
			fin= new FileInputStream("src/day20/sample1.txt");
			/*
			 * �����θ� �̿��ؼ� �о �ȴ�.
			 * ��Ŭ���� �ȿ� �����͸� ����� �̰��� ��Ŭ���� �ڽ��� ��θ�
			 * ���Ӱ� ���ؼ� ó���ϹǷ� ��ó�� ����ص� �ȴ�.
			 * 
			 */
			//fin �� �ܺ���ġ�� �����Ͱ� ���޵� ����̰�
			//�츮�� prop�� ����� �ܺ���ġ�� �����͸� ����Ű��ȴ�.
		prop.load(fin);
		//�� ����� ����Ǹ� ������ ������ �о Map���� ó���� ���ҵ�.
		}catch(Exception e) {
			e.printStackTrace();
		}
	//�������ʹ� ��ġHashMap�� �����Ͱ� ����� ��ó�� ����ϸ� �ȴ�.
		String name = (String)prop.getProperty("name");
		String age = (String)prop.getProperty("age");
		String tel = (String)prop.getProperty("tel");
		String addr = (String)prop.getProperty("addr");
		//���
		System.out.println("�̸� : "+ name);
		System.out.println("���� : "+ age);
		System.out.println("��ȭ : "+ tel);
		System.out.println("�ּ� : "+ addr);
	
	}

	public static void main(String[] args) {
	new Test10();
	}

}
