/*
 * N개의 배열에 저장된 데이터를 출력하고 합계,평균을 구하여 출력
 * data: 90,75,80,77,85,79,95,80,85,90,77
 * 총점: 
 * 평균: 
 */
public class Exam_11 {
	public static void main(String[] args) {

		int score[]= {90,75,80,77,85,79,95,80,85,90,77};
		int cnt=score.length;

		//기본 for()
		System.out.print("Data: ");	
		for(int i=0;i<score.length;i++) {
			System.out.print(score[i]+" ");
		}
		System.out.println();

		
		//확장for()
		System.out.print("Data: ");	
		for(int a:score) {
			System.out.print(+a+" ");		
		}

		//총점
		int sum=0;
		for(int i=0;i<score.length;i++) {
			sum+=score[i];
		}
		System.out.println("\n총점: "+sum);
		
		//평균
		double ave=(double)sum/cnt;
		
		//학점
		char grade='F';
		
		if(ave>=90) {
			grade='A';
		}else if(ave>=80) {
			grade='B';
		}else if(ave>=70) {
			grade='C';
		}else if(ave>=60) {
			grade='D';
		}
		
		System.out.println("평균: "+ave);
		System.out.println("학점: "+grade);
		
		
		
		
		
		
		
		
	}
		

}
