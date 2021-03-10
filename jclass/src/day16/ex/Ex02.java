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
	int[] nums;
	public Ex02() {
		exec1();
	}

	public String exec1() {
		try {
			setString();
			stoInt();
			sum();
			avg();
		} catch (ArrayIndexOutOfBoundsException e) {
			String s ="�迭�� �ε����� ������ϴ�.";
			return s;
		} catch(NumberFormatException e) {
			String s1 ="���ڷ� ��ȯ�� �Ұ����մϴ�.";
			return s1;
		} catch(ArithmeticException e) {
			String s2 = "0���� ���� �� �����ϴ�.";
			return s2;
		} catch(Exception e) {
			String s = "�� �� ���� �����Դϴ�.";
			return s;
		}
		
		return "";
	}
	public static void main(String[] args) {
		new Ex02();
	}
	// ��Ʈ�� �迭 ä���
	public void setString() throws ArrayIndexOutOfBoundsException {
		str = new String[]{"123","456","789", "101112","131415","161718"};
		nums = new int[str.length];
	}
	//�� ���ڿ��� ������ ��ȯ
	public void stoInt() throws NumberFormatException{
		for(int i =0; i<6; i++) {
			nums[i] = Integer.parseInt(str[i]);}
		}
	//�� ��ȯ�� ���� �� ���ϴ� �Լ�
	public int sum()  {
		int tmp =0;
		for(int i=0;i<nums.length; i++) {
			tmp +=	(int)nums[i];
		}
		return tmp;
	}
	//�� ��ȯ�� ���� ����� ���ϴ� �Լ�
	public void avg() throws ArithmeticException {
		int tmp =sum();
		tmp = tmp/nums.length;
	}


}
