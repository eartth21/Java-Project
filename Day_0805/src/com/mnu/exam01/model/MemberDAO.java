package com.mnu.exam01.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.mnu.exam01.util.DBManager;

public class MemberDAO {
	private MemberDAO() {}
	
	private static MemberDAO instance = new MemberDAO();
	public static MemberDAO getinstance() {
		return instance;
	}	
	
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	//1.회원 전체 정보 검색
	public List <MemberDTO> memberList() {
		List<MemberDTO> mList = new ArrayList();
		String sql="select custno, custname, phone, gender,joindate, grade, cityname    \n"
				+ "    from tbl_member m join tbl_city c  on m.city=c.city";
	
	try {
		conn=DBManager.getConnection();
		pstmt=conn.prepareStatement(sql);
		rs=pstmt.executeQuery();
		while(rs.next()) {
			MemberDTO dto = new MemberDTO();
			dto.setCustno(rs.getInt("custno"));
			dto.setCustname(rs.getString("custname"));
			dto.setPhone(rs.getString("phone"));
			dto.setGender(rs.getString("gender"));
			dto.setJoindate(rs.getString("joindate"));
			dto.setGrade(rs.getString("grade"));
			dto.setCityname(rs.getString("cityname"));
			
			mList.add(dto);
		}
		
	}catch(Exception e) {
		e.printStackTrace();
		
	}finally {
		DBManager.close(conn, pstmt, rs);
	}
	return mList;
	}
	
	public List <MemberDTO> memberList2() {
		List<MemberDTO> mList = new ArrayList();
		String sql="select custno, custname, phone, \n"
				+ "    decode(gender,'M','남성'\n"
				+ "                 ,'F','여성') as gender,joindate, \n"
				+ "    decode(grade,'A','VIP'\n"
				+ "                ,'B','일반'\n"
				+ "                ,'C','직원') as grade, cityname    \n"
				+ "    from tbl_member m join tbl_city c  on m.city=c.city";
	
	try {
		conn=DBManager.getConnection();
		pstmt=conn.prepareStatement(sql);
		rs=pstmt.executeQuery();
		while(rs.next()) {
			MemberDTO dto = new MemberDTO();
			dto.setCustno(rs.getInt("custno"));
			dto.setCustname(rs.getString("custname"));
			dto.setPhone(rs.getString("phone"));
			dto.setGender(rs.getString("gender"));
			dto.setJoindate(rs.getString("joindate"));
			dto.setGrade(rs.getString("grade"));
			dto.setCityname(rs.getString("cityname"));
			
			mList.add(dto);
		}
		
	}catch(Exception e) {
		e.printStackTrace();
		
	}finally {
		DBManager.close(conn, pstmt, rs);
	}
	return mList;
	}
	
	public List <MemberDTO> memberListPhone(String tel) {//괄호안에 들어가는 변수명 자유
		List<MemberDTO> mList = new ArrayList();
		String sql="select custno, custname, phone, gender,joindate, grade, cityname    \n"
				+ "    from tbl_member m join tbl_city c  on m.city=c.city \n"
				+ "    where phone like ?";
	
	try {
		conn=DBManager.getConnection();
		pstmt=conn.prepareStatement(sql);
		pstmt.setString(1,"%"+tel);
		
		rs=pstmt.executeQuery();
		while(rs.next()) {
			MemberDTO dto = new MemberDTO();
			dto.setCustno(rs.getInt("custno"));
			dto.setCustname(rs.getString("custname"));
			dto.setPhone(rs.getString("phone"));
			dto.setGender(rs.getString("gender"));
			dto.setJoindate(rs.getString("joindate"));
			dto.setGrade(rs.getString("grade"));
			dto.setCityname(rs.getString("cityname"));
			
			mList.add(dto);
		}
		
	}catch(Exception e) {
		e.printStackTrace();
		
	}finally {
		DBManager.close(conn, pstmt, rs);
	}
	return mList;
	}
	
