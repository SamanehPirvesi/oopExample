package inheritanceExample;

public class Employee extends Person{
	private int salary;

	public Employee(int id,String name,int salary) {
		super(id,name);	
		this.salary = salary;
		
	}

	

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	String sayHello() {
		return null;
	}
}
