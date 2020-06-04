package rete.david.lab6.ex2;
import rete.david.lab6.ex1.BankAccount;
import java.util.*;
public class Comparat implements Comparator<BankAccount>{
	public int compare(BankAccount ac1, BankAccount ac2) {
		return ((int)ac1.getBalance() - (int)ac2.getBalance());
	}
}
