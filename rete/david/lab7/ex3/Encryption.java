package rete.david.lab7.ex3;

import java.util.*;
import java.io.*;

public class Encryption {
	public static void main(String[] args) throws IOException {
		FileReader in = new FileReader("rete/david/lab7/ex3/data.txt");
		Scanner stdin = new Scanner(System.in);
        System.out.println("[E]ncrypt/[D]excrypt: ");
		String c = stdin.next();
		stdin.close();

		FileWriter out = new FileWriter((String)("rete/david/lab7/ex3/data." + (c.equals("E") ? "enc" : "dec")));

		int i;
		char x;
		while ((i = in.read()) != -1) {
			x = (char)i;
			if (i != 10 && i != 32)
				x = (char)(c.equals("E") ? (i - 1) : (i + 1));
			out.write(x);
		}

	in.close();
	out.close();
	}
}
