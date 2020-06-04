package rete.david.lab6.ex1;

public class TestBankAccount {
	public static void main(String[] args) {
		BankAccount a, b, c;
		a = new BankAccount("DAVID", 1122);
		b = new BankAccount("SAMI");
		c = new BankAccount("DANI");

		System.out.println(a.equals(b) + " " + a.equals(c));
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		System.out.println(c.hashCode());
	}
}
