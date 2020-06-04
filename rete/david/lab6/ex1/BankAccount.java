package rete.david.lab6.ex1;

public class BankAccount {
	private String owner;
	private double balance;
	
	public BankAccount(String owner) {
		this.owner = owner;
		this.balance = 0;
	}
	public BankAccount(String owner, double balance) {
		this.owner = owner;
		this.balance = balance;
	}
	
	public double getBalance() { return (this.balance); }
	public String getOwner() { return (this.owner); }

	
	public void withdraw(double amount) {
		if (this.balance >= amount && amount > 0) {
			this.balance -= amount;
			System.out.println("succesfull withdrawal");
		}
		else
			System.out.println("unsuccsesfull withdrawal");
	}
	public void deposit(double amount) {
		if (amount > 0) {
			this.balance += amount;
			System.out.println("all ok");
		}
		else
			System.out.println("error in transaction");
	}

	@Override
	public String toString() {
		return (this.owner + " - " + this.balance);
	}

	@Override
	public boolean equals(Object x) {
		if (x == this) return (true);
		if (!(x instanceof BankAccount)) return (false);

		BankAccount bnk = (BankAccount) x;
		return (owner == bnk.owner && balance == bnk.balance);
	}

	@Override
	public int hashCode() {
		return (owner.hashCode() + (int) balance);
	}
}
