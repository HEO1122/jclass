package day11.solv;

public class Stud02 {
		private String name, id, mail, tel;
		private char gen;
		
		//출력함수

		public String toString() {
			return "이름:"+ name +"아이디" +id+" 메일 : "+ mail+"휴대폰 "+ tel+ "성별"+gen;
					
		}
					
					
		public String getName() {
			return name;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
		public String getId() {
			return id;
		}
		
		public void setId(String id) {
			this.id = id;
		}
		
		public String getMail() {
			return mail;
		}
		
		public void setMail(String mail) {
			this.mail = mail;
		}
		
		public String getTel() {
			return tel;
		}
		
		public void setTel(String tel) {
			this.tel = tel;
		}
		
		public char getGen() {
			return gen;
		}
		
		public void setGen(char gen) {
			this.gen = gen;
		}
}