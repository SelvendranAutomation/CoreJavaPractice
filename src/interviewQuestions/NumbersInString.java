package interviewQuestions;

public class NumbersInString {
	
	
	static int sumOfIntegers(String ipStr) {
		int result = 0;
		String temp="";
		for(int i=0;i<ipStr.length();i++) {
			if(Character.isDigit(ipStr.charAt(i)))
			temp+=ipStr.charAt(i);	
			else {
				result+=Integer.parseInt(temp);
				temp="0";
			}
		}
		
		
		return result+Integer.parseInt(temp);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String inputString="1abc23";
		
		System.out.println("Sum Of Integers :"+sumOfIntegers(inputString));
	}

}
