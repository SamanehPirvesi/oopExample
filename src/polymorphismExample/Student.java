package polymorphismExample;

public class Student implements PersonInterface{
	private long id;

	private String name;
	private int media;
	public Student(long id, String name, int media) {
		
		this.id = id;
		this.name = name;
		this.media = media;
	}
	public long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getMedia() {
		return media;
	}
	
	public String sayYourName() {
		
		return name ;
	}


}
