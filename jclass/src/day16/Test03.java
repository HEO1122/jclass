package day16;

import java.io.*;
public class Test03 {

	public Test03() {
		//���ϰ�ü �����
	File file =new File("C:\\calss\\java\\source\\jclass\\bin\\day14");
	//���� ����Ʈ ��������
	String[] list =file.list(new MyFilter());
	//����Ʈ ���� ����ϰ�
	for(String s : list) {
		System.out.println(s);
	}
	System.out.println("������");
	String[] list1 =file.list();
	for(String s : list1) {
		System.out.println(s);
	}
	}

	public static void main(String[] args) {
		new Test03();
	}

}

 class MyFilter implements FilenameFilter{
/*
 * ���� day14 ��Ű������ ������ �̸��� T�� �����ϴ� �͸� ����ϰ��� �Ѵ�.
 */
	@Override
	public boolean accept(File dir, String name) {
		if(name.startsWith("T")) {
			return true;
		}
		return false;
	}
	
}