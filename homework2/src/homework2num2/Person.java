package homework2num2;

public class Person {
	private String name;
	private String age;
	String gender;
	public Person(String name, String age, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		System.out.println(name+" "+age+" "+gender);
	}
	public Person(String name, String age) {
		super();
		this.name = name;
		this.age = age;
		System.out.println(name+" "+age+" ");
	}
	
	
}
