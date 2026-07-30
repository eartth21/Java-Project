package com.mnu.exam03;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mnu.util.DBManager;

public class DbExam_07 {
	public static void main(String[] args) {
		
		Connection conn=null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		String sql="SELECT ENO, ENAME,HIREDATE,SALARY,EMP.DNO,DNAME FROM EMP JOIN DEPT\n"
				+ "    ON EMP.DNO= DEPT.DNO WHERE ENAME LIKE '_A%'";
		
		try {
			conn=DBManager.getConnection();
			pstmt=conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				System.out.print(rs.getInt("eno")+"\t");
				System.out.print(rs.getString("ename")+"\t");
				System.out.print(rs.getString("hiredate")+"\t");
				System.out.print(rs.getInt("salary")+"\t");
				System.out.print(rs.getInt("dno")+"\t");
				System.out.print(rs.getString("dname")+"\n");

			}


			
		}catch(Exception ex) {
			ex.printStackTrace();
		}finally {
			DBManager.close(conn, pstmt);
		}
		
	}

}
