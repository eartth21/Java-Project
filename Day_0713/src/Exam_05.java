
public class Exam_05 {

	public static void main(String[] args) {
		
		int s =0;
		for(int i=1;i<=10;i++) {
			System.out.print(i);
			s=s+i; //s+=i
		}
		System.out.println("1~10의 합: "+s);
		
		int t=0;
		for(int j=1;j<=10;j+=2) {
			System.out.print(j);			
			t+=j;
		}
		System.out.println("1~10의 홀수의 합: "+t);
		
		int tt=0;
		for(int a=0;a<=10;a+=2) {
			System.out.print(a);			
			tt+=a;
		}
		System.out.println("1~10의 짝수의 합: "+t);
		
		
		
		
		
		
	}

}
