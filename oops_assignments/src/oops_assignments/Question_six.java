package oops_assignments;
abstract class Persistence{
	abstract void persist();
}

class Filepersistence extends Persistence{
	void persist() {
		System.out.println("Dont Know from where it displaying");
	}
	
}
class Databsepersistence extends Persistence{
	void persist() {
		System.out.println("Dont Know from where it displaying");
	}
	
}
public class Question_six {

	public static void main(String[] args) {
		Persistence p = new Filepersistence();
		p.persist();

	}

}
