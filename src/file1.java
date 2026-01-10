import java.io.FileOutputStream;
import java.io.IOException;

public class file1 {
    public static void main(String[] args) {
        String fileName = "Rajib.html";
        try (FileOutputStream fos = new FileOutputStream(fileName)) {
            System.out.println("File created Successfully");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
