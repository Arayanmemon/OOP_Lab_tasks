import java.util.Scanner;
import java.io.IOException;
public class Task2 extends Exception{
    public Task2(int x){
        if (x<18) {
            System.out.println("Age is less than 18");
        } else {
            System.out.println("processing....");
        }
    }
    public static void main(String[] args) {
        try{
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        throw new Task2(age);  
        }
        catch(Task2 e){

        }   
}
}
