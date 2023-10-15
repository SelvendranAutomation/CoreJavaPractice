package interviewQuestions;

public class PrintWordNoOfTimesWithoutLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String wordToPrint="Hello";
		String s="i";
		
		s=s.replaceAll("i", "iiiiiiiiii");
		s=s.replaceAll("i", "iiiiiiiiii");
		s=s.replaceAll("i", "iiiiiiiiii");
		s=s.replaceAll("i", wordToPrint+"\n");
		
		System.out.println(s);
		

	}

}
