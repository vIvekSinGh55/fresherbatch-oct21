import java.util .*;
public class Simple_compound 
{
	public static void main (String args[ ])
	{
	    double amount, rate, year, simple,compound;
	    Scanner S=new Scanner (System. in);
	    
	    System.out.println("Enter the amount:");
	    amount=S.nextDouble();
	    
	    System. out. println("Enter the No.of years:");
	    year=S.nextDouble();
	    
	    System. out. println("Enter the Rate of  interest");
	    rate=S.nextDouble();
	    
	    simple=(amount * year * rate)/100;
	    System.out.println("Simple Interest="+simple);
	    
	    compound=amount * Math.pow(1.0+rate/100.0,year) - amount;
	    System.out. println("Compound Interest="+compound);
	   }

}


