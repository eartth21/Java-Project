//가변인자를 이용하여 n개의 자료중에서 최대값을 구하여 반환하는 메소드
public class Exam_12 {

	static int scoreMax(int ... a) {
		int max=a[0];
		for(int i=0;i<a.length;i++) {
			if(max<a[i]){
				max=a[i];
			}
		}
		return max;
	}
	
	public static void main(String[] args) {

		int max = scoreMax(1,2);
		System.out.println("max = "+max);
		System.out.println("max = "+scoreMax(4,3,5,6,8,9));
		int a[]= {1,3,4,2,5,6,9};
		System.out.println("max = "+scoreMax(a));
		System.out.println("max = "+scoreMax(new int[] {4,6,8,2,3}));
	

	}
}
