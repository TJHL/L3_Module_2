package intro_to_file_io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MessageDecoder {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new FileReader("src/intro_to_file_io/test3.txt"));
			
			String line = br.readLine();
			String file = "";
			while(line != null){
				file +=line;
				line = br.readLine();
				
			}
			
			br.close();
			String decrypted="";
			for (int i = 0; i < file.length(); i++) {
				decrypted +=(char)((file.charAt(i)/8)-6);
				
			}
			System.out.println(decrypted);
		} catch (FileNotFoundException e1) {
			
			e1.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
			
		}
		
	}
	}