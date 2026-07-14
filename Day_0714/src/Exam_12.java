/*
 * N개의 배열에 저장된 데이터를 출력
 * 마지막에 평균을 구하여 출력하고 평균 이상 데이터 및 데이터 수 출력
 * data: 90,75,80,77,85,79,95,80,85,90,77
 * 평균: 83.0 
 * 평균 이상: 90 85 95 85 90
 * 평균 이상 데이터 수: 5
 */
public class Exam_12 {

	public static void main(String[] args) {

		int score[]= {90,75,80,77,85,79,95,80,85,90,77};
		int sum=0;
		
		System.out.print("Data: ");
		
		for(int a:score) {
			System.out.print(a+" ");
			sum+=a;
		}
		double ave=(double)sum/score.length;
		
		System.out.println("\n평균: "+ave);
		System.out.print("평균이상: ");
		
		int cnt=0;
		for(int x=0;x<score.length;x++) {
			if(score[x]>=ave) {
				System.out.print(score[x]+" ");
				cnt++;
			}
		}
		
	/*	확장 for()
	 * 	for(int val:score){
	 * 		if(val>=ave){
	 * 			System.out.printf("%3d",val);			
	 * 			cnt++;
	 * 		}
	 * 	}
	 */ 
		
		System.out.println("\n평균이상 데이터 수: "+cnt);
		System.out.println("평균이하 데이터 수: "+(score.length-cnt));

		
		
	}

}
