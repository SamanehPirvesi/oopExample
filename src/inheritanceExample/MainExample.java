package inheritanceExample;

public class MainExample {

	public static void main(String[] args) {
		Student student=new Student(12,"aa",20);
		System.out.println(student.getName());
		
		Teacher teacher=new Teacher(13,"samaneh",200,5);
		System.out.println(teacher.getName());
		
		System.out.println(teacher.aaa("tdddhhy"));
	}

}
