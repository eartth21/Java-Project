
public class Exam_04 {

	public static void main(String[] args) throws Exception {
		// 표준입력: System.in.read(); - 1문자만 입력 가능 , 예외처리필수!
		//System(클래스-첫글자 대문자).in(속성).read()(메소드-괄호포함)
		
		System.out.print("문자를 입력하세요");
		System.out.println("입력된 문자 코드는 "+(char)System.in.read());
		System.out.println("입력된 문자 코드는 "+(char)System.in.read());
		System.out.println("입력된 문자 코드는 "+(char)System.in.read());
		
		
	}

}
