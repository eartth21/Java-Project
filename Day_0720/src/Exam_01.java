
public class Exam_01 {

	public static void main(String[] args) {

		int arr[][]=new int[5][5];
		int num=0;
		


		
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				num++;
				arr[i][j]=num;
				arr[i][4]+=num;
				arr[4][j]+=num;
				arr[4][4]+=num;
			}

			arr[4][i]+=arr[i][0];
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.print("\n");
		}

		
		
	}

}
