package com.app.process;

import java.io.*;
import java.util.Scanner;
public class FileReadOperations {

	
	
	public FileReadOperations(){
		
	}
    public static void main(String[] args)  {
        // Create and write a sample file
    	//Scanner sc = new Scanner(System.in);
    	
    	try {
    		
    		FileReadOperations obj = new FileReadOperations();
        //	obj.fileprocess();
        File file = new File("C:/trainingdocs/NewTraining/userdettails.txt");
        FileWriter writer = new FileWriter(file,true) ;
            writer.write("Hello Java\nThis is a Scanner example");
            
            writer.flush();
            
            File f = new File("C:/trainingdocs/NewTraining/userdettails.txt");
          //  File file = new File("C:\\trainingdocs\\NewTraining\\userdettails.txt");
            System.out.println(f.getAbsolutePath());
            System.out.println("Exists: " + f.exists());
        Scanner sc = new Scanner(f);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
            
    	}catch(Exception ex) {
    		ex.printStackTrace();
    	}
    	
    	
        }
    

    public  void fileprocess() throws IOException {
        // Create a file and write content
        try (FileWriter writer = new FileWriter("fileReader.txt",true)) {
            writer.write("Learning FileReader and FileWriter in Java");
        }

        // Read using FileReader
        try (FileReader reader = new FileReader("fileReader.txt")) {
        
   //     try (FileReader reader = new FileReader("C:\\trainingdocs\\NewTraining\\userdettails.txt")) {
            int ch;
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }
        }
    }

    public void readFile(String filePath) throws FileNotFoundException, IOException 
    {
    	 try (FileReader reader = new FileReader(filePath)) {
    	        
    		   //     try (FileReader reader = new FileReader("C:\\trainingdocs\\NewTraining\\userdettails.txt")) {
    		            int ch;
    		            while ((ch = reader.read()) != -1) {
    		                System.out.print((char) ch);
    		            }
    		        }
    	
    }
  
    public void writeFilewithAppend(String filepath) {
    	
	try {
    		
    		  File file = new File(filepath);
        FileWriter writer = new FileWriter(file,true) ;
            writer.write("Hello Java\nThis is a Scanner example");
            
            writer.flush();
	}catch(Exception ex) {
		
		ex.printStackTrace();
	}
	
	
    }
    
    public void writeFileOverride(String filepath) {
    	
    	try {
        		
        		  File file = new File(filepath);
            FileWriter writer = new FileWriter(file) ;
                writer.write("Hello Java\nThis is a Scanner example");
                
                writer.flush();
    	}catch(Exception ex) {
    		
    		ex.printStackTrace();
    	}
    	
    	
        }
}
