package com.mnu.exam01;

public class Exma_06 {
	public static void main(String[] args) {
		int x=5, y=0, z=0;
		y=x++;//y=5, x=6 - ++이 앞에 있을땐 x값을 먼저 y로 대입시킨 뒤 ++
		z=--x;//x=5, z=5
		
		System.out.print(x+","+y+","+z);
		
		
		
		
	}

}
