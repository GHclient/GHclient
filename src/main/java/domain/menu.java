package domain;

import java.io.Serializable;

public class menu implements Serializable{
	private static final long serialVersionUID=12345;
	private int foodid;
	private String fname;
	private double fvalues;
	private String fsname;
	public int getFoodid() {
		return foodid;
	}
	public void setFoodid(int foodid) {
		this.foodid = foodid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public double getFvalues() {
		return fvalues;
	}
	public void setFvalues(double fvalues) {
		this.fvalues = fvalues;
	}
	public String getFsname() {
		return fsname;
	}
	public void setFsname(String fsname) {
		this.fsname = fsname;
	}
	
}
