package jp.co.internous.sample;

public class User {

	private String fullName;
	private String telephoneNo;


	public void setFullName(String fullName){
		this.fullName = fullName;
	}

	public String getFullName(){
		return fullName;
	}

	public void setTelephoneNo(String telephoneNo){
		this.telephoneNo = telephoneNo;
	}

	public String getTelephoneNo(){
		return telephoneNo;
	}

	public String purchase(Goods goods){
		String message = goods.getGoodsName() + "を";
		message += goods.getPrice() + "円で購入しました。";

		return message;
	}

	}


