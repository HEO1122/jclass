package day11;

import java. util. *;
public class Test01 {
	public int num = 999;
//	public void Test01() { 
	//-��ȯ���� �ִ� �Լ��� Ŭ���� �̸��� ������ �Լ��� ������ �Լ����ƴ϶� �Ϲ��Լ��̴�.
//		System.out.println("$$$$$$$");
//	}
	/*"1234-56"�� ���� ���ں�ȣ���� ���ڿ� ����� �ִ� �Լ�
	 * 1. �Է¹޴� �Լ�
	 * 2. �����ȣ�� ��ȭ���ִ� �Լ�
	 * 2-0. �����ȣ �ε��� ��ȯ���ִ� �Լ�
		2-1. �����ȣ�� ��ȯ���ִ� �Լ�
	 * 3. ������ �Է��ϸ� ���ڸ� �迭�� ��ȯ�� �ִ� �Լ�
	 * 4. ���ó�����ִ� �Լ�
	 * 
	 */
	public Test01() {
		String str =inStr();
		double result =calc(str);
		System.out.println("�Է��� ���� "+ str +" :" + result);
	}
	//1. ���ڿ� �Է� ����ó������
	public String inStr() {
		String str = "";
		//�Էµ��� �غ�
		Scanner sc= new Scanner(System.in);
		//�޼��� ����ϰ� 
		System.out.println("�����Է� :");
		//�Է¹��� ������ ������ ����ϰ�
		str =sc.nextLine();
		//���ڿ� ��ȯ���ֱ�
		return str;
	}
	//2. ���ڿ����� �����ȣ�� �ε��� ��ȯ���ִ� �Լ�
	public int getIdx(String str) {
		//��ȯ�� ���� �����
		int idx=0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)=='+') {
				idx=i;
				break;
			}else if(str.charAt(i)=='-') {
				idx =i;
				break;
			}else if(str.charAt(i)=='%') {
				idx =i;
				break;
			}else if(str.charAt(i)=='/') {
				idx =i;
				break;
			}else if(str.charAt(i)=='*') {
				idx =i;
				break;
			}
		}
		return idx;
	}
	//2-0�����ȣ ���ڷ� ��ȯ���ִ��Լ�
	public String getBuho(String str, int idx) {
		String result = "";
		result = str.substring(idx,idx+1);
		return result;
	}
	/*
	 * ���ڿ�ó���Լ�
	 * charAt() = ��ȯ�� :char
	 * indexOf() = ��ȯ�� : int
	 * subString() =��ȯ�� : String
	 * legth() =��ȯ�� : int ���ڿ��� ���� ��ȯ ������ �ε��� ���� 1��ũ��.
	 */
	
	//3. ������ �Է��ϸ� ���ڸ� �迭�� ��ȯ�� �ִ� �Լ�
	public int[] getNums(String str, int idx) {
		int[] num = new int[2];
		//���ڿ��� �߶�
		String sno1= str.substring(0,idx);
		int no1=	Integer.parseInt(sno1);
		String sno2 = str.substring(idx+1); //123-45���� 45����
		int no2= Integer.parseInt(sno2);
		//�迭�� ä���
		num[0] = no1;
		num[1] =no2;
		//�ϼ��� �迭 ��ȯ���ְ�
		return num;
	}
	//4.���ó�� �ϴ� �Լ�
	public double calc(String str) {
		double result = 0;
		//�����ȣ �ε��� ����
		int idx =getIdx(str);
		//�����ȣ ����
		String buho =getBuho(str, idx);
		//���ڸ� �迭�� ����
		int[] nums = getNums(str, idx);
		// ��ȣ�� ���� ����ϰ� 
		switch(buho) {
		case "+" :
			result = nums[0] +nums[1];
			break;
		case "-" :
			result = nums[0]-nums[1];
			break;
		case" *":
			result = nums[0]*nums[1];
			break;
		case"/" :
			result = (double)(nums[0]/nums[1]);
			break;
		case"%" :
			result = nums[0]%nums[1];
		}
		return result;
	}
	public static void main(String[] args) {
		new Test01();//new �������� �����ڸ� ȣ���� �� �ֵ�.

	}

}
