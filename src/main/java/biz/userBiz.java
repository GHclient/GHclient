package biz;

import java.util.List;

import domain.user;

public interface userBiz {
	//用户验证
		public boolean verifyuser(int ui,String n,int p);
		//添加用户
		public boolean adduser(user u);
		//删除用户
		public boolean deleteuser(int uid);
		//查看所有用户
		public List<user> selectAll();
		//根据用户id查看用户信息
		public boolean selectById(int uid);
}
