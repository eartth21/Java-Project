//키보드로 정수 연산자 정수 입력 산술연산을 수행하는 프로그램 작성
//입력: 7 * 7
//출력: 7 * 7 = 49
//System.out.printf("%d * %d = %d\n",7,7,(7*7));

import java.util.Scanner;

public class Exam_07 {
	public static void main(String[] args) {
		/*문자열 비교는 문자열.[문자열=="문자열" XXX, 문자열.equals("문자열")OOO]
		String a = "AAA"
		if(a="AAA") XXX
		if(s.equals("AAA") OOO
		*/
		
		Scanner scn = new Scanner(System.in);
		System.out.print("입력: ");
		int a = scn.nextInt();
		String op = scn.next();
		int b = scn.nextInt();
		int result=0;

		
		if(op.equals("+")) {
			result = a+b;
			}else if(op.equals("-")){
				result=a-b;
			}else if(op.equals("*")) {
				result=a*b;
			}else if(op.equals("/")) {
				result=a/b;
			}else if(op.equals("%")) {
				result=a%b;
			}
		
		if(result != 0) {
			System.out.printf("%d %s %d = %d\n",a,op,b,result);
			}else {
				System.out.println("연산자 오류");
			}
		
		
		
		
		
		
	}
}
