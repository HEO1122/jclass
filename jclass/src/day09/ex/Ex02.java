package day09.ex;
/* 5���� ���� ������ ����� �迭�����弼��
 * ���� ������ ������, �ѷ�, ���̸� ����ϵ��� 
 * �������� �����ϰ� ���� �Է��ϼ���
 * 
 * 2. �� �迭�� 90 �� ȸ����Ų �迭�� ���弼��
 */
import java.util. *;
public class Ex02 {

	public static void main(String[] args) {
		// 5���� �� , ��(������,�ѷ�, ����) �迭
		double[][] circle = new double[5][3];
		//������ ������ �迭�� ����ֱ�
		for(int i =0;i<circle.length; i++) {//5�� ��
			
				circle[i][0]=(int)(Math.random()*(100-1+1)+1);
				circle[i][1]=(double)((circle[i][0])*2*3.14);
				circle[i][2]=(double)((circle[i][0])*(circle[i][0])*3.14);
		
			}
		for( double[] c : circle) {
		System.out.println(Arrays.toString(c));	
		}
		//�ű� �迭 ����
		double[][] circle1 = new double[3][5];
		for(int i =0; i<circle1.length; i++) {
			circle1[0][i]= circle [i][0];
			circle1[1][i] = circle [i][1];
			circle1[2][i] =circle[i][2]; 		
		}
		//���
		for(double[] c1 : circle1) {
			System.out.println(Arrays.toString(circle1));
		}
	}

}


