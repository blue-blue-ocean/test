package jp.co.internous.sampleextends;

public class Main {

	public static void main(String[] args){
		Student s = new Student("Taro");

		s.setName("Jiro");
		System.out.println(s.getName());
		s.study("英語");

		Staff staff = new Staff("Keita");

		staff.work("事務");
	}

}
