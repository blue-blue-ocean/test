package jp.co.internous.sampleextends;

public class Student extends Person {

	public Student(String name){
		super(name);
	}

	public void study(String subject){
		System.out.println(subject + "を勉強します。");
	}

}
