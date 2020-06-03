package rete.david.lab4.ex2;

public class TestAuthor {

	public static void main(String[] args) {
		Author aut = new Author("gigel", "gegel@hotmail.com", 'm');
		aut.getEmail();
		aut.getGender();
		System.out.println(aut.getName());
		aut.toString();
		aut.setEmail("david@gmail.com");
		aut.toString();
		System.out.println(aut.toString());

	}

}
