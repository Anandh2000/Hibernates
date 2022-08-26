package com.SpringBootPractice.SpringBootPrac;

public class Clerk {
	private int id ;
	private String cname;
	private String work;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getWork() {
		return work;
	}
	public void setWork(String work) {
		this.work = work;
	}
	public Clerk(int id, String cname, String work) {
		super();
		this.id = id;
		this.cname = cname;
		this.work = work;
	}
	
}
