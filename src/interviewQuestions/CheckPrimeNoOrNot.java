package interviewQuestions;

public class CheckPrimeNoOrNot {

	
	static void checkPrime(int number){
		
		boolean isPrime=true;
		int copyNumber=number;
		
		
		while(copyNumber!=0) {
			int rem=copyNumber%10;
			if(rem>1) {
				isPrime=false;
				break;
			}else {
				copyNumber=copyNumber/10;
				
			}
			
		}
		if(isPrime)
		System.out.println(number+" : Prime Number");
		else
			System.out.println(number+" : Not a prime Number");	
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkPrime(111011);
		checkPrime(112011);
		

	}

}
