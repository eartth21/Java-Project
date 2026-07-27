package com.mnu.exam01;
class Singleton{
	private static Singleton instance = null;
	private int count =0;
	private Singleton() {}
	public static Singleton getInstance() {
		if(instance ==null) {
			instance = new Singleton();
			return instance;
		}
		return instance;
	}
	public void count() {
		count++;
	}
	public int getCount() {
		return count;
	}
}
public class Exam_09 {

	public static void main(String[] args) {

		Singleton sg1 = Singleton.getInstance();
		sg1.count();//1
		Singleton sg2 = Singleton.getInstance();
		sg2.count();//2
		Singleton sg3 = Singleton.getInstance();
		sg3.count();//3
		//sg1,sg2,sg3 이 가지고 있는 참조값 모두 같음
		System.out.print(sg1.getCount());
		
		
	}

}
