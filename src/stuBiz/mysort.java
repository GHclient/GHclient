package stuBiz;

import java.util.Comparator;

import domain.Student;

public class mysort implements Comparator<Student>{
	private boolean flag;
	public mysort(boolean flag){
		this.flag=flag;
	}
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		if(flag){
			if(o1.getScore()>o2.getScore()){
				return 1;
			}else if(o1.getScore()<o2.getScore()){
				return -1;
			}
		}else{
			if(o1.getScore()>o2.getScore()){
				return -1;
			}else if(o1.getScore()<o2.getScore()){
				return 1;
			}
		}
		return 0;
	}
	
}
