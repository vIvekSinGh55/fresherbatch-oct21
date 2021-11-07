import java.util.Scanner;

public class Subject_result {

	public static void main(String[] args) {
		Scanner S=new Scanner (System. in);
	    
	    System.out.println("Enter Subject one marks:");
	    int s1=S.nextInt();
	    
	    System. out. println("Enter Subject second marks:");
	    int s2=S.nextInt();
	    
	    System. out. println("Enter Subject third marks:");
	    int s3=S.nextInt();
	    
	    
	    if(s1>60 && s2>60 &&s3>60) {
	    	System.out.println("You are passed");
	    }
	    else if((s1>60 && s2>60)||(s1>60 &&s3>60)||(s2>60&&s3>60) ){
	    	System.out.println("You are promoted");
	    	
	    }
	    else  {
	    	System.out.println("you are fail");
	    }
	}	
}
