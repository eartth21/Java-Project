package com.mnu.exam04.exam;

import java.util.List;

import com.mnu.exam04.model.CommDTO;
import com.mnu.exam04.model.EmpDAO;

public class EmpExam_01 {
	public static void main(String[] args) {
	
	EmpDAO dao = EmpDAO.getInstance();
	List<CommDTO> list = dao.totalList();
	
	System.out.print("사원번호\t이름\t입사일\t급여\t부서번호\t부서명\t지역명\n");
	
	for(CommDTO dto: list) {
		System.out.print(dto.empDTO.getEno()+"\t");
		System.out.print(dto.empDTO.getEname()+"\t");
		System.out.print(dto.empDTO.getHiredate()+"\t");
		System.out.print(dto.empDTO.getSalary()+"\t");
		System.out.print(dto.empDTO.getDno()+"\t");
		System.out.print(dto.deptDTO.getDname()+"\t");
		System.out.print(dto.deptDTO.getLoc()+"\n");

	}
	
	}
}
