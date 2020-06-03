package rete.david.lab2.ex7;
import java.util.Random;
import java.util.Scanner;

public class ex77 {
	public static void main(String[] args) {
		int i;
		Random rand = new Random();
		int b = rand.nextInt(100) + 1;
		Scanner scan = new Scanner(System.in);
		System.out.print("guess the number..");
		int a = 0;
		for (i = 0; i < 3; i++) {
			a = scan.nextInt();
			if (a == b) {
				System.out.println("you got it");
				break ;
			}
			else if (a < b)
				System.out.println("Wrong answer, your number is too low");
			else
				System.out.println("Wrong answer, your number it too high");
		}
		if (a != b) {
			System.out.println("You lost");
		}
		scan.close();
	}
}
