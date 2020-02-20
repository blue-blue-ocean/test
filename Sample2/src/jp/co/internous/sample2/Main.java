package jp.co.internous.sample2;

public class Main {

	public int toshi;

	public static void main(String[] args){


		//練習用クラスをインスタンス化する
		Practice p = new Practice();

		//Practiceクラスに定義されているsumメソッドを呼び出し
		//２と３を加算した結果を取得する
		int ans = p.sum(3, 2);

		//結果をコンソールに表示する
		System.out.println(ans);

		String fullName = p.createFullName("Taro", "Yamada");
		System.out.println(fullName);



		age(20);
		age(19);


	}

	public static void age(int toshi){
		if(toshi < 20){
			System.out.println("未成年");
		}else{
			System.out.println("成人");
		}
	}




}
