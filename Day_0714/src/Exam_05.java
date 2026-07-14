
public class Exam_05 {

	public static void main(String[] args) {
	
		int cnt=0;
		
		for(int x=1;x<=5;x++) {
			for(int k=1;k<=6-x;k++) {
				System.out.printf("%3s"," ");
			}
			for(int y=1;y<=x;y++) {
				cnt++;
				System.out.printf("%3d",cnt);
			}
			System.out.println();
		}
		
		
	}

}
