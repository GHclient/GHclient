package biz;

import java.util.List;

import domain.vip;

public interface vipBiz {
	//添加会员(办卡)
		public boolean addvip(vip v);
		//查看所有会员信息
		public List<vip> selectAll();
		//根据手机号查询会员信息
		public vip selectById(int phonum);
		//冻结账号
		public boolean Freezacc(int cid);
}
