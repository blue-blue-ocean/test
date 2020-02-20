package samplecolection;

import java.util.HashMap;
import java.util.Map;

public class MapSample1 {

	public static void main(String[] args){
		Map<String, Integer> testMap = new HashMap<>();
		//Mapインスタンスをキーの型がString、値の型がIntegerとして生成。

		testMap.put("Taro", 30);
		//Mapインスタンスにキーが”Taro”、値が30という１要素を追加。

		int point = testMap.get("Taro");
		//”Taro”というキーに対応する値をgetメソッドで取得。

		System.out.println(point);
	}

}
//実行結果には、１３行目でputした値の３０が表示される。