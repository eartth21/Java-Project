/*
 * 자바 기본타입: 8가지
 * 논리: boolean(1Byte)- true / false
 * 정수: byte(1Byte), short(2Byte), char(2Byte), int(4Byte), long(8Byte)
 * 실수: float(4Byte), double(4Byte)
 * 형변환 작은값을 큰값에 넣을땐 자동으로 형변환가능, 큰값을 작은 값에 넣을땐 강제로 형변환시켜줘야함.
 * 참조타입: 클래스(string), 배열 ...
 */

public class Exam_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean bool =true;// t소문자
		byte by = 120;//-128~127
		//byte by2 = 130;	err) byte 최대용량 127
		short sh = 12345;//-32000~32000
		char ch1 = 65;// 문자코드로 전환(자동형변환)
		char ch2 = 'A';//0~65000
		//char ch3 = -65;	err) char 음수값 저장 못함
		int in1 = 700000;
		int in2 = 'a';//자동형변환 char(2Byte) < int(4Byte)
		int in3 = 65;
		//float fl3 = 3.14;	err) 실수의 기본은 double
		float fl1 = 3.14f;
		float fl2 = (float)3.14;//강제형변환
		double do1 = 3.14;
		
		System.out.println("bool= "+ bool);
		System.out.println("by = "+ by);
		System.out.println("ch1= "+ ch1);
		System.out.println("ch2= "+ ch2);
		System.out.println("in1= "+ in1);
		System.out.println("in2= "+ in2);
		System.out.println("in3= "+ in3);
		System.out.println("fl1= "+ fl1);
		System.out.println("fl2= "+ fl2);
		System.out.println("do1= "+ do1);

		
		
	}

}
