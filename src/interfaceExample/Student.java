package interfaceExample;

public class Student implements Hello{
	private String name;
	private int id;

	public Student(String name, int id) {

		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	public String sayHello() {

		return "hello from student";
	}

	@Override
	public String getIdPlusName() {
		
		return this.id+" " +this.name;
	}

}
