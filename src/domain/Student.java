package domain;

import java.io.Serializable;
import java.rmi.server.UID;

import javax.swing.UIDefaults;

public class Student implements Serializable{
	private static final long serialVersionUID=12345678;
	private String name;
	private int id;
	private double score;
	
	/*public Student() {
		super();
	}*/
	public Student(int id, String name, double score) {
		super();
		this.name = name;
		this.id = id;
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return this.id+"\t"+this.name+"\t"+this.score;
	}
	public String show(){
		return this.id+"#"+this.name+"#"+this.score;
	}
}
