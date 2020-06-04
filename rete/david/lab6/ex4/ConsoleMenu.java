package rete.david.lab6.ex4;
import java.util.Scanner;
public class ConsoleMenu {

	public static void main(String[] args) {
		Dictionary dictionar = new Dictionary();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1 -> add word   /   2 -> show words");
		int name = scan.nextInt();
		scan.nextLine();
		
		switch (name) {
			case 1: {
					System.out.println("give the word");
					Word word = new Word(scan.nextLine());
					System.out.println("give the definition");
					Definition definition = new Definition(scan.nextLine());
					dictionar.addWord(word, definition);
					dictionar.getAllWords();
					break ;
			}
			case 2: {
				//if (dex.getHashMap().size() == 0) {
				//	System.out.println("there are no words inside dictionary");
					//break ;
				//}
					dictionar.printDictionary();
					break ;
			}
			default:
				System.out.println("Dictionnnnarrrrr");
		}

	}
}

