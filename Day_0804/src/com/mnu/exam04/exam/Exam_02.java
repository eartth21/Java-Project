package com.mnu.exam04.exam;

import java.util.List;
import java.util.Scanner;

import com.mnu.exam04.model.CommDTO;
import com.mnu.exam04.model.EmpDAO;

public class Exam_02 {
	public static void main(String[] args) {
		//키보드 입력(부서번호)DAO로 넘겨서 검색
		Scanner scn = new Scanner(System.in);
		System.out.print("부서번호 입력: ");
		int dno=scn.nextInt();
		
		EmpDAO dao = EmpDAO.getInstance();
		List <CommDTO> list1 = dao.dnoSearch(dno);
		//부서번호 부서명 사원번호 이름 입사일 급여(common DTO)
		
		System.out.print("사원번호\t이름\t입사일\t급여\t부서번호\t부서명\n");
		
		for(CommDTO dto: list1) {
			System.out.print(dto.empDTO.getEno()+"\t");
			System.out.print(dto.empDTO.getEname()+"\t");
			System.out.print(dto.empDTO.getHiredate()+"\t");
			System.out.print(dto.empDTO.getSalary()+"\t");
			System.out.print(dto.empDTO.getDno()+"\t");
			System.out.print(dto.deptDTO.getDname()+"\n");

		}
		
	}

}
