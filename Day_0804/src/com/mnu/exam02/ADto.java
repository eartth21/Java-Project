package com.mnu.exam02;
public class ADto {
	int bun;
	String name;
	
	public ADto() {}
	public ADto(int bun, String name) {
		this.bun=bun;
		this.name=name;
	}
	public int getBun() {
		return bun;
	}
	public void setBun(int bun) {
		this.bun = bun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
