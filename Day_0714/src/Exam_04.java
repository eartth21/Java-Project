
public class Exam_04 {

	public static void main(String[] args) {

		for(int x=1;x<=5;x++) {
			for(int k=1;k<=x;k++) {
				System.out.print(" ");
			}
			for(int j=1;j<=(6-x)*2-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("----------------");
		
		for(int i=5;i>=1;i--) {
			for(int k=1;k<(6-i);k++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i*2-1;j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		
	}

}
