
public class Questions2_2 {

	public static void main(String[] args) {
		
		StringBuffer sb= new StringBuffer("it is used to _ at specified index position");
		
		sb.insert(15, "insert text");
		
		System.out.println(sb);
		
		StringBuffer sb1= new StringBuffer("This methods returns the reversed object on which it was called");
		
			System.out.println(sb1.reverse());
	}

}
