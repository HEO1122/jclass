package day16.ex;

/* 
 * String[] str ={ "123", "456", "789",....};�� �ִ� ���
 * �� ���ڿ��� ������ ��ȯ�� ���� �հ� ����� ���ϴ� ���α׷��� �ۼ��ϼ���
 * 
 * ��, �߻��� �� �ִ� ���ܸ� �����Ͽ� ��� ó���ϼ���
 * 	1. �迭�� �ε����� ��� ���
 * 	2. ���ڷ� ��ȯ�� �Ұ����� ���
 * 	3. ����� ����ϴµ� 0���� �������°��..
 */
public class Ex02 {
	String[] str;
	public Ex02() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		new Ex02();
	}
	// ��Ʈ�� �迭 ä���
	public void setString() {
	String[] str = { "123","456","789", "101112","131415","161718"};
	}
	//�� ���ڿ��� ������ ��ȯ
	public void stoInt() {
		for(int i =0; i<6; i++) {
		str = Integer.parseInt(str[i]);}
	}
	//���� ó���ϱ�
	public int addNum() {
		try {
			//	1. �迭�� �ε����� ��� ���
			if(str) {}
			
	}
	}
}
