import java.io.RandomAccessFile;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        try {
            RandomAccessFile file = new RandomAccessFile("task3.txt", "rw");
            Scanner sc = new Scanner(System.in);
            String name = sc.nextLine();
            int roll = sc.nextInt(); 
            byte[] arr1 = name.getBytes();
            // byte[] arr2 = roll.getBytes();
            file.write(arr1);
            file.write(roll);
            System.out.println("File written successfully...");
            file.close();
            
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
