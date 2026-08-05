package com.mnu.exam02;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//Map 인터페이스: ㅋ;어ㅣ 
public class Exam_05 {
	public static void main(String[] args) {
		Map map = new HashMap();
		map.put("A", "홍길동");//map 값 입력할 때 put 사용 , A와 홍길동 모두 object
		map.put("B", "이길동");
		map.put("C", "박길동");
		map.put("D", "이길동");
		map.put("A", "서길동");//키가 값으면 마지막거
		
		System.out.println("객체 수: "+map.size());
		System.out.println("객체: "+map);
		
		System.out.println("키 A 값: "+map.get("A"));//키값 통해 출력

		//키값만 추출 set으로 변환
		Set keySet = map.keySet();
		for(Object obj : keySet) {
			System.out.println(obj+": "+map.get(obj));
		}
		
		//람다식을 이용한 출력
		map.forEach((key,value)->{
			System.out.println(key + ": "+value);
		});
		
		
	}

}
