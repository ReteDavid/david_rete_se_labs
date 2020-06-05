package rete.david.lab9.ex3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TextFileShow extends JFrame implements ActionListener{
	
	JTextField textfield1 ;
	JTextArea tarea;
	JButton button;
	
	public TextFileShow()
	{
		setTitle("FilenameShow");
        setSize(400, 400);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        
		textfield1 = new JTextField();
		add(textfield1);
		textfield1.setLocation(10, 20);
	    textfield1.setSize(100, 20);
	    textfield1.setEditable(true);
	    
	    tarea  =new JTextArea();
	    add(tarea);
	    tarea.setBounds(10,100,200,100);
	    
	    button = new JButton("enter file name");
	    add(button);
	    button.setBounds(10, 100, 200, 50);
	    button.addActionListener(this);

		
	}

	 public static void main(String[] args) {
		 new TextFileShow();
	 }
	 
	@Override
	public void actionPerformed(ActionEvent e) {
		 String fileName = textfield1.getText();
         tarea.setText("");
         try (BufferedReader file = new BufferedReader(new FileReader(fileName))) {
             String fileContent = "";
             while ((fileContent = file.readLine()) != null) {
                 tarea.setText(tarea.getText() + "\n" + fileContent);
             }
         }
         catch(IOException ioe) {
             System.out.println("file not found " + fileName);
         }
	}
	
}
