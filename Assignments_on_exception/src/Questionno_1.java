import java.util.*;
public class Questionno_1 {

	public static void main(String[] args) {
		
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
			System.out.println("you cant dived by zero");
		}
	}

}
