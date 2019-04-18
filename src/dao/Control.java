package dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import domain.Student;
import stuBiz.mysort;
import stuBiz.studentBiz;
import view.View;

public class Control {//初始化
	private View v;
	private Userinput ui;
	private Socket client;
	private PrintWriter out;
	private Scanner in;
	private studentBiz stuBiz;
	ObjectInputStream oin;
	public Control() {
		this.v=new View();
		this.ui=new Userinput();
		try {
			this.client=new Socket("10.10.49.119", 9999);
			in=new Scanner(client.getInputStream());
			//InputStreamReader in =new InputStreamReader(new FileInputStream("student.txt"));
			out=new PrintWriter(client.getOutputStream());
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public String getString(){
			return in.nextLine();
	}
	public int getInt(){
		return Integer.parseInt(in.nextLine());
	}
	public double getDouble(){
		return Double.parseDouble(in.nextLine());
	}
	private Object getObject(){
		try {
			oin = new ObjectInputStream(client.getInputStream());
			return oin.readObject();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	private void sendString(String msg){
		out.println(msg);
		out.flush();
		//out.close();
	}
	private void sendObject(Object obj){
		try {
			ObjectOutputStream oout=new ObjectOutputStream(client.getOutputStream());
			oout.writeObject(obj);
			oout.flush();
			//doout.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private void sendInt(int i){
		out.println(i);
		out.flush();
		//out.close();
	}
	public void start(){
		while(true){
			this.v.welcome();
			int select=this.ui.getInt("请选择：");
			//将指令发送到服务器端
			this.sendInt(select);
			if(select==0){
				this.v.println("系统终止");
				System.exit(0);
			}else if(select==1){
				//addS();
				//System.out.println(this.addS());
				//String info=this.addS();
				//this.v.println(info);
				this.v.println(addS());
			}else if(select==2){
				this.showS();
			}else if(select==3){
				this.sortS();
			}else if(select==4){
				this.delS();
			}
		}
	}
	//public void addS(){
	public String addS(){
		this.v.println(">>>学生信息录入");
		this.v.println("请输入学生信息：");
		int id=this.ui.getInt("请输入学号：");
		String name=this.ui.getString("请输入姓名：");
		double score =this.ui.getDouble("请输入学生成绩：");
		this.sendString(id+"#"+name+"#"+score);
		return "添加成功！";
		//return id+"#"+name+"#"+score;
		//return in.nextLine();
	}
	//客户端
	private void showS(){
		this.v.println(">>>学生信息输出");
		Object o=this.getObject();
		if(o instanceof List){
			List<Student> list2=(List<Student>)o;
			this.v.showArray(list2);
		}
		//Object o=this.getObject();
		/*if(o instanceof List){
			List<Student> list=(List<Student>)o;
			this.v.showArray(list);
		}*/
	}
	private void sortS(){
		v.sortView();
		int i=this.ui.getInt("请选择：");
		this.sendInt(i);
		v.println(">>>学生信息输出：");
		Object o=this.getObject();
		if(o instanceof List){
			List<Student> list=(List<Student>)o;
			this.v.showArray(list);
		}
	}
	private void delS(){
		v.println(">>>学生信息删除：");
		int id=this.ui.getInt("请输入要删除学生的学号：");
		this.sendInt(id);
		Object o=this.getObject();
		if(o==null){
			this.v.println("学生不存在");
			return ;
		}
		v.println("学生信息如下：");
		v.println(o.toString());
		String s=this.ui.getString("是否要删除学生：");
		this.sendString(s);
		//接收服务器返回的结果
		String str=this.getString();
		this.v.println("str");
	}
}
