package com.internousdev.ecsite.action;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.MyPageDAO;
import com.internousdev.ecsite.dto.MyPageDTO;
import com.opensymphony.xwork2.ActionSupport;

public class MyPageAction extends ActionSupport implements SessionAware{
	private Map<String, Object> session;
	private String deleteFlg;
	private String message;
	MyPageDAO myPageDAO=new MyPageDAO();
	private ArrayList<MyPageDTO> myPageList=new ArrayList<MyPageDTO>();

	public String execute() throws SQLException{

			//もしログインされていればERRORを返す
		if(!session.containsKey("login_user_id")) {
			return ERROR;
		}

		if(deleteFlg == null) {
			//履歴の削除がされているか否かチェックしている
			String item_transaction_id = session.get("id").toString();
			String user_master_id = session.get("login_user_id").toString();
			myPageList = myPageDAO.getMyPageUserInfo(item_transaction_id, user_master_id);
		}else if(deleteFlg.equals("1")) {
			delete();//deleteメソッドを呼び出して履歴の削除を行います
		}

		String result=SUCCESS;
		return result;
	}

	public void delete() throws SQLException{
		//履歴の削除を行うためのメソッドです。
		String item_transaction_id = session.get("id").toString();
		String user_master_id = session.get("login_user_id").toString();

		int res = myPageDAO.buyItemHistoryDelete(item_transaction_id, user_master_id);
									//DBから削除した履歴情報の件数を「res」に格納しています。
		if(res > 0) {
			myPageList=null;
			setMessage("商品情報を正しく削除しました。");
		}else if(res == 0) {
			setMessage("商品情報の削除に失敗しました。");
		}
	}

	public String getDeleteFlg() {
		return deleteFlg;
	}

	public void setDeleteFlg(String deleteFlg) {
		this.deleteFlg=deleteFlg;
	}

	public ArrayList<MyPageDTO> getMyPageList(){
		return this.myPageList;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message=message;
	}

	public Map<String, Object> getSession(){
		return this.session;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session=session;
	}

}
