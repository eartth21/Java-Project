package com.mnu.exam02;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mnu.util.DBManager;

public class DBExam_02 {

	public static void main(String[] args) {
		//키보드로 부서번호 입력
		int dno =30;
		Connection conn=null;
		PreparedStatement pstmt =null;
		ResultSet rs= null;
		
		String sql="select eno, ename, hiredate, salary, salary*12 yearsalary,dname from emp join dept \n"
				+ "    on emp.dno = dept.dno where emp.dno =? order by hiredate desc";
		
		try {
			conn = DBManager.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, dno);//?개수,변수 dno
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
