
public class Exam_27 {

	public static void main(String[] args) {
	
		int cnt=0;
		for(int x=1;x<=5;x++) {
			for(int y=1;y<=5;y++) {
				cnt++;
				System.out.printf("%3d",cnt);//오른쪽정렬, %s-왼쪽정렬
			}
			System.out.println();
		}
		System.out.println("------------------");
		cnt=0;
		for(int x=1;x<=5;x++) {
			for(int y=1;y<=x;y++) {
				cnt++;
				System.out.printf("%s ",cnt);//왼쪽정렬
			}
			System.out.println();
		}
		
		
		
		
	}

}
