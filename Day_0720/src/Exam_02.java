import java.util.Scanner;

public class Exam_02 {

	public static void main(String[] args) {

		int apt[][]=new int[11][8];
		int cnt=0;
		Scanner scn=new Scanner(System.in);
		
		while(true){
			System.out.print("입력: ");
			int row = scn.nextInt();
			if(row==0) {
				break;
			}
			String na=scn.next();
			int age = scn.nextInt();
			int col = age/10;
				if(col>6)
					col=6;
			apt[row-1][col]++;
			apt[row-1][7] += apt[row-1][col];//col합
			apt[10][col] += apt[row-1][col];//row합
			apt[10][7] += apt[row-1][col];//col+row

		}
		
		System.out.println("동\t0~9\t10~19\t20~29\t30~39\t40~49\t50~59\t60이상\t합계");
		for(int i=0;i<apt.length-1;i++) {
			System.out.print(i+1+"\t"); //동출력
			for(int j=0;j<apt[i].length;j++) {
				System.out.print(apt[i][j]+"\t");
			}
			System.out.print("\n");
		}
		System.out.print("합계\t");
		for(int i=0;i<apt[0].length;i++) {
			System.out.print(apt[apt.length-1][i]+"\t");
			}
		
		
		
		

		
		
	}

}
