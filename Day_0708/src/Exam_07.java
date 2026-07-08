import java.util.Scanner;

public class Exam_07 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("1. 입력하시오");
		String str1 = scanner.next();//문자열1 (공백) 문자열2 - 문자열1만 인식
		String str2 = scanner.next();
		
		System.out.print("2. 입력하시오"+"\n");
		String str3 = scanner.nextLine();//문자열1 (공백) 문자열2 - 한 줄 전체 인식
		
	
		System.out.println("str1: "+str1);
		System.out.println("str2: "+str2);
		System.out.println("str3: "+str3);
		
	}

}
