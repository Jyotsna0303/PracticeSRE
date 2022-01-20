import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadWrite{
    public static void main(String args[]) throws IOException{
        String file= "C:\\Users\\user\\projects\\PracticeSRE\\InputFile.txt";
        readFromFile(file);
        writeToFile(file);
        readFromFile(file);
        writeAndCreateAfile();
        
    }

    public static void readFromFile(String filePath) throws IOException{
        BufferedReader reader= new BufferedReader(new FileReader(filePath));
       // System.out.println(reader.readLine());
       String currentLine= reader.readLine();
        while(currentLine!=null){
            System.out.println(currentLine);
            currentLine=reader.readLine();
        } 
        reader.close();
    }

    public static void writeToFile(String filePath) throws IOException{
        BufferedWriter writer=new BufferedWriter(new FileWriter(filePath));
        writer.write("Hey This is new entry"); //this will replace the existing content.
        writer.newLine();
        writer.append("Hey I shouldnt replace the existing content.");
        writer.close();
    }

    public static void writeAndCreateAfile() throws IOException{
       File file= new File("C:\\Users\\user\\projects\\PracticeSRE\\NewFile.txt"); 
        boolean ifFileAlreadyExists=file.createNewFile() ;//this method returns false if file already exists and returns true if file got created 
        
}
}

// resource: https://www.baeldung.com/reading-file-in-java