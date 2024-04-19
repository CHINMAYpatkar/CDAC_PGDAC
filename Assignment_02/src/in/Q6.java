package in;
//. Print reverse of a string using recursion
import java.util.Scanner;

public class Q6 {
	static String reverse(String str) { 
		if(str.isEmpty() || str.length() == 1) {
			return str ;
		}
		return str.charAt(str.length() -1 )+ reverse(str.substring(0 ,str.length() -1 ));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc  =  new Scanner(System.in);
       
       System.out.print("Enter a String : ");
       String input =  sc.nextLine();
       System.out.println(reverse(input));
	}

}
