import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteOnFile {
    public static void main(String[] args) throws IOException {
        File f = new File("Suranjan.txt");
        FileWriter fw = new FileWriter(f);
        fw.write("Suchayan Maity");
        fw.close();
    }
}
