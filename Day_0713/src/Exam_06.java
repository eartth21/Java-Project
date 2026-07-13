//1~10까지 홀수합, 짝수 (증가는 1씩) 
public class Exam_06 {
	public static void main(String[] args) {
		
		int s=0;//홀수합
		int t=0;//짝수합
		int tot=0;
		for(int i=1;i<=10;i++) {
			System.out.print(i+" ");
			if(i%2==1) {
				s+=i;
			}else {
				t+=i;
			}
			tot+=i;
		}
		System.out.println("\n1~10까지 홀수의 합: "+s);
		System.out.println("1~10까지 짝수의 합: "+t);
		System.out.print("1~10까지 전체합: "+tot);
		
		
	}

}
