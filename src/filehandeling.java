import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class filehandeling {
    public static void main(String[] args) {
        String fileName = "example.txt";
        File file = new File(fileName);
        try {
            if (file.createNewFile()) {
                System.out.println("File created successfully");
            } else {
                System.out.println("File already exists");
            }
            FileWriter writer = new FileWriter(file);
            writer.write("Welcome to tutorials point \n" );
            writer.write("Welcome to tutorials point \n" );
            writer.write("Welcome to tutorials point " );
            writer.close();
            System.out.println("Content written to file successfully");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
