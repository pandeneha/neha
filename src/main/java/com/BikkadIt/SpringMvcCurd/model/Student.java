package com.BikkadIt.SpringMvcCurd.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {

	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sid;
	
	private String fname;
	
	private String lname;
	
	private String saddress;
	
	private int smark;
	
	

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public int getSmark() {
		return smark;
	}

	public void setSmark(int smark) {
		this.smark = smark;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getSaddress() {
		return saddress;
	}

	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", fname=" + fname + ", lname=" + lname + ", saddress=" + saddress + ", smark="
				+ smark + "]";
	}
}
