package in;
//. Program for length of a string using recursion
import java.util.Scanner;

public class Q7 {
	static int StrLength(String str) { 
		if(str.isEmpty()) {
			return 0 ;
		}
		return 1 + StrLength(str.substring(1));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc  =  new Scanner(System.in);
       
       System.out.print("Enter a String : ");
       String input =  sc.nextLine();
       System.out.println(StrLength(input));
	}

}
