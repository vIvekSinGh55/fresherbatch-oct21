
public class Armstrong_number_ranges {
	public static void main(String Args[])
	{
		int n1=100;
		int n2=1000;
		
		for(int i=n1; i<n2; i++)
		{
			int result=0;
			int	c;
			int number=i;
			
			while(number != 0) 
			{
				c = number%10;
				result = result + (c*c*c);
				number = number/10;
			}
			if(result == i)
			{
				System.out.println(""+i+" is an Armstrong number.");
			}	
		}
	}
}