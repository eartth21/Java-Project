//형변환 예제
public class Exam_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char ch = 'A'; //문자('') 또는 정수(650000
		int in1 = 65;
		double do1 = 3.14;
		
		int chInt = ch;//문자를 정수로 형변환(자동); => 65
		
		System.out.println("chInt= "+chInt);
		
		char intCh = (char)in1;//in1= int형 int(4Byte) > char(2Byte) 강제 형변환 필요
		
		System.out.println("intCh= "+ intCh);
		
		int a = 75000;
		char intCh1= (char)a;//강제형변환
		
		System.out.println("intCh1= "+ intCh1);
		
		int intA=100;
		double intDouble = intA;//자동형변환
		
		System.out.println("intDouble= "+intDouble);

		double doubleA=3.14;
		int doubleInt = (int)doubleA;//강제형변환

		System.out.println("doubleInt= "+doubleInt);

	}

}
