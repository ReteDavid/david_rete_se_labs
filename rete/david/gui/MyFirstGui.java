package rete.david.gui;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyFirstGui implements ActionListener{
	
	int count = 0;
	JLabel label;
	JPanel panel;
	JButton button;
	JFrame frame;
	
	public MyFirstGui()
	{
		panel = new JPanel();
		button = new JButton("click on me");
		frame = new JFrame();
		label = new JLabel("0 clicks");
		
		panel.setBorder(BorderFactory.createEmptyBorder(30,30, 30, 30));
		panel.setLayout(new GridLayout(1,0));
		panel.add(button);
		panel.add(label);
		button.addActionListener(this);
		
		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("the title of my first gui");
		frame.pack();
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		new MyFirstGui();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		count++;
		label.setText("number of clicks = " + count);
	}

}
