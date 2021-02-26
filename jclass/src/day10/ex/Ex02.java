package day10.ex;
/*���� 2)
 * 2���� ���� �迭�� ������� score�� �����(10�л� 5����) 
 * 1.score�� ������ �����ϰ� �Է����ִ� �Լ��� �����
 * 2. score�� �Էµ� ������ ���ؼ� �л��� ������ ������ִ� �Լ�
 * 3. score�� �л����� ������ �������� �������� �������ִ� �Լ��� �����ؼ�
 * �����ϰ� ����� ����ϼ���.
 */
import java.util.*;
public class Ex02 {
	int[][] score= new int[10][6];
	
	public Ex02(){
		arrayFill(); 			// �迭ä��� �Լ�ȣ��
		total();            //���� ä��� �Լ� ȣ��
		line();
		for(int[] s : score) {
			System.out.println(Arrays.toString(s));
		}
			// �迭 ���
	}
	
	public static void main(String[] args) {
		new Ex02();
	}	
	//�迭�� ä���ִ� �Լ� �����
	void arrayFill() {
		for(int i=0; i<score.length; i++) {//i��° �л�
			for(int j=0; j<score[i].length-1; j++) { //j��° ����
				//���� ���� �����
				int sc = (int)(Math.random()*100 +1);
				//�迭�� ä���ֱ�
				score[i][j]=sc;
			}
		}
	}
	void total() {//������ ������ִ� �Լ�
		for(int i=0; i<score.length; i++) {
			int total=0;
			for(int j =0; j<score[i].length-1; j++) {
				score[i][5] += score[i][j]; //���� ���
//				total=total + score[i][j]; //���� ���
//				score[i][5]=total;// ���� ����
			}
		}
	}
	void line() {// ���� �������ִ� �Լ� 
		for(int i=0; i<9;i++) {//ù��° ������ ��������
			for(int j = i + 1; j<10;j++) {//���� ������ ������.
				if((int)score[i][5]<(int)score[j][5]) {
					int[] tmp= score[i];
					score[i]=score[j];
					score[j]=tmp;	
				}	
			}
		}
	}
}
