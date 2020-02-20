package samplecolection;

import java.util.HashSet;
import java.util.Set;

public class SetSample1 {

	public static void main(String[] args){
		Set<Integer> set=new HashSet<>();
		set.add(1);
		set.add(2);
		set.add(1);


		for (int n: set){
			System.out.println(n);
		}
	}


}

//Setの実行結果には、重複している「１」が表示されない。