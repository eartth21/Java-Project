//재귀함수 응용(팩토리알!)5!=5*4*3*2*1
public class Exam_16 {
	static int funtion(int num) {
		if(num==1)
			return 1;
		return num * funtion(num-1);
		
	}
	public static void main(String[] args) {

		funtion(5);
		
		
	}

}
