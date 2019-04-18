package domain;

import java.io.Serializable;

public class user implements Serializable{
	private static final long serialVersionUID=12345678;
	private int uid;
	private String uname;
	private int password;
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	
}
