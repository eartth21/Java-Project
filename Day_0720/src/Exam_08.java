class Point{
	//멤버변수, instance 변수 - 객체 생성할 때 default 값으로 묵시적 초기화됨
	int a;
	int b;
	int c = 5;//명시적 초기화
	
	static int d;//정적(클래스)변수-메소드 영역에 만들어짐, 객체가 생성되기 전부터 생성됨
}
public class Exam_08 {

	public static void main(String[] args) {

		Point p1 = new Point();
		Point p2 = new Point();
		
	}

}
