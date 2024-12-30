import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Readfile2 {
    public static void main(String[] args) {
        String fileName = "example.txt";

        try {
            List<String> lines = Files.readAllLines(Path.of(fileName));
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
