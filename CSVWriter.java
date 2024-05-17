import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;

public class CSVWriter {
    public static void main(String[] args) {
        String csvFile = "C:\\Users\\komputer 10\\Documents\\ATI22A\\A\\new_students.csv";
        String[] data = {
            "4, david, 23",
            "5,Eva,22",
            "6,Ferdi,21"
        };
        
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(csvFile))){
            for(String line : data){
                bw.write(line);
                bw.newLine();
            }

            Scanner scanner = new Scanner(System.in);
            System.out.println("Masukkan data baru (format: NIM, NAMA, UMUR):");
            String newData = scanner.nextLine();

            // Memisahkan data yang dimasukkan oleh pengguna
            String[] newDataArray = newData.split(",");

            // Menambahkan data baru ke array data
            data = Arrays.copyOf(data, data.length + 1);
            data[data.length - 1] = newDataArray[0].trim() + "," + newDataArray[1].trim() + "," + newDataArray[2].trim();

            // Menulis data ke file CSV
            for (String line : data) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}