	public List <MemberDTO> memberListName(String name) {
		List<MemberDTO> mList = new ArrayList();
		String sql="select custno, custname, phone, gender,joindate, grade, cityname    \n"
				+ "    from tbl_member m join tbl_city c  on m.city=c.city \n"
				+ "    where custname like ?";
	
	try {
		conn=DBManager.getConnection();
		pstmt=conn.prepareStatement(sql);
		pstmt.setString(1,name);
		
		rs=pstmt.executeQuery();
		while(rs.next()) {
			MemberDTO dto = new MemberDTO();
			dto.setCustno(rs.getInt("custno"));
			dto.setCustname(rs.getString("custname"));
			dto.setPhone(rs.getString("phone"));
			dto.setGender(rs.getString("gender"));
			dto.setJoindate(rs.getString("joindate"));
			dto.setGrade(rs.getString("grade"));
			dto.setCityname(rs.getString("cityname"));
			
			mList.add(dto);
		}
		
	}catch(Exception e) {
		e.printStackTrace();
		
	}finally {
		DBManager.close(conn, pstmt, rs);
	}
	return mList;
	}
	
	public int memberMaxCustno() {
		int row=0;
		String sql="select max(custno) from tbl_member";
	
	try {
		conn=DBManager.getConnection();
		pstmt=conn.prepareStatement(sql);		

		rs=pstmt.executeQuery();
		
		if(rs.next()) {
			row = rs.getInt(1);
		}
		
	}catch(Exception e) {
		e.printStackTrace();
		
	}finally {
		DBManager.close(conn, pstmt, rs);
	}
	return row;
	}
	
	//회원 등록 메소드			
	public int memberWrite(MemberDTO dto) {
		int row=0;
		String sql="insert into tbl_member(custno,custname,phone,gender,joindate,grade,city)values(?,?,?,?,sysdate,?,?)";
	
	try {
		conn=DBManager.getConnection();
		pstmt=conn.prepareStatement(sql);		
		pstmt.setInt(1, dto.getCustno());
		pstmt.setString(2, dto.getCustname());
		pstmt.setString(3, dto.getPhone());
		pstmt.setString(4, dto.getGender());
		pstmt.setString(5, dto.getGrade());
		pstmt.setString(6, dto.getCity());
		
		row = pstmt.executeUpdate();//insert,update,delete한 갯수반환

		
	}catch(Exception e) {
		e.printStackTrace();
		
	}finally {
		DBManager.close(conn, pstmt);
	}
	return row;
	}

	//회원 등록 메소드			
	public int memberWriteSeq(MemberDTO dto) {
		int row=0;
		String sql="insert into tbl_member(custno,custname,phone,gender,joindate,grade,city)"
				+ "values(tbl_member_custno_seq.nextval,?,?,?,sysdate,?,?)";
	
	try {
		conn=DBManager.getConnection();
		pstmt=conn.prepareStatement(sql);		
		pstmt.setString(1, dto.getCustname());
		pstmt.setString(2, dto.getPhone());
		pstmt.setString(3, dto.getGender());
		pstmt.setString(4, dto.getGrade());
		pstmt.setString(5, dto.getCity());
		
		row = pstmt.executeUpdate();//insert,update,delete한 갯수반환

		
	}catch(Exception e) {
		e.printStackTrace();
		
	}finally {
		DBManager.close(conn, pstmt);
	}
	return row;
	}	
	
	//회원 수정 메소드	
	public int memberUpdate(MemberDTO dto) {
		int row=0;
		String sql="update tbl_member set phone=?,gender=?,grade=?,city=? where custno=?";
	
	try {
		conn=DBManager.getConnection();
		pstmt=conn.prepareStatement(sql);		
		pstmt.setString(1, dto.getPhone());
		pstmt.setString(2, dto.getGender());
		pstmt.setString(3, dto.getGrade());
		pstmt.setString(4, dto.getCity());
		pstmt.setInt(5, dto.getCustno());
		row = pstmt.executeUpdate();//insert,update,delete한 갯수반환

		
	}catch(Exception e) {
		e.printStackTrace();
		
	}finally {
		DBManager.close(conn, pstmt);
	}
	return row;
	}	

	//회원 삭제 메소드	
	public int memberDelete(MemberDTO dto) {
		int row=0;
		String sql="delete from tbl_member where custno=?";
	
	try {
		conn=DBManager.getConnection();
		pstmt=conn.prepareStatement(sql);		
		pstmt.setInt(1, dto.getCustno());
		row = pstmt.executeUpdate();//insert,update,delete한 갯수반환

		
	}catch(Exception e) {
		e.printStackTrace();
		
	}finally {
		DBManager.close(conn, pstmt);
	}
	return row;
	}	
}
