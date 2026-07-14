/*
 * N개의 배열에 저장된 데이터를 출력
 * 마지막에 평균을 구하여 출력하고 평균 이상 데이터 및 데이터 수 출력
 * data: 90,75,80,77,85,79,95,80,85,90,77
 * 최대값:  
 * 최소값: 
 * 합계(전체합-최대-최소)
 */

public class Exam_13 {

	public static void main(String[] args) {
		
		int score[]= {90,75,80,77,85,79,95,80,85,90,77};
		System.out.print("Data: ");
		for(int a:score) {
			System.out.printf("%4d",a);
		}
		System.out.println();
		//최대, 최소, 전체합
		
		int max=score[0];
		int min=score[0];
		int tot=score[0];
		
		for(int x=1;x<score.length;x++) {
			tot+=score[x];
			if(score[x]>max) {
				max=score[x];
			}else if(score[x]<min) {
				min=score[x];
			}
		}
		
		System.out.println("최대값: "+max);
		System.out.println("최소값: "+min);
		System.out.println("합계: "+(tot-max-min));

		
		
		
	}

}
