import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopingDataFromOneFileToAnother {
    public static void main(String[] args) throws IOException {
        File input = new File("Input.txt");
        File output = new File("Output.txt");
        
        FileReader fr = new FileReader(input);
        FileWriter fw = new FileWriter(output);
        
        int ch;
        while((ch = fr.read()) != -1) { 
            fw.write(ch);
        }
        fr.close();
        fw.close();
    }
}
