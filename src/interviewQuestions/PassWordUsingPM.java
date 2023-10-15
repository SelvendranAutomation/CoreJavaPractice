package interviewQuestions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PassWordUsingPM {
	
	public static void main(String args[]) {
		String inputString;
		boolean length = false,lowerCase = false,upperCase = false,isNumber=false,isSpecialChar = false;
		Scanner sc=new Scanner(System.in);
		inputString=sc.nextLine();
		Pattern upper= Pattern.compile("[A-Z ]");
		Pattern lower= Pattern.compile("[a-z ]");
		Pattern number= Pattern.compile("[0-9 ]");
		Pattern special= Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
		
		Matcher upperm = upper.matcher(inputString);
		Matcher lowerm = lower.matcher(inputString);
		Matcher numberm = number.matcher(inputString);
		Matcher specialm = special.matcher(inputString);
		
		if(inputString.length()>=8)
			length=true;
		
		lowerCase = lowerm.find();
		upperCase = upperm.find();
		isNumber = numberm.find();
		isSpecialChar = specialm.find();
		
		if(length&&lowerCase&&upperCase&&isSpecialChar)
			System.out.println("Correct PassWord");
		else
			System.out.println("In-Correct PassWord");
			System.out.println(length+" : length");
			System.out.println(isNumber+" : isNumber");
			System.out.println(lowerCase+" : lowerCase");
			System.out.println(upperCase+" : upperCase");
			System.out.println(isSpecialChar+" : isSpecialChar");
	}

}
