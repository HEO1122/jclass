package day18;

/*
 *  ���ڿ��� ������ �������� �ܾ ����� ����غ���
 */
import java.util.*;
public class Test04 {

	public Test04() {
		String str = "�״� ������ �ϴ��� �췯�� �� �� �β������� ���⸦";
/*
 * �� ���ڿ��� ������ �������� �и��Ϸ��� 
 * StringTokenizer�� �̿��ؼ� ó���ϸ� �����ϰ� ó�� �� �� �ֵ�.
 */
		
		StringTokenizer token = new StringTokenizer(str);
		/*
		 * �̷��� ���ڿ��� �Է��ϸ鼭 ��ü�� ����� ���ڿ� �� ������
		 * �߽����� �ܾ���� �߶� ����ϰ� �ȴ�.
		 * 
		 * �� ��� �и��� �ܾ���� ���������� �ӽ� ���۸޸𸮿� ����� �ȴ�.
		 * 
		 */
		int count = token.countTokens();
		/*
		 * ���� ���ڿ��� ������ �������� 7���γ������ִ�.
		 * ������ �ܾ ����Ϸ��� �ݺ��ؼ� ������ �ϴµ�...
		 */
//		String[] words = new String[count];
//		for(int i =0; i<count; i++) {
//			String tmp = (String)token.nextElement();
//			words[i] = tmp;
//			System.out.println(tmp);
//			}
//		for(String s : words) {
//			System.out.print(s +",");
//		}
		/* �� �� ������ �ܾ�� �ӽ� �޸𸮿��� ������ ���� ���� �ȴ�.
			���� �ʿ��ϸ� �迭���� �̿��ؼ� �ٽ� ������ �� ����ؾ� �Ѵ�.
		*/

		/*
		 * ������ �ܾ��� ������ ���� �Ǵ� ���
		 * �� ��� �� �ܾ���� �迭�� 
		 */
		ArrayList<String> list = new ArrayList<String>();
		System.out.println("�߷��� ���� : "+ count);
		while(token.hasMoreTokens()) {
			//hasMoreTokens() : �ӽ� �޸𸮿� ���� �����Ͱ� �����ϴ��� ���� �Լ�
			String tmp = token.nextToken();
			list.add(tmp);
			System.out.println(token.nextToken());
		}
		for(String s : list) {
			System.out.print(s +"|");
		}
	}

	public static void main(String[] args) {
		new Test04();

	}

}