import java.io.FileOutputStream;
import java.io.IOException;

public class filehandling1 {
    public static void main(String[] args) {
        String fileName = "example2.txt";
        String content = "Welcome to tata strive";

        try(FileOutputStream fos = new FileOutputStream(fileName)){
            byte[]bytes = content.getBytes();
            fos.write(bytes);
            System.out.println("Content has been written to the file");

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
