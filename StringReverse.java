import java.util.Scanner;

public class StringReverse {
	
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Please enter a word");
			
			
			System.out.println(reverse(scan.nextLine()));
		}
	}
	
	
	
	
	public static String reverse(String str) {
		
		String temp="";
		
		for(int i=str.length()-1;i>=0;i--) {
			temp+=str.charAt(i);
			
		}
		
		
		
		return temp;
		
	}
	
	
	
	
	
}
