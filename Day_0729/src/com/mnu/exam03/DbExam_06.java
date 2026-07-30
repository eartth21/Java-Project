package com.mnu.exam03;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mnu.util.DBManager;

public class DbExam_06 {
	public static void main(String[] args) {
		
		Connection conn=null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int eno=1234;
		String ename="김사원";
		String job="영업";
		String hiredate="26/07/29";
		int salary=2750;
		String sql="insert into emp(eno,ename,job,hiredate, salary)values(?,?,?,?,?)";
		
		try {
			conn=DBManager.getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, eno);
			pstmt.setString(2, ename);
			pstmt.setString(3, job);
			pstmt.setString(4, hiredate);
			pstmt.setInt(5, salary);
		
			int row = pstmt.executeUpdate();
			System.out.println("등록한 로우: "+row);

			
		}catch(Exception ex) {
			ex.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt);
		}
		
	}

}
