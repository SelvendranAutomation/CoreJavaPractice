package interviewQuestions;

public class ReverseStringPreserveSpaceOptimized {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputString="I AM NOT NOT AM I";		
		reverse(inputString);
	}
	
	static void reverse(String inputStr) {
		System.out.println(inputStr);
		char inputArray[]=inputStr.toCharArray();
		int first=0;
		int last=inputArray.length-1;
		
		while(first<last) {
		if(inputArray[first]==' ') {
			first++;	
		}else if(inputArray[last]==' '){
			last--;	
		}else {
			char temp=inputArray[first];
			inputArray[first]=inputArray[last];
			inputArray[last]=temp;
			first++;
			last--;
		}
			
			
		}
		
		
		System.out.println(String.valueOf(inputArray));
		
	}

}
