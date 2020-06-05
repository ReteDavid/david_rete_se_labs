package rete.david.colocviu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class GuiApplication extends JFrame implements ActionListener{
	JTextField text1, text2;
	JButton button;
	
	public GuiApplication()
	{
		setTitle("WriteInTextFile");
        setSize(500, 500);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        
        text1 = new  JTextField();
        text1.setLocation(10, 20);
	    text1.setSize(100, 20);
	    add(text1); 
	    
	    text2 = new JTextField();
	    text1.setLocation(30, 40);
	    text1.setSize(100,20);
	    add(text2); 
	    
	    button = new JButton("write in file");
	    add(button);
        button.setBounds(10, 100, 200, 50);
        
        button.addActionListener(this);
	}
	
	public static void main(String[] args) {
		new GuiApplication();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String content = text2.getText();
		try {
			FileWriter fw = new FileWriter("data.txt");
			fw.write(content);
			fw.close();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
}
