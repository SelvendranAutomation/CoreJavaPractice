package interviewQuestions;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		String s1="C:\\Regression\\20063WCA000101268068.pdf";
		s1=s1.substring(s1.lastIndexOf("\\")+1,s1.lastIndexOf("."));
		
	System.out.println(s1);

	}

}
