package day11;

public class Stud {
	public String name, id, mail, tel;
	public char gen;
	
	public String toString() {
		String str= "�̸�"+name +"\n���̵� :"+ id+"\n ����"+mail+
				"\n��ȭ"+ tel +"\n����"+((gen=='M')?"����": "����");
		
		return str;
	}
}
/*�� Ŭ���� ó�� Ŭ���� ����� ������θ� ������ Ŭ������ 
 * ******
 * VO(Value Object)�Ǵ� DTO(Data Transfer Object)��� �θ���
 * �̷� ũ������ ����ϴ� ������
 * �����͸� ������ �������� �̷� Ŭ������ ����Ѵ�.
 */
