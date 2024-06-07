import java.io.*;

public class P8 {
    public static void main(String[] args) {
        // Name of the current file
        String sourceFileName = "SelfCopy.java";
        
        // Name of the destination file
        String destinationFileName = "code.txt";
        
        // Read the content of the source file
        try (BufferedReader reader = new BufferedReader(new FileReader(sourceFileName));
             BufferedWriter writer = new BufferedWriter(new FileWriter(destinationFileName))) {
            
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
            
            System.out.println("File copied successfully!");
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
