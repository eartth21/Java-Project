//배열 선언과 동시에 원하는 값으로 초기화
import java.util.Arrays;

public class Exam_08 {

	public static void main(String[] args) {

		int arr[] = {10,20,30,40,50}; //new int 생략	
		int arr2[] = new int[]	{10,20,30,40,50};
		int arr3[] = new int[5];//자동초기화(0)
		
		//배열 요소수 자동 계산
		int cnt = arr.length;
		System.out.println("arr 배열 요소수: "+cnt);
		System.out.println("arr 배열 요소수: "+arr.length);
		
		//배열 요소 확인(출력)
		System.out.println(Arrays.toString(arr));
		arr[1]=100;
		System.out.println(Arrays.toString(arr));
		
		//배열 요소 합계
		//int sum=arr[0]+arr[1]+...+arr[16];
		
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		System.out.println("arr 배열 요소합: "+sum);

		
	}

}
