package com.mnu.exam02;
class Sawon2 {
	String name;
	void print() throws NullPointerException{//필요한 사람에게 예외처리를 떠넘기다 
		//throws:미루기
		//throw: 예외발생 - 오류메세지 설정하기 위해 
		if(name.equals("aaaa")) {//예외발생
			System.out.println("name="+name);
		}else {
			System.out.println("name=null");
		}
		
	}
}
public class Exam_10 {

	public static void main(String[] args) {
		Sawon2 sa = new Sawon2();
		try {
		sa.print();//필요한 사람
		} catch(NullPointerException e) {
			System.out.print(e.getMessage());
		}
		
		
	}

}
