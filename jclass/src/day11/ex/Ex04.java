package day11.ex;
/* ��4
 * �簢���� 7���� ����� ������ �����
 * ������ ����ϴ� ���α׷��� ���弼��
 * ����3�� �����ϰ� ����� ó���ϼ���
 */
public class Ex04 {
	public Ex04() {
	//�簢�� ����� �迭 ��������
	Sagak[] sagak= new Sagak[7];
	//�ν��Ͻ� ����
	for(int i=0; i<sagak.length; i++) {
		sagak[i]= new Sagak();
	}
	//���� ����
	for(int i =0; i<sagak.length;i++) {
		sagak[i].setGS();
		sagak[i].setDool();
		sagak[i].setNulb();
	}
	//���
	for(Sagak s : sagak) {
		s.print();
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Ex04();
	}

}
