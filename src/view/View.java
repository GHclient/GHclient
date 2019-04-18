package view;

import java.util.List;

import domain.Student;

public class View {
	public void welcome(){
		System.out.println("\t\t\t简易学生成绩处理");
		System.out.println("====================================");
		System.out.println("\t\t\t1.  录入学生成绩");
		System.out.println("\t\t\t2. 显示学生成绩");
		System.out.println("\t\t\t3. 学生信息排序");
		System.out.println("\t\t\t4. 删除学生信息");
		System.out.println("\t\t\t0. 退出系统");
		System.out.println("-------------------------------------------------------------");
		
	}
	public void println(String msg){
		System.out.println(msg);
	}
	public void sortView(){
		System.out.println("学生信息排序：");
		System.out.println("-----------------------------------------------------");
		System.out.println("1.升序");
		System.out.println("2.降序");
		System.out.println("-----------------------------------------------------");
	}
	public void showArray(List<Student> list){
		System.out.println("学号\t姓名\t成绩");
		for (Student student : list) {
			System.out.println(student);
		}
	}
}
