import java.util.Scanner;
public class Task1 extends Exception{
    public Task1(int i){
        if (i<0) {
            System.out.println("Negative value");
        }
    }
    public static void main(String[] args) {
        try{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer value: ");
        int a = sc.nextInt();
        throw new Task1(a);
        }catch(Exception e){}
        
    }
}
