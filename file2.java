import java.io.IOException;
import java.nio.file.Files;

import java.nio.file.Paths;


public class file2 {
    public static void main(String[] args) {
        String fileName = "Rajib.html";
        try {
            Files.write(Paths.get(fileName), "Rajib".getBytes());
            System.out.println("File Created Successfully");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
