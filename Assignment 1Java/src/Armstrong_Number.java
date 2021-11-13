import java.util.Scanner;
public class Armstrong_Number 
{
	public static void main(String Args[])
	{
		Scanner sc = new Scanner(System.in);
//		int number =100;
		System.out.print("Enter the number:");
		int number=sc.nextInt(); 
		int orignalnumber = number; //153
		
		int result=0;             //27
		int	c;
		while(number >0)          //15>0 t                 
		{
			c = number%10;        //153%10= 3 15%10=5  
			number = number/10;       //153/10=15    15/10=1 0
			result = result + (c*c*c); // r= 0+27=27    27+125=152  152+1=153
		}
		
		if(result == orignalnumber)  //153==153
		{
				System.out.println("Armstrong");
		}
		else 
		{
				System.out.println("Not Armstrong ");
		}
	}
}
