package polymorphismExample;

public class MainExample {

	public static void main(String[] args) {
		Student student=new Student(12,"aa",20);
		SecondEmployee employee=new SecondEmployee(15,"employee");
		PrintController pController=new PrintController();
//		
//		pController.printInfo(employee);
//		pController.printInfo(student);
//		
		pController.printInfoWithInterface(employee);
		pController.printInfoWithInterface(student);
	}

}
