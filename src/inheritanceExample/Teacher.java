package inheritanceExample;

public class Teacher extends Employee{

private int numberOfCourse;

public Teacher(int id, String name, int salary, int numberOfCourse) {
		super(id, name, salary);
		this.numberOfCourse=numberOfCourse;
		
	}

public int getNumberOfCourse() {
	return numberOfCourse;
}



}
