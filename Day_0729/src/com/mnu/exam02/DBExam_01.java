package com.mnu.exam02;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mnu.util.DBManager;

public class DBExam_01 {

	public static void main(String[] args) {

		Connection conn=null;
		PreparedStatement pstmt =null;
		ResultSet rs= null;
		
		String sql="select eno, ename, hiredate, salary, salary*12 YEARSALARY,dname from emp join dept \n"
				+ "    on emp.dno = dept.dno order by hiredate desc";
		
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				System.out.print(rs.getInt("eno")+"\t");
				System.out.print(rs.getString("ename")+"\t");
				System.out.print(rs.getString("hiredate")+"\t");
				System.out.print(rs.getInt("salary")+"\t");
				System.out.print(rs.getInt("YEARSALARY")+"\t");
				System.out.print(rs.getString("dname")+"\n");

			}
			
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt, rs);
		}
		
	}

}
