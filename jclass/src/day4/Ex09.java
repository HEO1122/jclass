package day4;

//�Խù��� �Խ��ǿ� ����ϴµ�
//�ϳ��� �Խ��� ���������� �Խù��� 15���� ����� �� �ִ�.
//�Խù��� ������ �����ϰ� �߻���Ų��
//��� �������� �ʿ����� ����ؼ� ������ִ� 
//���α׷��� �ۼ��ϼ���.
/*
 * �Խù� ������ 0���� ���� ��� 1�������� �ʿ��ϴ�
 * �Խù� ������ 15�� ���� �������� ���� �ʿ��� ������ ���� �Խù�����/15
 * �Խù� ������ 15�� ���� �������� �ʴ� ���� �Խù� ����/15+1
 */
public class Ex09 {
	public static void main(String[] args) {
		//�Խù��� �߻�
		int text = (int)(Math.random()*100-0+1)+0;
		
		/*//�������� ���
		int page = (text/15);
		
		//�������� ���
		System.out.println("�Խù� ��:"+text);
		System.out.println("������ ��:"+page);*/
		int page=0;
		
		/*if(text==0) {
			page = -1;
		}else {
				if
			{(text % 15 == 0){
				page=text/15;
			}else {
				page=text/15+1;
			}
		}
		System.out.println("�Խù� ��:"+text);
		System.out.println("������ ��:"+page);
		*/
		if(text ==0) {
			page=1;
		}else if (text%15==0) {
			page=text/15;
		}else {page=text/15+1;
		}
		System.out.println("�Խù� ��:"+text);
		System.out.println("������ ��:"+page);
	}
}