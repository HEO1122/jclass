package day11;
/* �츮�� ģ������ ������ ����� Ŭ������ �����ϰ�
 * �Ѹ� ������ �Է��ؼ� ����غ���.
 * 5�� �Է��ؼ� ����غ���.
 */

public class Test08 {
	public Test08() {
		String[] name = {"������","�����","��ä��","������","������"};
		String[] id = {"euns","soo","won","jin","sin"};
		String[] mail = {"euns@increapas.com","soo@increapas.com","won@increapas.com",
				"jin@increapas.com","sin@increapas.com"};
		String[] tel = {"010-3175-9042","010-1111-2222","010-2222-2222","010-3333-3333","010-4444-4444"};
		char[] gen ={'M','F','F','F','M'};
		Stud[] stud =new Stud[5];
		for(int i=0;i<stud.length; i++) {
			//���濡 �ν��Ͻ� ���� ä���ְ�
			stud[i] = new Stud();
			//������ �������ְ� 
			stud[i].name=name[i];
			stud[i].id=id[i];
			stud[i].mail=mail[i];
			stud[i].tel=tel[i];
			stud[i].gen =gen[i];
		}
		//���
		for(int i=0; i<stud.length; i++) {
			System.out.println(stud[i].toString());
		}
	}
	public static void main(String[] args) {
	 new Test08();	
	}
}
