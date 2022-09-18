import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Task2{
    public static void main(String[] args) {
        
        // Writting in File using Buffred writter
        try {
            FileWriter fw = new FileWriter("./file.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("I am being read from file");
            bw.close();
            System.out.println("File written succsesfully..");

        } catch (Exception e) {
        }
        
        // Reading from File using Buffred reader
        try {
            FileReader fr = new FileReader("file.txt");
            BufferedReader br = new BufferedReader(fr);
            System.out.println(br.readLine());

        } catch (Exception e) {
        }

    }
}