import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSVReader {
    public static void main(String[] args) {
        String csvFile = "C:\\Users\\komputer 10\\Documents\\ATI22A\\students.csv";
        String line;
        String csvSplitBy = ",";
        int indeks = 0;
        int totalRows = 0; // Menambah variabel totalRows untuk menghitung jumlah baris

        System.out.println("NIM, NAMA, UMUR, PRODI");
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))){
            while ((line = br.readLine()) !=null){
                indeks++;
                if(indeks>1){
                    String[] student = line.split(csvSplitBy);
                    System.out.println(student[0] + "," + student[1]+","+student[2]+","+student[3]+",");
                }
                totalRows++; // Menghitung jumlah baris setiap kali membaca baris
            }
            System.out.println("Jumlah total baris dalam file " + csvFile + " adalah: " + totalRows); // Menampilkan jumlah total baris
        }catch (IOException e){
            e.printStackTrace();
        }
            
    }
}