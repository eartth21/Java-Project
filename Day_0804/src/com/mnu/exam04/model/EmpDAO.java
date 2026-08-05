package com.mnu.exam04.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.mnu.exam04.util.DBManager;

public class EmpDAO {
	private EmpDAO() {}
	
	public static EmpDAO instance = new EmpDAO();
	public static EmpDAO getInstance() {
		return instance;
	}
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	//메소드 정의
	public List <CommDTO> totalList(){
		//반환타입
		List <CommDTO> list = new ArrayList<CommDTO>();
		//쿼리
		String sql="select eno,ename,hiredate,salary,e.dno,dname,loc from emp e join dept d \n"
				+ "    on e.dno =d.dno";
		
		try {
			conn=DBManager.getConnection();
			pstmt=conn.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			while(rs.next()) {
				CommDTO dto = new CommDTO();
				dto.empDTO.setEno(rs.getInt("eno"));
				dto.empDTO.setEname(rs.getString("ename"));
				dto.empDTO.setHiredate(rs.getString("hiredate"));
				dto.empDTO.setSalary(rs.getInt("salary"));
				dto.empDTO.setDno(rs.getInt("dno"));
				dto.deptDTO.setDname(rs.getString("Dname"));
				dto.deptDTO.setLoc(rs.getString("loc"));
				
				list.add(dto);
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt, rs);
			
			
		}
		return list;		
		
	}
	
	public List<CommDTO> dnoSearch(int Dno) {
		List <CommDTO> list1 = new ArrayList();
		
		
		String sql="select eno,ename,hiredate,salary,e.dno,dname from emp e join dept d \n"
				+ "    on e.dno =d.dno where e.dno=?";
		try {
			conn=DBManager.getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1,Dno);
			
			rs=pstmt.executeQuery();
			
			while(rs.next()) {
				CommDTO dto1 = new CommDTO();
				dto1.empDTO.setEno(rs.getInt("eno"));
				dto1.empDTO.setEname(rs.getString("ename"));
				dto1.empDTO.setHiredate(rs.getString("hiredate"));
				dto1.empDTO.setSalary(rs.getInt("salary"));
				dto1.empDTO.setDno(rs.getInt("dno"));
				dto1.deptDTO.setDname(rs.getString("dname"));
				list1.add(dto1);
				
				
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt, rs);
		}
		
	return list1;	
	}
	
	public List <EmpDTO> nameList(String name){
		
		List <EmpDTO> list = new ArrayList<EmpDTO>();
		
		String sql="select * from emp where upper(ename) like ? ";
		
		try {
			conn=DBManager.getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1,"%"+name+"%");
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				EmpDTO dto = new EmpDTO();
				dto.setEno(rs.getInt("eno"));
				dto.setEname(rs.getString("ename"));
				dto.setJob(rs.getString("job"));
				dto.setManager(rs.getInt("manager"));
				dto.setHiredate(rs.getString("hiredate"));
				dto.setSalary(rs.getInt("salary"));
				dto.setCommission(rs.getInt("commission"));
				dto.setDno(rs.getInt("dno"));
				
				list.add(dto);
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt, rs);
			
			
		}
		return list;		
		
	}

}
