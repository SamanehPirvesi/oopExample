package inheritanceExample;

public class Student extends Person{

	private int media;

	public Student(int id , String name , int media) {
		super(id,name);
		this.media=media;

	}

	public int getMedia() {
		return media;
	}

	public void setMedia(int media) {
		this.media = media;
	}



}
