/*	data: 90,75,80,77,85,79,95,80,85,90,77
 * 	평균: 83.0
 * 	평균에 가장 가까운 값: 
 */ 
public class Exam_14 {
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
		
		//평균에 가장 가까운 값(절대값의 최소값)
		
	/*	int min;
		if(score[0]>ave)
			min=score[0]-(int)ave;
		else
			min=(int)ave-score[0];
	*/
		int min =(score[0]>ave)?score[0]-(int)ave:(int)ave-score[0];
		int minValue=score[0];//실제값
		
		for(int i=1;i<score.length;i++) {
			int imsi= (score[i]>ave)?score[i]-(int)ave:(int)ave-score[i];
			
			if(min>imsi) {
				min=imsi;
				minValue=score[i];
			}
		}
		System.out.print("평균에 가장 가까운 점수: "+minValue);

		
		
		
		
		
		
		
	}

}
