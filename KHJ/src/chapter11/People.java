package chapter11;

class Human {
	private String name;
	private int age;
	
	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString() {
		return name + ", " + age;
	}
}

class People extends Human {
	private String major;
	public People(String name, int age, String major) {
		super(name, age);
		this.major = major;
	}
	
	public String getMajor() {
		return major;
	}
	
	public void setMajor(String major) {
		this.major = major;
	}
	
	public String toString() {
		return super.toString() + ", " + major;
	}
	
	public static void main(String args[]) {
		People s = new People("현제", 25, "컴퓨터");
		System.out.println(s.toString());
	}
}