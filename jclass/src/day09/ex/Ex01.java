package day09.ex;

import java.util.Arrays;

/*���� 1 ]
		5�л��� 3���� ������ ����ϴ� �迭�� ���弼��.
		��, ������ 70~ 99�� ���̷� �����ϰ� �����
		 �ϳ��� �迭�� ó���ϼ���.
		 int[][] stud =new int[5][3];
		 3������ 5�л��� ������ ����� �迭�� �����
		 �� �迭���� �����͸�  �����ؼ� ä���ִ´�.
		 => int[][] score = new int[3][5];
		  -------------------------------
		  stud�� score�迭�� �����ϴµ� ������ ���� ����ϵ��� �迭�� 
		  ���� �����ϼ���.
		  
		  1. �л����� ���� ���
		  int[][] stud1 =new int[5][4];
		  2. ���� ����..
		  int[][] score1 = new int[3][6];
		  -------------------------------
		  �л��� ������ ���� ������ ���� ����� �迭�� ���� �����ؼ� ó���ϼ���
		 */
public class Ex01 {

	public static void main(String[] args) {
		//5�л��� 3���� �迭
		int[][] stud = new int[5][3];
		
		//�ε����� �ݺ������� ä���ֱ�
		for(int i=0; i<5;i++) {//�л� 5��
			for(int j=0;j<3;j++) {// ����3��
			//�������� �����
		int score = (int)(Math.random()*(99-70+1)+70);	
		//�迭�� �ϳ��� ����ֱ�
		stud[i][j] = score;
			}
			
			
		}//���� for������ ���� ������ ����ϱ�
		System.out.println("1) 5�л��� 3���� ������ ����ϴ� �迭");
		for( int[] s : stud) {
			System.out.println(Arrays.toString(s));
			}
		//3������ 5�л� �迭 �����
		int[][] score = new int[3][5];
		
		//�ݺ������ι迭�� �ű��
		//i��° �л���  ������ ������.
		for(int i=0; i<stud.length;i++) {
			/*
			//i��° �л��� ù��°������ score �迭�� ù��° ���� �迭�� �Ѹ� �ֱ�
			stud[i][0] = score[0][i]; 
			//i��° �л��� �ι�° ������ score �迭�� �ι��� ���� �迭�� �Ѹ� �ֱ�
			stud[i][1] = score[1][i];
			//i��° �л��� ����° ������ score �迭�� ����° ���� �迭�� �Ѹ� �ֱ�
			stud[i][2] =score[2][i];
			*/
			
			for(int j = 0 ; j < stud[i].length; j++ ) {//j��° ������ �ֱ�
				score[j][i] = stud[i][j];//stud�� i��° �л��� j��° ������
			}							//score�� j��° ������ i��° �л��� �ֱ�
		}
		System.out.println("2) 3������ 5�л���ŭ ����ϴ� �迭");
		//���� for������ ���ο� �迭 ���� ������ ����ϱ�
		for(int[] ss : score ) {
			System.out.println(Arrays.toString(ss));
		}
		int[][] stud1 = new int[5][4];//stud�� �����ؼ� ������ ����� �迭
		//stud�� ������ for���� �̿��ؼ� ���� ����ϱ�& stud�� stud1�� �ű��
		for(int i=0; i<stud.length; i++) { //�л� 5�� ��ŭ �ݺ�
			int total=0;
			for(int j =0; j<stud[j].length; j++) {// 3������ �ݺ��ؼ� ����
				stud1[i][j]=stud[i][j];
				total = total + stud[i][j];
				//���� ������ stud1�迭�� �����ؼ� �ֱ�
				stud1[i][3]=total;
			}
		}
		
	
			
		System.out.println("3)�л����� ���� ��� ");
			for(int[] s1 : stud1) {
				System.out.println(Arrays.toString(s1));
			}
	
		//score �迭�� �̿��ؼ� score1�迭�� ���� ���� ���
		//score1�迭 ����
		int[][] score1 = new int[3][6];
		//�ݺ������� score ������ score1 �� �ű��
		for(int i =0; i<score.length;i++) { //3����
			int total =0;
			for(int j =0; j<score[i].length; j++) {//5�л�
				score1[i][j]= score[i][j];// ���� �ű�
				//���� ����ϱ�
				total = total + score[i][j];
				//������ ������ �ε����� �ֱ�
				score1[i][5]=total;
			}
		}
		System.out.println("4) ������ ���� ���");	
		//for������ �迭 ���
		for(int[] s : score1) {
			System.out.println(Arrays.toString(s));	
		}
	}	
}

