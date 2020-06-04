package rete.david.lab7.ex2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class SearchCharacter {
	public static void main(String[] args) {
		 
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the character to search for:");
		char caracter = scan.next().charAt(0);
		scan.close();
		int k=0;
		 try {
			 FileReader file = new FileReader("data.txt");
			 int i = 0 ;
			 while((i = file.read())!=-1)
			 {
				 k+= ((char)i == caracter ? 1 : 0);
			 }
		 }catch (FileNotFoundException e) {}
		 catch (IOException e) {}
		 System.out.println("in the file we have " + k + " of " + caracter);
		
	 }
	
}
