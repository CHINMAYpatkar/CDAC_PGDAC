package in;
//1. Print 1 to n without using loops
import java.util.*;
public class Q1 {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Please enter the value of n =");
			int n = sc.nextInt();
			printUptoN(n);
			

		}
		
		static void printUptoN(int n)
		{
		    if(n>0)
		    {
		        
		        printUptoN(n-1);
		        System.out.print(n+" ");
		    }
	   }
	}
