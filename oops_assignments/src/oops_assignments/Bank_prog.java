package oops_assignments;

class Bank{
	String Bank_Name;
	int Cash;
	void bankdetail() {
		System.out.println("This  is "+Bank_Name+" Deatail");
	}
}
class Saving_account extends Bank{
	int Fixed_deposite =9000;
	void bankdetail() {
		
		System.out.println("This  is "+Bank_Name+" Deatail with Total Cash "+(Cash+Fixed_deposite));
	}
}
class Current_account extends Bank{
	int Cash_credit=500;
	void bankdetail() {
		System.out.println("This  is "+Bank_Name+" Deatail with Total Cash "+(Cash+Cash_credit));
	}
}

public class Bank_prog {
	public static void main(String[] args) {
		Bank sa= new Saving_account();
		sa.Bank_Name="goa";
		sa.Cash=1500;
		sa.bankdetail();
		
		Bank ca= new Current_account();
		ca.Bank_Name="goaa";
		ca.Cash=1200;
		ca.bankdetail();
		
		
		
	}

}
