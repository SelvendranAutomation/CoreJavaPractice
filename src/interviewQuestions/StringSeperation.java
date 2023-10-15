package interviewQuestions;

public class StringSeperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Gateway ID -3956763 Recieved at 02-14-2022 06:51:21";
		str=str.substring(str.indexOf("-")+1, str.indexOf("Recieved")-1);
		System.out.println(str);
	
	
	}

}
