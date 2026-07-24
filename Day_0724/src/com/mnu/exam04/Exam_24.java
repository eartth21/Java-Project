package com.mnu.exam04;

public class Exam_24 {

	public static void main(String[] args) {
		int arr[];
		int i=0;
		arr = new int[10];
		arr[0]=0;
		arr[1]=1;
		//{0,1,1,2,3,5,8,13,21,34} 피보나치수열
		while(i<8) {//0
			arr[i+2]=arr[i+1]+arr[i];//1=1+0
			i++;
		}
		System.out.print(arr[9]);
		
	}

}
