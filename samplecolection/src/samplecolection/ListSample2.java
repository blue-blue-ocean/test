package samplecolection;

import java.util.Arrays;
import java.util.List;

public class ListSample2 {

	static final String[] WEEK = {"Sun", "Mon", "Tue", "Wed","Thu", "Fri", "Sut", "Sun"};

	public static void main(String[] args){

		List<String> week = Arrays.asList(WEEK);
		//Arrayクラスが持つstaticメソッドのasListを使い簡単にList生成できる。


		for (String day : week){
			System.out.println(day);
			//拡張forループを使い、indexを使わず各要素を表示可能。
		}
	}

}
