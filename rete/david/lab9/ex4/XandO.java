package rete.david.lab9.ex4;

import java.awt.*;
import javax.swing.*;

//x and 0 no rule implementation

public class XandO extends JFrame{
    XandO() {
        setSize(500, 500);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(new GridLayout(3, 3, 5, 5));

        JTextField t1 = new JTextField();
        JTextField t2 = new JTextField();
        JTextField t3 = new JTextField();
        JTextField t4 = new JTextField();
        JTextField t5 = new JTextField();
        JTextField t6 = new JTextField();
        JTextField t7 = new JTextField();
        JTextField t8 = new JTextField();
        JTextField t9 = new JTextField();

        t1.setVisible(true);
        t2.setVisible(true);
        t3.setVisible(true);
        t4.setVisible(true);
        t5.setVisible(true);
        t6.setVisible(true);
        t7.setVisible(true);
        t8.setVisible(true);
        t9.setVisible(true);

        t1.setBounds(5, 5, 50, 50);
        t2.setBounds(55, 5, 50, 50);
        t3.setBounds(110, 5, 50, 50);
        t4.setBounds(5, 55, 50, 50);
        t5.setBounds(55, 55, 50, 50);
        t6.setBounds(110, 55, 50, 50);
        t7.setBounds(5, 110, 50, 50);
        t8.setBounds(55, 110, 50, 50);
        t9.setBounds(110, 110, 50, 50);

        add(t1);
        add(t2);
        add(t3);
        add(t4);
        add(t5);
        add(t6);
        add(t7);
        add(t8);
        add(t9);

        setVisible(true);
    }

    public static void main(String[] args) {
        XandO a = new XandO();
    }
}
