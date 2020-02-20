package com.internousdev.ecsite.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.BuyItemDAO;
import com.internousdev.ecsite.dto.BuyItemDTO;
import com.opensymphony.xwork2.ActionSupport;


public class HomeAction extends ActionSupport implements SessionAware{

	private Map<String, Object> session;//Map型の変数sessionを定義する



	public String execute() {
		String result="login";


		if(session.containsKey("login_user_id")) {
			//containskeyで指定したキーが存在するか確認する


			BuyItemDAO buyItemDAO=new BuyItemDAO();
			BuyItemDTO buyItemDTO= buyItemDAO.getBuyItemInfo();

			//session(Map)にid,name,priceの３つの要素を追加する
			session.put("id", buyItemDTO.getId());
			session.put("buyItem_name", buyItemDTO.getItemName());
			session.put("buyItem_price", buyItemDTO.getItemPrice());
			result=SUCCESS;
		}

		return result;  //SUCCESSを返却する
	}



	public Map<String, Object> getSession(){
		return session;
	}



	public void setSession(Map<String, Object> session) {
		this.session=session;
	}

}
