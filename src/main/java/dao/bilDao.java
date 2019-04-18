package dao;

import java.sql.Date;
import java.util.List;

import domain.bill;

public interface bilDao {
	//查看当日账单
	public List<bill> selectBsame(Date d);
	//查看所有账单
	public List<bill> selectBill();
	//打印小票
	public boolean print(String billid);
}
