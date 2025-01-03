import java.io.FileOutputStream;
import java.io.IOException;

public class filehandeling2 {
    public static void main(String[] args) {
        String fileName = "example3.txt";
        String content = "Welcomt to " + "\n"
                + " Tata Strive";
        try(FileOutputStream fos = new FileOutputStream(fileName)){
            byte[]bytes = content.getBytes();
            fos.write(bytes);
            System.out.println("Content has been written to the file");

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
