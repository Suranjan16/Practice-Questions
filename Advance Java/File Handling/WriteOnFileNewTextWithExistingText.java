import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteOnFileNewTextWithExistingText {
    public static void main(String[] args) throws IOException {
        File f = new File("Sample.txt");
        FileWriter fw = new FileWriter(f, true);
        fw.write("\nSuchayan Maity");
        fw.close();
    }
}
