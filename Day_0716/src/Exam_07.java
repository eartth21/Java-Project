//메소드
public class Exam_07 {
	//반환타입X, 매개변수X
	static void method_1() {
		
	}
	//반환타입X, 매개변수O
	static void method_2(int a, int b) {
		
	}
	//반환타입O, 매개변수X
	static int method_3(){
		return 1;
	}
	//반환타입O, 매개변수O
	static int method_4(int[] a) {
		return 1;
	}
	
	public static void main(String[] args) {
		//메소드 호출
		method_1();
		
		method_2(100,2);
		
		int s = method_3();
		
		int ss[]= {1,2,3,4};
		int k = method_4(ss);
		
	}

}
