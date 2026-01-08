import java.io.File;
import java.io.IOException;

public class file {
    public static void main(String[] args) throws IOException {
        String fileName = "Rajib.html";
        File file = new File(fileName);
        if (file.createNewFile()){
            System.out.println("File created Successfully");
        }
        else{
            System.out.println("File exist failed tp create");
        }
    }
}
