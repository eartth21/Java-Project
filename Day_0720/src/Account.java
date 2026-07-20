
public class Account {
	void dataTotal(int[]arr) {
		System.out.print("Data: ");
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
			sum+=arr[i];
			if(i==arr.length-1)
				System.out.print("=");
			else
				System.out.print("+ ");
		}
		System.out.print(sum);
	}
	
	void dataAverage(int[]arr) {
		System.out.print("Data: ");
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
			sum+=arr[i];	
		}
		double ave=(double)sum/arr.length;
		System.out.printf("\n평균(%.2f)이상: ",ave);
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>=ave) {
				System.out.print(arr[i]+" ");
			}
		}
		
	}
	void dataSort(int[]arr) {
		int brr[]=arr.clone();
		System.out.print("Data: ");
		for(int i=0;i<brr.length-1;i++) {
			for(int j=i+1;j<brr.length;j++) {
				if(brr[i]>brr[j]) {
					int imsi = brr[i];
					brr[i]=brr[j];
					brr[j]=imsi;					
				}
			}
		}
		for(int i=0;i<brr.length;i++) {
			System.out.print(brr[i]+" ");
		}
	}
	
	 int dataMax(int arr[]){
		int max=arr[0];
		System.out.print("Data: ");
		for(int i=0;i<arr.length;i++) {
			System.out.printf("%4d",arr[i]);
			if(max<arr[i])
				max=arr[i];
		}
		System.out.print("\n");
		
		return max;
	}

}
