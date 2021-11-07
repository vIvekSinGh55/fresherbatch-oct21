import java.util.*;
public class Login_valid {
	public static void main(String args[]) {
		Scanner S = new Scanner(System.in);
		
		System.out.print("Make login name:");
		String Loginname = S.next();
		System.out.print("Make password:");
		String Password = S.next();
		
		System.out.println("Please enter your login credential!");
		
		System.out.print("Enter your Loginname:");
		String Login = S.next();
		
		System.out.print("Enter your Password:");
		String Pass = S.next();
		
		int count=1;
		int flag=1;
		while(count<3) //1<2<3 4
		{
			if((Login.contains(Loginname)) && Pass.contains(Password)) 
			{
				System.out.println(" Welcome ! "+Login);
				count=3;
			}
			else 
			{
				System.out.print("please again Enter your Login id:" );
				Login =S.next();
				System.out.print("please again Enter your Password:");
				Pass =S.next();
				count++; //2 3
				flag++;
			}
		}
		System.out.println("Please Contact to Admin!");
//		if(flag==3) 
//		{
//			System.out.println("Please Contact to Admin!");
//		}
		
	}
		
}
