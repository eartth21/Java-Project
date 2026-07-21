class SS{
	int a=10;
}
//싱글톤 클래스 만들기
class Sin{
	//private 외부에서 접근 불가
	private Sin() {}//new 못씀(객체생성 불가) ->자기가 자기자신 생성자 만들어서 값 리턴
	
	static Sin s = new Sin();//자신 스스로 객체를 생성, static으로 공유
	
	static Sin getSin() { //getSing()메소드로 s값 공유
		return s;
	}
}
public class Exam_05 {

	public static void main(String[] args) {

		SS s1 = new SS();//객체(인스턴스) 생성
		SS s2 = new SS();
		SS s3 = new SS();
		
		System.out.println("s1= "+s1);
		System.out.println("s2= "+s2);
		System.out.println("s3= "+s3);
		
		//Sin s = new Sin();-new 객체 생성 불가
		
		Sin sin1 = Sin.getSin();
		Sin sin2 = Sin.getSin();
		
		System.out.println("sin1= "+sin1); // sin1,sin2 참조값 같음
		System.out.println("sin2= "+sin2);

		
		
		
	}

}
