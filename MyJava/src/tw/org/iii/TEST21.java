package tw.org.iii;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TEST21 extends JFrame{
	private JButton open,save,exit;
	private MyPainer myPainer;
	TEST21(){
		super("µøµ¡«°¥«");
		setLayout(new BorderLayout());
		open = new JButton("Open");
		save = new JButton("Save");
		exit = new JButton("Exit");
		myPainer = new MyPainer();
		
		
		JPanel top = new JPanel(new FlowLayout());
		top.add(open);top.add(save);top.add(exit);
		
		add(top, BorderLayout.NORTH);
		add(myPainer, BorderLayout.CENTER);
		
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	public static void main(String[] args) {
		new TEST21();

	}

}
