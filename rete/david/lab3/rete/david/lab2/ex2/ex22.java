package rete.david.lab2.ex2;
import java.util.Scanner;
public class ex22 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("enter a number: ");
		int a = scanner.nextInt();
		if (a == 1)
			System.out.println("one");
		else if (a == 2)
			System.out.println("two");
		else if (a == 3)
			System.out.println("three");
		else if (a == 4)
			System.out.println("four");
		else if (a == 5)
			System.out.println("five");
		else if (a == 6)
			System.out.println("six");
		else if (a == 7)
			System.out.println("seven");
		else if (a == 8)
			System.out.println("eight");
		else if (a == 9)
			System.out.println("nine");
		else
			System.out.println("other");

		switch (a) {
			case 1: System.out.println("one");
					break;
			case 2: System.out.println("two");
					break;
			case 3: System.out.println("three");
					break;
			case 4: System.out.println("four");
					break;
			case 5: System.out.println("five");
					break;
			case 6: System.out.println("six");
					break;
			case 7: System.out.println("seven");
					break;
			case 8: System.out.println("eight");
					break;
			case 9: System.out.println("nine");
					break;
			default: System.out.println("other");
		}
		scanner.close();
	}

}
