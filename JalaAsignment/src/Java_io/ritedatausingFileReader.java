package Java_io;

import java.io.FileWriter;

public class ritedatausingFileReader{
	public static void main(String args[]) {
//rite data using FileReader
	     String data = "This is the data in the output file";
	     try {
	       // Creates a Writer using FileWriter
	       FileWriter output = new FileWriter("output.txt");

	       // Writes string to the file
	       output.write(data);
	       System.out.println("Data is written to the file.");

	       // Closes the writer
	       output.close();
	     }
	     catch (Exception e) {
	       e.getStackTrace();
	     }
	  }

}
