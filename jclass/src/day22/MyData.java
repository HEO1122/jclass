package day22;
/*
 * 직렬화가 되기 위해서는
 * 해당 클래스가 반드시 직렬화 가능 클래스여야한다.
 * 	방법)
 * 		implements Serializeable
 * 		만 해주면 된다.
 */
import java.io.*;
public class MyData implements Serializable {
	private String name, tel, mail, addr;
	private int age; 
	private char gen;
	private double height;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGen() {
		return gen;
	}
	public void setGen(char gen) {
		this.gen = gen;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	@Override
	public String toString() {
		return "MyData [name=" + name + ", tel=" + tel + ", addr=" + addr + ", age=" + age + ", gen=" + gen
				+ ", height=" + height + "]";
	}
	
	public boolean equals(Object o) {
		return name.equals(((MyData)o).getName())&&age==((MyData)o).getAge());
	}
	
}
