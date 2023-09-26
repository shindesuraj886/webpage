package Java_io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
	//. Write a program to read text from .txt file using InputStream
	
	import java.io.File;
	import java.io.FileInputStream;
	import java.io.InputStream;
public class ReaddataFromtxtf {
	
	
  public static void main(String[] args)
	    {
	        File file = new File("doc.txt");
	 
	        try (InputStream in = new FileInputStream(file))
	        {
	            int content;
	            while ((content = in.read()) != -1) {
	                System.out.print((char)content);
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	}

	

