package intro_to_file_io;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class To_Do_List implements ActionListener{
	public static void main(String[] args) {
		To_Do_List a = new To_Do_List();
		
	}
	To_Do_List() {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton add = new JButton("Add Task");
	JButton remove = new JButton("Remove Task");
	JButton save = new JButton("Save");
	JButton load = new JButton("Load");
	
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
	
		
	}

}
