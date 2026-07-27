package com.mnu.exam01;

public class Exam_01 {
	static int nsize=4;
	public static void makeArray(int[]arr) {
		for(int i=0;i<nsize;i++) { //arr 값 입력 
			arr[i]=i;
		}
	}
	
	public static void main(String[] args) {
		
		int[]arr = new int[nsize];
		makeArray(arr);
		for(int i=0;i<nsize;i++) { //출력
			System.out.print(arr[i]+"");
		}
		
		
		
	}

}
