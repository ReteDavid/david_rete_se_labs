package rete.david.lab2.ex4;
import java.util.Scanner;
public class ex44 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("enter size of array");
		int n = scan.nextInt();
		int max;
		int[] a = new int[n];
		int i;
		for (i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}
		max = a[0];

		scan.close();
		for (i = 1; i < n; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		System.out.println("max no. is " + max);
		

	}

}
