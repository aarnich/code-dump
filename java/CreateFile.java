import java.io.File; // Import the File class
import java.io.IOException; // Import the IOException class to handle errors
import java.util.HashMap;
import java.io.FileWriter;
import java.io.PrintStream;

public class CreateFile {
    public void NewFile(String FileName) {
        try {
            File myObj = new File(FileName + ".txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public void WriteToFile(Long BachNum, String FileName, HashMap<Long, Long> BachPairs) {
        try {
            String File = FileName + ".txt";
            PrintStream fileStream = new PrintStream(File);
            fileStream.println("All Prime number pairs for Goldbach Integer " + BachNum);
            for (Long keys : BachPairs.keySet()) {
                fileStream.println(keys + ":" + BachPairs.get(keys));
            }
            fileStream.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}