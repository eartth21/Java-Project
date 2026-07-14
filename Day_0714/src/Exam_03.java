import java.util.Scanner;

public class Exam_03 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.print("급여입력: ");
		int pay = scn.nextInt();
		int bil=50000;
		System.out.printf("급여: %5d\n",pay);
		boolean flag=true;//스위치용

		while(pay!=0) {
			System.out.printf("%5d: ",bil);
			int mok=pay/bil;
			System.out.printf("%3: ",mok);
			pay%=bil;
			
			if(flag) {
				bil=bil/5;
				flag=false;
			}else {
				bil/=2;
			}
		}
	
		
	}

}
