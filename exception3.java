//import java.io.File;
//import java.io.FileReader;
//import java.io.IOException;
//
//public class exception3 {
//    public static void main(String[] args) {
//        File file = new File("E://file.txt");
//        FileReader fr = null;
//        try {
//            fr = new FileReader(file);
//            System.out.println("File opened successfully.");
//        } catch (IOException e) {
//            System.out.println("An error occurred: " + e.getMessage());
//        }
//    }
//}

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class exception3 {
    public static void main(String[] args) throws IOException {
        File file = new File("E://file.txt");
        FileReader fr = null;

        fr = new FileReader(file);
        System.out.println("File opened successfully.");

        if (fr != null) {
            fr.close();
        }
    }
}

