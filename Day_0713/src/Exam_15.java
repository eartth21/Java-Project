//키보드로 정수 데이터가 무작위로 n개 입력 될 때 
//입력 데이터 중에서 5이상 데이터 5개 입력하는 프로그램 작성
/* 데이터: 5 9 4 8 6 3 9 66 44 ...
 * 
 */
import java.util.Scanner;

public class Exam_15 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.print("입력: ");
		
		int cnt=0;//5이상의 숫자 카운트 하는 변수
		
		while(true) {
			int n =scn.nextInt();
			if(n>=5) {
				System.out.print(n);
				cnt++;
				if(cnt==5) {
					break;
				}
			}
		}
		
		
		
		
	}

}
