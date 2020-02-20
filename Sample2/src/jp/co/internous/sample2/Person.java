package jp.co.internous.sample2;

public class Person {

	public String name;
	public String from;


	public Person(String from){
		this.from = from;
	}

	public String getName(){
		return name;
	}

	public void setName(String name){
		this.name = name;
	}


	public String getFrom(){
		return from;
	}

	public void setFrom(String from){
		this.from = from;
	}

	public void introduce(){
		System.out.println("私は" + name + "です。" + from + "出身です。");
	}

	public void introduce(String otherMessage){
		introduce();
		System.out.println(otherMessage);
	}

}
