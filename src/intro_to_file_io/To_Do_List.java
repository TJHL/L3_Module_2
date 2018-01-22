package intro_to_file_io;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
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
	String b = "";
	String d = "";
	String e = "";
	String fn = "";
	String currentFile ="TodoList";
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
		d=JOptionPane.showInputDialog("Imput a task to remove")+"\n";
		String[] delete = b.split(d);
		b="";
		for (int i = 0; i < delete.length; i++) {
		b=b+delete[i];
		}
	
			System.out.println("Task removed");
		}
		if(e.getSource() == save) {
			System.out.println("Saved");
			try {
				FileWriter fw = new FileWriter("src/intro_to_file_io/"+currentFile+".txt",true);
				fw.write(b);
				fw.close();
			} catch (IOException f) {
				f.printStackTrace();
			}
		}
		if(e.getSource() == load) {
			fn=JOptionPane.showInputDialog("Input a file name to load\n(ex., to load 'src/intro_to_file_io/TodoList.txt', enter 'TodoList') ");
			
			currentFile=fn;
			System.out.println("Loaded");
	
				
		}
	}

}