package rete.david.lab2.ex1;
import java.util.Scanner; 

public class ex11 {

	public static void main(String[] args) {
		int n1;
		int n2;
		Scanner console = new Scanner(System.in);
		System.out.println("enter first  number:");
		n1 = console.nextInt();
		System.out.println("enter second number:");
		n2 = console.nextInt();
		System.out.println("maximum:");
		if(n1>n2)
			System.out.println(n1);
		else System.out.println(n2);
		
	}

}
