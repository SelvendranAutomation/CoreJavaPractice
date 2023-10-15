package interviewQuestions;

public class ReverseStringPreserveSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputString="I am not a String";
		System.out.println(inputString);
		reverseString(inputString);

	}
	
	static void reverseString(String inputString) {
		char inputArray[]=inputString.toCharArray();
		char resultArray[]=new char[inputArray.length];
		
		for(int i=0;i<inputArray.length;i++) {
			if(inputArray[i]==' ')
				resultArray[i]=' ';
		}
		System.out.println(String.valueOf(resultArray));
		int j=inputArray.length-1;
		
		for(int i=0;i<inputArray.length;i++) {
			
			if(inputArray[i]!=' ') {
				if(inputArray[j]==' ') {
				j--;	
				} 
				resultArray[j]=inputArray[i];	
				j--;
				
				
			}
			
			
		}
		
		System.out.println(String.valueOf(resultArray));
		
	}

}
