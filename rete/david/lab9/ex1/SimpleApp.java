package rete.david.lab9.ex1;

import javax.swing.JFrame;

//Construire fereastra principala aplicatie
public class SimpleApp extends JFrame{
	
	SimpleApp(){
        setTitle("Titlul ferestrei");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,500);
        setVisible(true);
  }
	public static void main(String[] args) {
        SimpleApp a = new SimpleApp();
  }
}
