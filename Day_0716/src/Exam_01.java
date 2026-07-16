
public class Exam_01 {

	public static void main(String[] args) {

		int score[] ={90,60,80,70,55,88,77,65};
		int test[]=score.clone();
		
		
		for(int i=0;i<test.length-1;i++) {
			for(int j=i+1;j<test.length;j++) {
				if(test[i]>test[j]) {
					int imsi=test[i];
					test[i]=test[j];
					test[j]=imsi;
				}
			}
		}
		System.out.println("---선택정렬(오름차순)---");
		System.out.print("정렬전: ");
		for(int i=0;i<score.length;i++) {
			System.out.print(score[i]+" ");
		}
		System.out.print("\n정렬후: ");
		for(int i=0;i<test.length;i++) {
			System.out.print(test[i]+" ");
		}
		
		
				
		int test2[]=score.clone();
		for(int i=0;i<test2.length-1;i++) {
			for(int j=0;j<test2.length-i-1;j++) {
				if(test2[j]<test2[j+1]) {
					int imsi=test2[j];
					test2[j]=test2[j+1];
					test2[j+1]=imsi;
				}
			}
		}
		System.out.println();		
		System.out.println("\n---선택정렬(내림차순)---");
		System.out.print("정렬전: ");
		for(int a:score) {
			System.out.print(a+" ");
		}
		System.out.print("\n정렬후: ");
		for(int b : test2) {
			System.out.print(b+" ");
		}
		
		
		
		
		
	}
}
	
		
		
		
		
		
		
	


