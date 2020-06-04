package rete.david.lab6.ex3;

public class TestBanca {

	public static void main(String[] args) {
		Bank banca = new Bank();
		banca.addAccount("david", 10000);
		banca.addAccount("ema", 20000);
		banca.printAccounts();

	}

}
