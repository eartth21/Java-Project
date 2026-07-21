package AAA;

public class Exam_10 {

	public static void main(String[] args) {

		Person p = new Person();
		//p.ssn=1111;
	
		p.setSsn("1234567");
		p.setName("김사람");
		p.setGender(true);
		p.setAge(30);
		
		
		
		
		System.out.print("이름: "+p.getName());
		System.out.print("주민번호: "+p.getSsn());
		System.out.print("성별: "+p.isGender());
		System.out.print("나이: "+p.getAge());
	
	}

}
