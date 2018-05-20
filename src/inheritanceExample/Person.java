package inheritanceExample;

abstract class Person {
	private long id;

	private String name;
	public Person(long id, String name) {
		
		this.id = id;
		this.name = name;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	abstract String sayHello();
	
	
	
	// example of overLoading
	public String aaa() {
		return "a";
	}
	public String aaa(String name) {
		return name;
	}
	public int aaa(int name) {
		return 0;
	}

}
