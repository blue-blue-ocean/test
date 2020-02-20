package jp.co.internous.sample;

public class Main {

	public static void main(String[] args){

		User user1 = new User();

		user1.setFullName("鈴木 一郎");
		user1.setTelephoneNo("090-1111-2222");

		String fullName = user1.getFullName();
		String telNo = user1.getTelephoneNo();

		System.out.println(fullName);
		System.out.println(telNo);


		Goods goods = new Goods();
		goods.setGoodsName("Tシャツ");
		goods.setPrice(1000);

		String message = user1.purchase(goods);
		System.out.println(message);

	}


}
