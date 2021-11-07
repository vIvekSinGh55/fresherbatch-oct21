import java.util.Scanner;

public class Income_tax {
	public static void main(String args[]) {
		Scanner S= new Scanner(System.in);
		
		System.out.println("Enter your Ctc:");
		double Ctc = S.nextDouble();
		
		if(Ctc>0 && Ctc<=180000) {
			System.out.println("you dont need to pay any tax");
			
		}
		else if(Ctc>180000 && Ctc<=300000) {
			System.out.println("your tax amount is"+Ctc*0.1);
			
		}
		else if(Ctc>300000 && Ctc<=500000) {
			System.out.println("your tax amount is "+Ctc*0.2);
			
		}
		else if(Ctc>500000 && Ctc<=1000000) {
			System.out.println("your tax amount is"+Ctc*0.3);
			
		}
	}
	

}
