package com.mnu.exam02;
//runtime exception 발생과 예외처리
public class Exam_07 {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		try {
			System.out.print(arr[5]);
		} catch(ArrayIndexOutOfBoundsException ae) {//ae 변수명
			//ae.printStackTrace();//오류메세지 출력
			System.out.println("배열의 인덱스를 확인 해주세요");
			System.out.println("에러 메세지: "+ae.getMessage());
		} catch(Exception e) {
			
		}finally {
			System.out.println("프로그램을 종료합니다.");
		}
		
	}
	

}
