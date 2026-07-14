import java.util.Scanner;

public class Exam_01 {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		System.out.print("정수 입력");
		int num = scn.nextInt();
		int sum=0;
		
		for(int x=1;x<=num;x++) {
			System.out.printf("%3d",x);				
			if(x%10==0)
				System.out.print("\n");				
			if(x%2==1) {
				sum+=x;
			}
		
		}
		System.out.println("\n홀수합: "+sum);
		
		
	}
}
