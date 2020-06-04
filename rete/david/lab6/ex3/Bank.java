package rete.david.lab6.ex3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

import rete.david.lab6.ex1.BankAccount;
import rete.david.lab6.ex2.Comparat;


public class Bank {
		private TreeSet<BankAccount> accounts = new TreeSet<BankAccount>(new Comparat());

		public void addAccount(String owner, double balance) {
			accounts.add(new BankAccount(owner, balance));
		}
		public void printAccounts() {
			for (BankAccount i : accounts) {
				System.out.println(i.toString());
			}
		}

		public void printAccounts(double minBalance, double maxBalance) {
		
			for (BankAccount i : accounts) {
				if (i.getBalance() >= minBalance && i.getBalance() <= maxBalance)
					System.out.println(i.toString());
			}
		}
		
		public BankAccount getAccount(String owner) {
			for (BankAccount i : accounts) {
				if (i.getOwner() == owner)
					return (i);
			}
			return (null);
		}
}
