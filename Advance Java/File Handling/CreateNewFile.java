import java.io.File;
import java.io.IOException;

public class CreateNewFile {

    public static void main(String[] args) throws IOException {
        File f = new File("Sample.java");
        if (f.exists() == true) {
            System.out.println("File is present");
        } else {
            System.out.println("File not present");
            f.createNewFile();
        }
    }
}