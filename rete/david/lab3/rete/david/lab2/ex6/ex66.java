package rete.david.lab2.ex6;
import java.util.Scanner;

public class ex66 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("enter your number:");
		int n = scan.nextInt();
		long fact = 1;
		fact = factorial(n);   
		System.out.println("Factorial of "+n+" is: "+fact);   
		
	}
	static int factorial(int n){    
		  if (n == 0)    
		    return 1;    
		  else    
		    return(n * factorial(n-1));    
		 }  
}
