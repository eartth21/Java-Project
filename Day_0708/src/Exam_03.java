//System.out.printf();
//변환기호: %d(10진수(정수), %f(실수), %c(문자), %s(문자열)
public class Exam_03 {

	public static void main(String[] args) {
		System.out.printf("Hello\n");
		System.out.printf("정수 %d\n",200);
		System.out.printf("실수 %f\n",3.14);
		System.out.printf("문자 %c\n",'a');
		System.out.printf("문자열 %s\n","Hello");
		
		System.out.printf("정수= %d 실수= %f 문자열 %s \n",100,3.1234,"Hello");
		
		// 코드값 A' -65, 'a'-97 '0''-48
		System.out.printf("A= %c",65);
		System.out.printf(" a= %c",97);
		System.out.printf(" 0= %c",97);
		System.out.println();
		
		System.out.println("국어   영어   수학   총점  평균");
		System.out.println("국어\t영어\t수학\t총점\t평균");
		
	}

}
