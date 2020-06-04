package rete.david.lab6.ex2;
import java.util.*;
import rete.david.lab6.ex1.BankAccount;

public class Bank {
	
	private ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();

	public void addAccount(String owner, double balance) {
		accounts.add(new BankAccount(owner, balance));
	}
	
	//implement a printAccounts which will print a sorted list (by balance) of all accounts;
	public void printAccounts() {
		Collections.sort(accounts, new Comparat());
		for (BankAccount i : accounts) {
			System.out.println(i.toString());
		}
	}

	//implement a printAccounts with range which will display all accounts between min range and max range values.
	public void printAccounts(double minBalance, double maxBalance) {
		//sort the list by balance
		Collections.sort(accounts, new Comparat());
		for (BankAccount i : accounts) {
			if (i.getBalance() >= minBalance && i.getBalance() <= maxBalance)
				System.out.println(i.toString());
		}
	}
	
	//display owner 
	public BankAccount getAccount(String owner) {
		for (BankAccount i : accounts) {
			if (i.getOwner() == owner)
				return (i);
		}
		return (null);
	}
}
