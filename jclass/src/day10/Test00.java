package day10;
/*�� �迭���� ���� �迭�� 2��° �����͵�� ����迭 5��° �����͵�� ����
 * �迭�� ���弼��
 * 
 */
import java.util.*;
public class Test00 {

	public static void main(String[] args) {
		int[][] no = {
				
					{1,2,3,4,5},
					{2,3,4,5,6},
					{3,4,5,6,7},
					{4,5,6,7,8},
					{5,6,7,8,9},
					{4,5,6,7,8},
					{3,4,5,6,7}
				};
		int[] no1 =new int[7];
		int[] no2 = new int[7];
	//�ݺ��ؼ� �̱�
		
		for(int i=0;i<no.length; i++){//no�� ���̸�ŭ �ݺ�
			for(int j=0; j<no[i].length;j++) { //no �迭���� 2��° 5��° ������ �̱� �ݺ�
				if(j==0|j==2|j==3) {
					continue;
					no1[i]= no[i][j];//no1�� 2��° �� ������ ä���
					no2[i]= no[i][j];//no2�� 4��° �� ������ ä���
				
				}
			}for(int[] n : no1) {
				System.out.println(Arrays.toString(n));
			for(int[] n2 : no2) {
				System.out.println(Arrays.toString(n2));
			}
			}
		}
	
	}

}
