//정수 배열

import java.util.Scanner;

public class Exam_07 {

	public static void main(String[] args) {

		Scanner scn=new Scanner(System.in);
		int arr[]=new int[5];
		System.out.print("입력: ");
	/*
		arr[0]=scn.nextInt();
		arr[1]=scn.nextInt();
		arr[2]=scn.nextInt();
		arr[3]=scn.nextInt();
		arr[4]=scn.nextInt();
	*/
		for(int x=0;x<5;x++) {
			arr[x]=scn.nextInt();
		}
		
		System.out.println("배열 요소 출력");
	/*	
  		System.out.print(arr[0]+"\t");
		System.out.print(arr[1]+"\t");
		System.out.print(arr[2]+"\t");
		System.out.print(arr[3]+"\t");
		System.out.print(arr[4]+"\t");
	 */
		for(int y=0;y<5;y++) {
			System.out.print(arr[y]+"\t");
		}
		
		
	}

}
