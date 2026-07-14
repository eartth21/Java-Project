//배열의 공유
public class Exam_15 {

	public static void main(String[] args) {

		int arr[]= {10,20,30,40,50};
		int brr[]=arr;//배열공유
		
		System.out.println("arr[0]="+arr[0]);
		System.out.println("brr[0]="+brr[0]);
		
		brr[1]=2000;
		System.out.println("arr[1]="+arr[1]);
		System.out.println("brr[1]="+brr[1]);

		
		
		
		
		
	}

}
