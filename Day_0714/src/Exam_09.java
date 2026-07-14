//배열 요소 출력 방법
public class Exam_09 {

	public static void main(String[] args) {

		int arr[] = {10,20,30,40,50};
		char ch[]= {'A','B',65,66,'F'};
		String str[]= {"김학생","이학생","강학생","최학생","주학생"};
		
		//1. 기본 for()
		System.out.print("arr: ");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.print("\n");
		
		System.out.print("ch: ");
		for(int i=0;i<ch.length;i++){
			System.out.print(ch[i]+" ");
		}
		System.out.print("\n");
		
		System.out.print("str: ");
		for(int i=0;i<str.length;i++){
			System.out.print(str[i]+" ");
		}
		System.out.print("\n");
		
		//2. 확장 for() : for(배열타입 변수명: 배열명)
		System.out.print("arr: ");
		for(int a:arr) {
			System.out.print(a+" ");
		}
		System.out.print("\n");
		
		System.out.print("ch: ");
		for(char a:ch) {
			System.out.print(a+" ");
		}
		System.out.print("\n");
		
		System.out.print("str: ");
		for(String a:str) {
			System.out.print(a+" ");
		}
		System.out.print("\n");
				
		
		
		
		
	}

}
