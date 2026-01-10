import java.io.FileInputStream;
import java.io.IOException;

public class Readfile1 {
    public static void main(String[] args) {
        String fileName = "example.txt";

        try (FileInputStream inputStream = new FileInputStream(fileName)) {
            int character;
            while ((character = inputStream.read()) != -1) {
                System.out.print((char) character);
            }
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
