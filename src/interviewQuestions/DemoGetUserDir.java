package interviewQuestions;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class DemoGetUserDir {
	public static void main(String[] args) {
		String base_fileName=System.getProperty("user.dir")+"/src/simpleJavaProject/simpleText.txt";
		BufferedReader br = null;
		FileInputStream fis;
		String line=null;
		try {
			fis = new FileInputStream(base_fileName);
			br = new BufferedReader(new InputStreamReader(fis, "UTF-8"));
		} catch (UnsupportedEncodingException | FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 try {
			while ((line = br.readLine()) != null) {
			        System.out.println(line);
			    }
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 System.out.println(line);


		System.out.println(base_fileName);
	}
	
	
	

}
