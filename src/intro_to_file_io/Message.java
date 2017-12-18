package intro_to_file_io;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Message {
	String Written;
	
	public static void main(String[] args) {
		Message a = new Message();
	}
	Message(){
		JPanel panel = new JPanel();	
		JFrame frame = new JFrame();
		Written=JOptionPane.showInputDialog(panel,"Input a message to do thinginhys.");
		
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);

		try {
			FileWriter fw = new FileWriter("src/intro_to_file_io/test3.txt");
			
			/*
			NOTE: To append to a file that already exists, add true as a second parameter when calling the
			      FileWriter constructor.
			      (e.g. FileWriter fw = new FileWriter("src/intro_to_file_io/test2.txt", true);)
			*/
			String encrypted ="";
			for(int i =0; i<Written.length();i++) {
				encrypted+=(char)((Written.charAt(i)+6)*(8));
			}
			
			//DONT USE PARABOLAS OR POLYNOMIALS IN ENCODING
			
			fw.write(encrypted);
				
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
			
			
		}
	}
	
}