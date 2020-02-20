package sample5;

public class Student extends Person{
	public String student;
	public String study;

	public Student(String name){
		this.student = name;
	}

	public String getName(){
		return student;
	}

	public void setName(String name){
		this.student=name;
	}

	public void Study(String subject){
		this.study = subject;
		System.out.println(subject + "を勉強します。");
	}

}
