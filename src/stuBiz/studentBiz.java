package stuBiz;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import domain.Student;

public class studentBiz {
	private PrintWriter out;
	public Student findById(int id){
		Student stu=null;
		File file=new File("student.txt");
		if(file.exists()){
			BufferedReader br;
			try {
					br = new BufferedReader(new InputStreamReader(new FileInputStream("student.txt")));
					String b;
					while((b=br.readLine())!=null){
					String s[]=b.split("#");
					if(Integer.parseInt(s[0])==id){
						stu=new Student(Integer.parseInt(s[0]), s[1],Double.parseDouble(s[2]));
					}
				}
					br.close();
			}catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return stu;
	}
	public String addS(int id,String name,double score) {
		
		return id+"#"+name+"#"+score;
	}
	public List<Student> findAll(){
		List<Student> list=new ArrayList<Student>();
		try {
			BufferedReader br=new BufferedReader(new InputStreamReader(new FileInputStream("student.txt")));
			String b;
			while((b=br.readLine())!=null){
				String s[]=b.split("#");
				list.add(new Student(Integer.parseInt(s[0]), s[1],Double.parseDouble(s[2])));
				System.out.println();
			}
			br.close();
			return list;
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	} 
	public boolean insertS(Student stu){
		try {
			out=new PrintWriter(new OutputStreamWriter(new FileOutputStream("student.txt",true)));
			out.println(stu.show());
			out.flush();
			return true;
		} catch (FileNotFoundException e) {
			return false;
		}finally{
			if(out!=null)out.close();
		}
	}
	public String deleteS(int id){
		List<Student> list=this.findAll();
		Iterator<Student>it=list.iterator();
		while(it.hasNext()){
			Student s=it.next();
			if(id==s.getId()){
				it.remove();
				break;
			}
		}
			File file=new File("student.txt");
			if(file.exists()){
				file.delete();
			}
			for (Student ss : list) {
				this.insertS(ss);
			}
			return "删除成功!";
	}
}
