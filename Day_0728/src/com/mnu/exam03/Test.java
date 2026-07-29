package com.mnu.exam03;
//문자열 배열을 문자열로 변환(문자열 결합)
public class Test {
	public static void main(String[] args) {

		String arr[] = {"김학생","장학생","이학생","강학생","서학생"};
		String str="";
		for(int x=0;x<arr.length;x++) {
			str = str+arr[x];
			if(x!=arr.length-1)
				str=str+",";//콤마삽입
		}
		System.out.println(str);
	
	//문자를 배열로 변환(문자열 분리)split("구분자(토큰)") "111#222"
		String arrStr[];
		if(!str.isEmpty()){//문자열이 비어있지 않으면
			arrStr=str.split(",");
		}else {
			arrStr= new String[1];
		}
					
		if(str.contains("강학생")) {
			System.out.println("OK");
		}
		
		for(int x=0;x<arrStr.length;x++) {
			System.out.println(arrStr[x]);
		}
	
	
	
	}

}
