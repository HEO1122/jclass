package day18;

import java.text.*;
public class Test11 {

	public Test11() {
		/*
		 * ChoiceFormat�� ���� �� limits�� formats�� �ϳ��� ���� �� �ִ�.
		 * ����� ����)
		 * 60#D : �۰ų� ������ �ǹ� =<
		 * 70<C : <�� �ǹ��̴�.
		 * 
		 * �̰��� |�� �̿��ؼ� �����Ͽ� ����ϸ�ȴ�.
		 */
		String pattern ="0#F|60#D|70#C|80<B|90#A";
		/*
		 * 60#D : 60<= �ǹ� ���� ���ں��� ���� ���� D�� ġȯ�ϼ���
		 * 80<B : 80< �ǹ��̰� ���� ���ں��� �������� B�� ó���ϼ���
		 */
		ChoiceFormat form = new ChoiceFormat(pattern);
		int score = 90;
		String grade = form.format(score);
		System.out.println(score + "| "+ grade);
	}

	public static void main(String[] args) {
		new Test11();
	}
}
