import java.util.Scanner;

class UnsupportedOperationException extends Exception{
//	public String toString() {
//		return "UnsupportedOperationExceptionUnsupportedOperationException";
//	}
	
	public UnsupportedOperationException(String msg) {
		super(msg);
	}
	
}

public class Questionno_2 {

	public static void main(String[] args) throws UnsupportedOperationException  
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number1: ");
		int number1=sc.nextInt();
		
		System.out.println("Enter number2: ");
		int number2=sc.nextInt();
		
		try 
		{
			double result=number1/number2;
			System.out.println(result);
		}
		catch(ArithmeticException e) {
		throw new UnsupportedOperationException("You cant divide by Zero!");
		
		}
			
	}
}