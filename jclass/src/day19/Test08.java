package day19;

/*
 * �ﰢ�� 10���� �����ϰ� ���� ���Ϳ� �����Ѻ��� �׸��� �������
 */
import java.util.*;
import static java.lang.Math.*;
public class Test08 {

	public Test08() {
		//�ǹ̴� �����͸� ����� ������ 10���̰� �����ϴ� ������ 1���� �����Ѵ�. 
		Vector vec =new Vector(10,1);
		
		//����10���� ä���.
		for(int i =0; i<10; i++) {
			//����ü �����
			Semo semo = new Semo(getInt(),getInt());
			//���Ϳ� ����ü �־��ְ�
			vec.add(semo);
		}
	
	//������ ���
	for(Object o : vec) {
		//�� �濡�� ����ü�� �����װ� ����ҷ��� ������ ����Ÿ������ ���� ����ȯ
//	System.out.println(o); �̰��� �� ������ �������̵��� toString()�Լ� ȣ���
		//toPrint()�Լ�ȣ��
		((Semo)o).toPrint();
	/*
	 * ���濡 ä���� �����ʹ� Object o = new Semo(getInt(),getInt());
	 */
	}
	System.out.println(vec.capacity());
	vec.add(new Semo(getInt(),getInt()));
	System.out.println("�߰��� �뷮:"+ vec.capacity());
}
//�������� ��ȯ
public int getInt() {
	return (int)(random()*10+1);
}
	public static void main(String[] args) {
new Test08();
	}
}
