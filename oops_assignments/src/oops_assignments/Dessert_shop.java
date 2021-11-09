package oops_assignments;
import java.util.*;

abstract class Dessertitem{
	abstract void getcost(int n);
	
}
class Candy extends Dessertitem{
	 void getcost(int n) {
		 System.out.println("Total cost of your candy in dollar:"+n);
		 
	 }
	
}
class Cookie extends Dessertitem{
	void getcost(int n) {
		System.out.println();
	}
	
}
class Icecream extends Dessertitem{
	void getcost(int n) {
		System.out.println();
	}
	
}

public class Dessert_shop {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Your Role:");
		System.out.println("Enter 1 if u r Customer.");
		System.out.println("Enter 2 if u r Owner.");
		int role=sc.nextInt();
		
		
		if(role == 1 ) 
		{
			System.out.println("What is Your Order:");
			String order =sc.next();
			
			System.out.println("how many:");
			int n=sc.nextInt();
			
			if(order.contains("Candy")) 
			{
				System.out.println("how many:");
				Candy c= new Candy();
				c.getcost(n);
			}
			else if(order.contains("Cookie")) 
			{
				Cookie ck = new Cookie();
				ck.getcost(n);
			}
			else if(order.contains("Icecream")) 
			{
				Icecream ic= new Icecream();
				ic.getcost(n);
			}

		}
		else if(role == 2 ) 
		{
			System.out.println("Change");
		}
	

	}

}
