package interviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamLimitNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list=Arrays.asList(1,3,10,20,30,15,1,13,1,2,2,10,30,19,3);
		
		//get first 5 mumbers ----> sum of 5 mumbers
		
		List<Integer> l=list.stream().limit(5).collect(Collectors.toList());
		System.out.println(l);
		
		
		int sum=list.stream().limit(5).reduce((p,q)->p+q).get();
		System.out.println(sum);
		

	}

}
