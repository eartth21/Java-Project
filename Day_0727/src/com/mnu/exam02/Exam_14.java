package com.mnu.exam02;
interface CCC{
	
	void test();
	int a(int a, int b);
	
	default void sss() {
		
	}
	static void aaa() {
		
	}
}
class ExamCCC implements CCC{
	@Override
	public int a(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}@Override
	public void test() {
		// TODO Auto-generated method stub
		
	}
}
interface CCC_1 extends CCC{
	void size();
}
public class Exam_14 {

	public static void main(String[] args) {
		//CCC c1= new CCC();
		CCC c1 = new ExamCCC();
	}

}
