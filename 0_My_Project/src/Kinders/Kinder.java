package Kinders;

public class Kinder {

	private String grade ;
	private String name ;
	private int age;
	private String content;
	
	public Kinder() {}
	public Kinder( String grade, String name, int age, String content) {
		this.grade = grade;
		this.name = name;
		this.age = age;
		this.content = content;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	@Override
	public String toString() {
		return "Kinder [toString()=" + super.toString() + "]";
	}
	@Override
	public boolean equals(Object obj) {
		Kinder target = (Kinder)obj;
		return super.equals(obj);
	}
	
}
