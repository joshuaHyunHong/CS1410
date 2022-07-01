package lec12;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class AppListener extends JFrame implements ActionListener {
	private JButton sayHi;
	private JButton quit;
	
	public AppListener() {
		super("Simple Button Test");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		
		sayHi = new JButton("Say Hi!");
		sayHi.addActionListener(this);
		quit = new JButton("Quit");
		quit.addActionListener(this);
		
		panel.add(sayHi);
		panel.add(quit);
	
		this.add(panel);
		this.pack();
	}
	
	public static void main(String[] args) {
		AppListener app = new AppListener();
		app.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == sayHi)
			System.out.println("HI!");
		if (e.getSource() == quit) {
			System.out.println("Quitting");
			this.dispose();
			
		}
		
	}

}
