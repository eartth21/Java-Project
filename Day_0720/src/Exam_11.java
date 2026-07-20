class Person{
	int num;
	String name;
	int age;
	
	Person(){
		this(9,"ddd",30);//자신의 생성자 - 처음에 한번만 사용가능
	}
	
	Person(int num, String name, int age){
		this.num=num;
		this.name=name;
		this.age=age;
	}
	void personPrint() {
		System.out.println("번호: "+num);
		System.out.println("이름: "+name);
		System.out.println("나이: "+age);
	}
}
public class Exam_11 {

	public static void main(String[] args) {
		Person p1 = new Person(1,"AAA",20);
		Person p2 = new Person(2,"BBB",25);
		Person p3 = new Person(3,"CCC",30);
		Person p4 = new Person();
				
		p1.personPrint();
		p2.personPrint();
		p3.personPrint();
		p4.personPrint();
	}

}
