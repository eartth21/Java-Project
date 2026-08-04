package com.mnu.exam02;

import java.util.List;

import com.mnu.model.MemberDAO;
import com.mnu.model.MemberDTO;

//전체 회원 정보 출력
public class MemberList {
	public static void main(String[] args) {
		
		MemberDAO dao = MemberDAO.getInstance();
		List<MemberDTO> list = dao.memberList();
		
		System.out.println("회원번호\t성명\t전화번호\t\t성별\t등급\t도시명\t가입일자");
		if(!list.isEmpty()) {
			for(MemberDTO dto: list) {
				String genderStr = "여자";
				if(dto.getGender().equals("M")) {
					genderStr="남자";
				}
			String grade = "직원";
			switch(dto.getGrade()){
				case "A":
					grade="VIP";
					break;
				case "B":
					grade="일반";
					break;
				default:
					grade="직원";
				
			
				}
				System.out.print(dto.getCustno()+"\t");
				System.out.print(dto.getCustname()+"\t");
				System.out.print(dto.getPhone()+"\t");
				System.out.print(genderStr+"\t");
				System.out.print(grade+"\t");
				System.out.print(dto.getCityname()+"\t");
				System.out.print(dto.getJoindate()+"\n");
			}
		}else {
			System.out.print("등록된 회원이 없습니다.");
		}
	}

}
