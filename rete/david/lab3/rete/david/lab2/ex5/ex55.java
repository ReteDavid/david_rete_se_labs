package rete.david.lab2.ex5;
import java.util.Scanner;
public class ex55 {
	public static void main(String[] args) {
		System.out.println("enter array elements:");
		int [] a = new int[10];
		int i;
		Scanner scan = new Scanner(System.in);
		for(i=0;i<10;i++)
			a[i] = scan.nextInt();
		bubbleSort(a, 10);	
        for (i = 0; i < 10; i++)
            System.out.print(a[i] + " ");
  
        System.out.println();
	}
	
	static void bubbleSort(int a[], int n) 
    { 
        int i, j, temp; 
        boolean swapped; 
        for (i = 0; i < n - 1; i++)  
        { 
            swapped = false; 
            for (j = 0; j < n - i - 1; j++)  
            { 
                if (a[j] > a[j + 1])  
                { 
                    // swap
                    temp = a[j]; 
                    a[j] = a[j + 1]; 
                    a[j + 1] = temp; 
                    swapped = true; 
                } 
            }
        }

    } 
}
