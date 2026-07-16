
public class Exam_08 {
	//1 ~ 10까지 정수 출력하는 메소드
	static void add() {
		int s=0;
		for(int i=1;i<=10;i++) {
			System.out.print(i+" ");
			s+=i;
		}
		System.out.println("= "+s);
	}
	//1 ~ N까지 출력하는 메소드
	static void addN(int n) {
		int s=0;
		for(int i=1;i<=n;i++) {
			System.out.print(i+" ");
			s+=i;
		}
		System.out.println("="+s);
	}

	static int addSum(int n) {
		int s=0;
		for(int i=1;i<=n;i++) {
			s+=i;
		}
		return s;
	}

	
	public static void main(String[] args) {
		
		add();
		addN(50);

		System.out.print("1~20합: "+addSum(20));
		
		
	}

}
