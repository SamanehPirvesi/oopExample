package interfaceExample;

public class Employee implements Hello,Salary {
	private String name;
	private int salary;
	private long id;

	public Employee(String name, int salary, long id) {

		this.name = name;
		this.salary = salary;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	
	public String sayHello() {
		
		return "hello from employee";
	}

	
	public String getIdPlusName() {
		
		return this.id+ " "+this.name;
	}

	
	public String declareSalaryInEuros() {
		
		return this.salary+".00";
	}

}
