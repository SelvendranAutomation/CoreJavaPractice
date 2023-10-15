package interviewQuestions;

import java.util.regex.Pattern;

public class TPMCLegacyPatternMatching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String SOURCE_CODE="87";
		String TYPE_OF_CASE="2";  
		String RECORD_INDICATOR="R";
		String LATE_NOTIFICATION_IND="1";
		String  PATIENT_SEX="N";

		
		if(patternCheck("[0-9]{2}",SOURCE_CODE)) 
		System.out.println(SOURCE_CODE+" Correct");	
		else System.out.println(SOURCE_CODE+" Not Correct");
		
		if(patternCheck("[124]{1}",TYPE_OF_CASE)) 
		System.out.println(TYPE_OF_CASE+" Correct");	
		else System.out.println(TYPE_OF_CASE+" Not Correct");	
		
		if(patternCheck("[RC]{1}",RECORD_INDICATOR)) 
		System.out.println(RECORD_INDICATOR+" Correct");	
		else System.out.println(RECORD_INDICATOR+" Not Correct");	
		
		if(patternCheck("[01]{1}",LATE_NOTIFICATION_IND)) 
		System.out.println(LATE_NOTIFICATION_IND+" Correct");	
		else System.out.println(LATE_NOTIFICATION_IND+" Not Correct");	
		
		if(patternCheck("[MF]{1}",PATIENT_SEX)) 
		System.out.println(PATIENT_SEX+" Correct");	
		else System.out.println(PATIENT_SEX+" Not Correct");	

		

	}
	
	
	public static boolean patternCheck(String pattern,String match) {
		
		if(Pattern.matches(pattern, match)  )
		return true;
		else 
		return false;
	}

}
