
public class Exam_14 {
	//총점 메소드
	static void arrTot(int[][] arr) {
		for(int i=0;i<arr.length;i++) {
				arr[i][4]=arr[i][1]+arr[i][2]+arr[i][3];
			}
		}
	//석차 메소드
	static void arrRank(int[][] arr) {
		for(int i=0;i<arr.length;i++) {
			arr[i][5]=1;
			for(int j=0;j<arr.length;j++) {
				if(arr[i][4]<arr[j][4]) {
					arr[i][5]++;
				}
			}
		}
	}
	//sort 메소드
	
	static void arrSort(int[][]arr) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i][5]>arr[j][5]) {
					int imsi[]=arr[i];
					arr[i]=arr[j];
					arr[j]=imsi;
				}
			}
		}
	}
	
	//출력 메소드
	static void arrPrint(int[][]arr) {
		System.out.println("번호\t국어\t영어\t수학\t총점\t석차");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<6;j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
		//번호, 국어, 영어, 수학, 총점, 석차
		int[][] arr= {{1,90,70,50,0,0},{5,90,75,50,0,0},{2,90,80,50,0,0},{3,90,70,65,0,0},{4,90,70,70,0,0}};
		
		arrPrint(arr);
		System.out.println("------------------------------");
		
		arrTot(arr);
		arrPrint(arr);
		System.out.println("------------------------------");

		arrRank(arr);
		arrPrint(arr);
		System.out.println("------------------------------");

		arrSort(arr);
		arrPrint(arr);
		System.out.println("------------------------------");

		
	}

}
