
public class Exam_28 {
	public static void main(String[] args) {

		int cnt=0;
		for(int x=1;x<=5;x++) {
			int sum=0;//위치 중요!!
			for(int y=1;y<=5;y++) {
				cnt++;
				sum += cnt;
				System.out.printf("%5d",cnt);
			}
			
			System.out.printf("%5d",sum);
			System.out.println();
		}
		
		
		
		
	}

}
