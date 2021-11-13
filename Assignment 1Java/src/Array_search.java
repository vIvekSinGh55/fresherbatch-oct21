
public class Array_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		 
		
		int Number=19;
		for(int i=0;i<a.length;i++) 
		{
			if(a[i]==Number) {
				System.out.println("it contained number at the position of" +  (i+1));
			}
		}
		
		

	}

}
 