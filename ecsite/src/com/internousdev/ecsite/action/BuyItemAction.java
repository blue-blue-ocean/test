package com.internousdev.ecsite.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class BuyItemAction extends ActionSupport implements SessionAware{
	private int count;
	private String pay;
	private Map<String, Object> session;
	private String result;

	public String execute() {
		result=SUCCESS;

		session.put("count", count);
		int intCount=Integer.parseInt(session.get("count").toString());
					//変数countを文字列から数字に変換して、変数intCountに代入している
		int intPrice=Integer.parseInt(session.get("buyItem_price").toString());
					//同上
		session.put("total_price", intCount * intPrice);
					//数字に変換した変数を使い総額の計算を行い、結果をMapに追加している
		String payment;

		if(pay.equals("1")) {
			payment="現金払い";
			session.put("pay", payment);
		}else {
			payment="クレジットカード";
			session.put("pay", payment);
		}
		return result;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count=count;
	}

	public String getPay() {
		return pay;
	}

	public void setPay(String pay) {
		this.pay=pay;
	}

	public Map<String, Object> getSession(){
		return this.session;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session=session;
	}

}
