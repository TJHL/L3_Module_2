package intro_to_file_io;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class To_Do_List implements ActionListener{
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton add = new JButton("Add Task");
	JButton remove = new JButton("Remove Task");
	JButton save = new JButton("Save");
	JButton load = new JButton("Load");
	String b ="";
	
	public static void main(String[] args) {
		To_Do_List a = new To_Do_List();	


	}
	To_Do_List() {

	
	add.addActionListener(this);
	remove.addActionListener(this);
	save.addActionListener(this);
	load.addActionListener(this);
	
	frame.add(panel);
	panel.add(add);
	panel.add(remove);
	panel.add(save);
	panel.add(load);
	
	frame.pack();
	frame.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == add) {
			b = b+JOptionPane.showInputDialog("Add a task to the list")+"\n";
			System.out.println("Task added");
		}
		if(e.getSource() == remove) {
			JOptionPane.showInputDialog("Imput a task to remove");
			System.out.println("Task removed");
			
			
		}
		if(e.getSource() == save) {
			System.out.println("Saved");
			try {
				FileWriter fw = new FileWriter("src/intro_to_file_io/TodoList.txt", true);
				fw.write(b);
				fw.close();
			} catch (IOException f) {
				f.printStackTrace();
			}
		}
		if(e.getSource() == load) {
			System.out.println("Loaded");
			
		}
	
		
	}

}