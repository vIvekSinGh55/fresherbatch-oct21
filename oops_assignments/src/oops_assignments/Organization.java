package oops_assignments;

class Employee{
	int id;
	String name;
	int salary;
	public void Calculate() {
		System.out.println(name +"salary"+salary);
		
	}
	
}
class Manager extends Employee{
	int isalary=1500;
	public void Calculate() {
		System.out.println(name+" Salary with incentive "+ (salary+isalary)  );
	}
		
}
class Labour extends Employee{
	int overtime=500;
	public void Calculate() {
		System.out.println(name+" Salary with overtime "+ (salary+overtime)  );
	}
	
}

public class Organization {

	public static void main(String[] args) {
		Manager M=new Manager();
		M.id=12;
		M.salary=2500;
		M.name="dont";
		M.Calculate();
		
		Employee E= new Labour();
		E.id=34;
		E.name="hii";
		E.salary=1000;
		E.Calculate();
		

	}

}
