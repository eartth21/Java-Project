//1~10 정수 출력 후 합계
public class Exam_12 {
	public static void main(String[] args) {
		
		//1~10 정수 출력 후 합계
		// 1 2 3 ... 10 = 55
		
		//1. for()
		int sum=0;
		for(int i=1;i<=10;i++) {
			System.out.printf("%3d", i);//우에서 좌로 세칸
			sum+=i;
		}
		System.out.printf(" = %5d\n", sum);//우에서 좌로 5칸
		
		//2.while()
		int i = 0;
		int tot=0;
		while(i<10) {
			i++;
			System.out.printf("%3d", i);
			tot+=i;
		}
		System.out.printf(" = %5d\n", tot);
	
		//2.1 while()-초기값 설정 차이에 따른 값변화
		int j = 1;
		int t=0;
		while(j<=10) {
			System.out.printf("%3d", j);
			t+=j;
			j++;//j++ 위치 중요!
		}
		System.out.printf(" = %5d\n", t);
		
		
		
		
	}

}
