package polymorphismExample;

public class SecondEmployee   implements PersonInterface {
	private long id;

	private String name;

	public SecondEmployee(long id, String name) {
	
		this.id = id;
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}


	public String sayYourName() {
		return name;
	}
	
	

}
