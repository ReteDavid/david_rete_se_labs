package rete.david.lab6.ex2;

public class TestBanca {

	public static void main(String[] args) {
		Bank banca = new Bank();
		banca.addAccount("david", 100);
		banca.addAccount("sami", 200);
		banca.addAccount("daniel", 300);
		
		banca.getAccount("sami");
		banca.printAccounts();

	}

}
