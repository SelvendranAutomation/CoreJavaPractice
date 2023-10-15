package interviewQuestions;

import java.util.Scanner;

public class PassWordValidation {
	
	public static void main(String args[]) {
		String inputString;
		boolean length = false,lowerCase = false,upperCase = false,isSpecialChar = false;
		Scanner sc=new Scanner(System.in);
		inputString=sc.nextLine();
		String specialChar="!@#$%^&*";
		char charArray[]=specialChar.toCharArray();
		
		if(inputString.length()>=8)
			length=true;
		
		
		for(int i=0;i<inputString.length();i++) {

		if(inputString.charAt(i)>='a'&&inputString.charAt(i)<='z') {
			lowerCase=true;
			System.out.println(inputString.charAt(i)+" : Lower Case");
		}
		if(inputString.charAt(i)>='A'&&inputString.charAt(i)<='Z') {
			upperCase=true;
			System.out.println(inputString.charAt(i)+" : Upper Case");
		}
		if(inputString.charAt(i)>=0&&inputString.charAt(i)<=9) {
			upperCase=true;
			System.out.println(inputString.charAt(i)+" : Number");
		}
		if(contains(inputString.charAt(i),charArray)) {
				isSpecialChar=true;	
		System.out.println(inputString.charAt(i)+" : Special");
			
		}
		
		if(length&&lowerCase&&upperCase&&isSpecialChar)
			System.out.println("Correct PassWord");
		else
			System.out.println("In-Correct PassWord");
			System.out.println(length+" : length");
			System.out.println(lowerCase+" : lowerCase");
			System.out.println(upperCase+" : upperCase");
			System.out.println(isSpecialChar+" : isSpecialChar");
	}
	
	
	
	}
	static boolean contains(char c, char[] array) {
	    for (char x : array) {
	        if (x == c) {
	            return true;
	        }
	    }
	    return false;
	}

}
