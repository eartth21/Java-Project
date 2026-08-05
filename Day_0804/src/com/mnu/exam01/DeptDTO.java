package com.mnu.exam01;

public class DeptDTO {
	private int dno;
	private String dname;
	private String loc;
	
	DeptDTO(){}
	DeptDTO(int dno, String dname, String loc){
		this.dno=dno;
		this.dname=dname;
		this.loc=loc;
	}
	public int getDno() {
		return dno;
	}
	public void setDno(int dno) {
		this.dno = dno;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	
/*	//같은 객체 판단(동일한 번호)
	@Override
	public boolean equals(Object obj) {//obj 는 상대
		if(obj instanceof DeptDTO) {
			DeptDTO dto = (DeptDTO)obj;
			return dno==dto.dno;	
		}else {
			return false;
		}
	}@Override
	public int hashCode() {
		return dno;
	}
*/	//같은 객체 판단(이름, 부서명)
	@Override
	public boolean equals(Object obj) {//obj 는 상대
		if(obj instanceof DeptDTO) {
			DeptDTO dto = (DeptDTO)obj;
			return dno==dto.dno && dname.equals(dname);
		}else {
			return false;
		}
	}@Override
	public int hashCode() {
		return dno + dname.hashCode();
	}	
}
