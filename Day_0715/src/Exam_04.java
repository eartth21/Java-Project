import java.util.Arrays;

public class Exam_04 {

	public static void main(String[] args) {
		int score[]= {90,60,80,70,55,88,77,65};
		System.out.println("Data 확인: "+Arrays.toString(score));
		System.out.print("Data: ");

		int sum=score[0], max=score[0], min=score[0];
		for(int i=0;i<score.length;i++) {
			System.out.print(score[i]+" ");
		}
		System.out.println("\n-----------------------------------------------");

		System.out.print("Data: ");
		
		for(int a:score) {
			System.out.print(a+" ");
		}
		
		for(int i=1;i<score.length;i++) {
			//합계
			sum+=score[i];
			//최대,최소
			if(max<score[i]) {
				max=score[i];
			}else if(min>score[i]) {
				min=score[i];
			}
		}
		
		System.out.println();
		System.out.println("합계: "+sum);
		System.out.println("평균: "+((double)sum/score.length));
		System.out.println("최대: "+max);
		System.out.println("최소: "+min);
		
		//정렬
		int scoreCp[]=score.clone();//배열복제
		for(int i=0;i<scoreCp.length-1;i++) {
			for(int j=i+1;j<scoreCp.length;j++) {
				if(scoreCp[i]>scoreCp[j]) {
					int imsi=scoreCp[i];
					scoreCp[i]=scoreCp[j];
					scoreCp[j]=imsi;
				}
			}
		}
		System.out.print("정렬 전: ");
		for(int a:score) {
			System.out.print(a+" ");
		}
		
		System.out.print("\n정렬 후: ");
		for(int a:scoreCp) {
			System.out.print(a+" ");
		}
		
		
	}

}
