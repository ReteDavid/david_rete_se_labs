package rete.david.lab2.ex3;
import java.util.Scanner;
public class ex33 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("enter first no.");
		int A = scan.nextInt();
		System.out.print("enter second no: ");
		int B = scan.nextInt();
		scan.close();

		int n;
		int count = 0;
		for (n = A; n <= B; n++) {
			if (!prime(n)) {
				System.out.print(n + " ");
				count++;
			}
		}
		System.out.println("\n" + count + " nr prime");
	}
	public static boolean prime(int n) {
		boolean flag = false;
		int i;

		for (i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				flag = true;
				break ;
			}
		}
		return (flag);
	}

}
