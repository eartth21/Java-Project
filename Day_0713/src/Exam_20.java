/* 키보드로 7개의 점수를 입력, 최대,최소,합계,(합계-최대-최소)출력하는 프로그램 작성
 * for()문 사용
 * 입력: 9 5 8 6 7 4 3
 */

import java.util.Scanner;

public class Exam_20 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.print("입력: ");
		int score= scn.nextInt();
		int max = score;
		int min = score;
		int tot = score;
		System.out.print("점수: "+score+" ");
		
		for(int x=1;x<=6;x++) {
			score=scn.nextInt();
			System.out.print(score+" ");
			if(score>max) {
				max= score;
			}else if(score<min) {
				min= score;
			}
			tot+=score;
		}
		
		System.out.println("\n최대: "+max);
		System.out.println("최소: "+min);
		System.out.println("합계: "+(tot-max-min));


		
		
		
	}

}
