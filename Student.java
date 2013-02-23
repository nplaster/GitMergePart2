
public class Student {
	private int grade;
	private String name;
	
	Student(int grade, String name) {
		super();
		this.grade = grade;
		this.name = name;
	}

	public int getGrade() {
		return grade;
	}

	public String getName() {
		return name;
	}
	
	public void printName(){
		System.out.println("Name:" + name);
	}
	
	public void printGrade() {
		System.out.println(name + " " + grade + "%.");
	}

}
