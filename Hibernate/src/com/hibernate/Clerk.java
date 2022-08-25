package com.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Clerk {
	int id;
	String cname;
	String work;
	@Id
	@Column
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Column
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	@Column
	public String getWork() {
		return work;
	}
	public void setWork(String work) {
		this.work = work;
	}
	@Override
	public String toString() {
		return "Clerk [id=" + id + ", cname=" + cname + ", work=" + work + "]";
	}
	
}
