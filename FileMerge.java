import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;


public class FileMerge {
    public static void main(String[] args) {
        String[] files = {"C:\\Users\\komputer 10\\Documents\\ATI22A\\B\\File1.txt", "C:\\Users\\komputer 10\\Documents\\ATI22A\\B\\File2.txt"};
        String mergeFile = "C:\\Users\\komputer 10\\Documents\\ATI22A\\B\\merge.txt";
        
        try(BufferedWriter bw = new BufferedWriter (new FileWriter(mergeFile))){
            for (String file : files){
                try (BufferedReader br = new BufferedReader(new FileReader (file))){
                    String line;
                    while((line = br.readLine()) !=null){
                        bw.write(line);
                        bw.newLine();
                    }
                }catch(IOException e){
                    e.printStackTrace();
                }
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
