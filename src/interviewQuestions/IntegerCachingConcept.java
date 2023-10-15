package interviewQuestions;

public class IntegerCachingConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//		Compare tow int numbers (Integer caching)
		
		//		-128 to 127
		
		
		Integer num1=-128;
		Integer num2=-128;
		
		if(num1==num2)
			System.out.println("Both are Equal");
		else
			System.out.println("Both are not Equal");
		
		
		num1=100;
		num2=100;
		
		if(num1==num2)
			System.out.println("Both are Equal");
		else
			System.out.println("Both are not Equal");
		
		
		num1=128;
		num2=128;
		
		if(num1==num2)
			System.out.println("Both are Equal");
		else
			System.out.println("Both are not Equal");
		
		num1=-129;
		num2=-129;
		
		if(num1==num2)
			System.out.println("Both are Equal");
		else
			System.out.println("Both are not Equal");
		
		

	}

}
