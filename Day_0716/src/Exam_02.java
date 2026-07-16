import java.util.Scanner;

public class Exam_02 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int count[]= new int[6];

		System.out.print("점수입력: ");
		while(true) {
			int num=scn.nextInt();
			if(num==-99) 
				break;
				
				int index=5;
			
				if(num>=90) {
					index=0;
				}else if(num>=80) {
					index=1;
				}else if(num>=70) {
					index=2;
				}else if(num>=60) {
					index=3;
				}else if(num>=50) {
					index=4;
				}
					count[index]++;
		}
	/*	
			System.out.println("100~90: "+count[0]);
			System.out.println("80~89: "+count[1]);
			System.out.println("70~79: "+count[2]);
			System.out.println("60~69: "+count[3]);
			System.out.println("50~59: "+count[4]);
			System.out.println("0~49: "+count[5]);
	*/
		String arr[]= {"100~90: ","80~89: ","70~79: ","60~69: ","50~59: ","0~49: "};
		for(int x=0;x<count.length;x++) {
			System.out.println(arr[x]+count[x]);
		}
		
		
		}
		
		
	}


