//이차원 배열의 정렬
public class Exam_06 {

	public static void main(String[] args) {
	int student[][]= {{1,90,80,70,0,0},{5,70,86,75,0,0},{3,95,88,77,0,0},
			{4,70,78,97,0,0},{2,89,86,75,0,0}};
	
	//총점계산
		for(int i=0;i<student.length;i++) {
			student[i][4] = student[i][1]+student[i][2]+student[i][3];
		}
			//과목수 많을때
			/*for(int j=1;j<4;j++) {
			student[i][4] = student[i][4]+ student[i][j];}	
			*/
			
		
	//순위계산
		for(int i=0;i<student.length;i++){
			student[i][5]=1;
			for(int j=0;j<student.length;j++) {
				if(student[i][4]<student[j][4])
					student[i][5]++;
			}
		}
		
	//출력(입력자료순)
		System.out.println("번호\t국어\t영어\t수학\t총점\t순위");
		for(int i=0;i<student.length;i++) {
			for(int j=0;j<student[i].length;j++) {
				System.out.print(student[i][j]+"\t");
			}
			System.out.print("\n");
		}
		System.out.println("-----------------------------");
		
	//출력(석차순 또는 번호순)
	
		
		for(int i=0;i<student.length-1;i++) {
			for(int j=i+1;j<student.length;j++) {
				if(student[i][0]>student[j][0]) {//번호기준 오름차순
					int imsi[]=student[i];
					student[i]=student[j];
					student[j]=imsi;
					}
				}
			}
		
		
		System.out.println("번호\t국어\t영어\t수학\t총점\t순위");
		for(int i=0;i<student.length;i++) {
			for(int j=0;j<student[i].length;j++) {
				System.out.print(student[i][j]+"\t");
			}
			System.out.print("\n");
		}
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
