package polymorphismExample;

public class PrintController {
//	  /**
//	   * polymorphism with inheritance
//	   * @param p
//	   */
//	public void printInfo(Person p) {
//		System.out.println(p.getName());
//	}
//	
	  /**
	   * polymorphism with Interface
	   * @param p
	   */
	public void printInfoWithInterface(PersonInterface p) {
		System.out.println(p.sayYourName());
	}

}
