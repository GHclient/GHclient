package domain;

import java.io.Serializable;
import java.sql.Date;

public class vip implements Serializable{
	private static final long serialVersionUID=1234567;
	//卡号
	private int cardid;
	//姓名
	private String vipname;
	//会员手机号
	private int memphone;
	//余额
	private double membalance;
	//充值日期
	private Date rechargedate;
	//卡状态
	private int state;
	public int getCardid() {
		return cardid;
	}
	public void setCardid(int cardid) {
		this.cardid = cardid;
	}
	public String getVipname() {
		return vipname;
	}
	public void setVipname(String vipname) {
		this.vipname = vipname;
	}
	public int getMemphone() {
		return memphone;
	}
	public void setMemphone(int memphone) {
		this.memphone = memphone;
	}
	public double getMembalance() {
		return membalance;
	}
	public void setMembalance(double membalance) {
		this.membalance = membalance;
	}
	public Date getRechargedate() {
		return rechargedate;
	}
	public void setRechargedate(Date rechargedate) {
		this.rechargedate = rechargedate;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
