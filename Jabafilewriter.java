package javafilehandling;
import java.io.FileWriter;
import java.io.IOException;

public class Jabafilewriter {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileWriter writer = new FileWriter("poem.txt");
			writer.write("Ako lang toh andaming alam \nAko nalang kasi");
			writer.close();
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
} 
