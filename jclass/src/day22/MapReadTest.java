package day22;

/*
 * ObjectTest02���� ������ map.txt
 * ������ �о ����غ���
 * 
 */

import java.io.*;
import java.util.*;
public class MapReadTest {

	
	public MapReadTest() {
		//��Ʈ���غ�
		FileInputStream fin =null;
		ObjectInputStream oin = null;
		try {
			//��Ʈ�������
			fin = new FileInputStream("src/day22/data/map.txt");
			oin = new ObjectInputStream(fin);
			
			//Ŭ������ ��ä�� �д´�. ������ Ŭ����Ÿ�� �״�� ��������
			HashMap data = (HashMap) oin.readObject();
			System.out.println(data);
			System.out.println();
			
			//���� �ϳ��� ����غ���
			System.out.println("name : "+ data.get("name"));
			System.out.println("tel : "+ data.get("tel"));
			System.out.println("mail : "+ data.get("mail"));
			System.out.println("addr : "+ data.get("addr"));
			System.out.println("gen : "+ data.get("gen"));
			System.out.println("age : "+ data.get("age"));
			System.out.println("height : "+ data.get("height"));
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				oin.close();
				fin.close();
			}catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new MapReadTest();

	}

}
