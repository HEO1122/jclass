package day09.ex;


import java. util. *;
public class Ex01_01 {
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
	  
	  --------------------------------
	  �̸� 	����		����		����		����		���		����
	 ȫ�浿	95		75		100 
	 ��浿	80		60		50 
	 ...
	 ����		
	 ���	
	 */
public static void main(String[] args) {
	Object[] title = new Object[] {"�̸�","����","����","����", "����","���", "����"};
	
	String[] name = {
		"ȫ�浿", "��浿", "�Ѹ�", "����", "������", "����", "���"	
	};
	
	Object[][] stud = new Object[8][7];
	
	// ���� ä���
	stud[0] = title;
	
	//stud i=1~7,0�� �̸� ����ֱ�
	for(int i=1; i<8;i++) {
		stud[i][0]= name[i - 1];
	}
	
	// ���� �ʱ�ȭ
	for(int i = 1 ; i < stud.length - 2; i++) {
		stud[i][stud[i].length - 1] = 1;
	}
	//stud �迭�� ���� �Է�
	for(int i=1; i<stud.length-2; i++) {//i��° �л�
		int total1=0; //�л� ���� ����
		double avg1=0.;//�л���� ����
//		System.out.println("**************");
		for(int j =1; j<stud[i].length-3; j++) {//j��° ����
			int score= (int)(Math.random()*(100-0+1));//��������
			stud[i][j]= score;//��������
			total1 += (int)stud[i][j];//�л� �������ϱ�
			avg1= total1/3;//�л���� ���ϱ�
			stud[i][stud[i].length-3]=total1;// �л� ��������
			stud[i][stud[i].length-2]= avg1;//�л� ��� ����
			
		}
	}
	
	// ���� ������ ��� ���ϱ�
	for(int i=0; i<stud.length-2;i++) {
		int total =0;
		double avg =0.;//������պ���
		for(int j=0; j<stud[i].length; j++) {
			total += (int)stud[i][j];//��������
			stud[stud.length-2][j] = total;// ������������
			avg= total/5;//���� ��ձ��ϱ�
			stud[stud.length-1][j]=avg;//������� ����
			
		}
	}
	
	
	for(Object[] o : stud) {
		System.out.println(Arrays.toString(o));
	}
	
	/*//����
	for(int i =0; i<10; i++) {// ����
		for(int j=0; j<10; j++) {//�� ���
			if(i==j) continue;//i�� j�� ���� ��� �ٽ� ����
			
			if(no[i][0]<no[j][0]) {
				no[i][1]+=1; //������ 1 ���Ѵ�.
			}
		}
	}
	System.out.println(Arrays.deepToString(no));
	*/
	}
}
