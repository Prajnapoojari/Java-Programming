import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

class FileHandlingExample {

    public static void main(String[] args) {

        try {
            // Writing to file
            FileWriter writer = new FileWriter("sample.txt");
            writer.write("Welcome to Java File Handling\n");
            writer.write("This is an intermediate Java program");
            writer.close();

            // Reading from file
            FileReader reader = new FileReader("sample.txt");
            int ch;
            System.out.println("File Content:");

            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }
            reader.close();

        } catch (IOException e) {
            System.out.println("File error occurred");
        }
    }
}
