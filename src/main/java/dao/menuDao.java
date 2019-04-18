package dao;

import domain.menu;

public interface menuDao {
	//查看菜单
	public boolean selectAll();
	//添加菜名
	public boolean addFood(menu m);
	//删除菜名
	public boolean deleteFood(String fn);
	//修改菜信息
	public boolean updateFood(String fn);
}
