import java.util.Scanner;

public class PasswordMask {
	
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Please input password");
			System.out.println(passwordMask(scan.nextLine()));
		}
	}
	
	
	
	
	public static String passwordMask(String str) {
		
		String firstLetter=str.substring(0,1);
		String lastLetter=str.substring(str.length()-1);
		String temp="";
		String star="*";
		for(int i=1;i<str.length()-1;i++) {
			temp+=star;
		}
		
		return firstLetter+temp+lastLetter; 
	}

}
