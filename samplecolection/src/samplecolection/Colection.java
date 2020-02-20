package samplecolection;

import java.util.ArrayList;
import java.util.List;

public class Colection {

	public static void main(String[] args){
		List<Integer> num = new ArrayList<Integer>();
		num.add(1);
		num.add(2);
		num.add(3);
		num.add(4);
		num.add(5);
		num.add(6);

		for(int i=0; i< num.size(); i++){
			System.out.println(num.get(i));
		}
	}

}
//listは、コレクションフレームワークの中でも非常に利用頻度が高い。