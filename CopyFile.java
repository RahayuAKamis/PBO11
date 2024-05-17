import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

public class CopyFile {
    public static void main(String[] args) {
        String sourceFile = "C:\\Users\\komputer 10\\Documents\\ATI22A\\B\\A.txt";
        String destinationFile = "C:\\Users\\komputer 10\\Documents\\ATI22A\\B\\B.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(destinationFile))) {
            try (BufferedReader br = new BufferedReader(new FileReader(sourceFile))) {
                String line;
                while ((line = br.readLine()) != null) {
                    bw.write(line);
                    bw.newLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}