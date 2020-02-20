package samplecolection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapSample2 {

	public static void main(String[] args){
		Map<String, Integer> testMap = new HashMap<>();
		//Mapインスタンスをキーの型がString、値の型がIntegerとして生成。

		testMap.put("Taro", 30);
		testMap.put("Ichiko", 60);
		testMap.put("Jiro", 45);

		for (Entry<String, Integer> entry : testMap.entrySet()){
			//MapのentrySetメソッドはMapが持つ要素（キーと値）をSet型で返します。

			System.out.println(entry.getKey() + "の点数は" + entry.getValue());
		}
	}



}
