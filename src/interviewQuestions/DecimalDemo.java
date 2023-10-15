package interviewQuestions;

public class DecimalDemo {
	
	public static void main(String args[]) {
		
		
	       String str="+2.53GHz";
	       String decimal_values= str.replaceAll("[^0-9\\.]", "");
	       System.out.println(decimal_values);
	}

}
