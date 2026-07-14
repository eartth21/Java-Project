import java.util.Scanner;

public class Exam_02 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.print("급여입력: ");
		int pay = scn.nextInt();
		int bil=50000;
		System.out.printf("급여: %5d\n",pay);
		
		for(int x=1;x<=10;x++) {
			System.out.printf("%5d: ",bil);
			int mok= pay/bil;
			System.out.printf("%3d\n",mok);
			pay=pay%bil;
			
			if(x%2==1) {
				bil/=5;
			}else {
				bil/=2;
			}
			if(pay==0)
				break;
		}
	
		
	}

}
