//거품 정렬
public class Exam_05 {

	public static void main(String[] args) {

		int score[]= {90,60,80,70,55,88,77,65};
		int test[]=score.clone();//배열복제
		
		for(int i=0; i<test.length;i++) {
			for(int j=0;j<test.length-i-1;j++) {
				if(test[j]>test[j+1]) {
					int imsi=test[j];
					test[j]=test[j+1];
					test[j+1]=imsi;
				}
			}
		}
		System.out.print("정렬 전: ");
		for(int a:score) {
			System.out.print(a+" ");
		}
		
		System.out.print("\n정렬 후: ");
		for(int a:test) {
			System.out.print(a+" ");
		}
		
		
		
	}

}
