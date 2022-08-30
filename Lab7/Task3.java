import java.util.Scanner;
public class Task3 extends Exception{
    Task3(String pass){
        if(pass.length()>8){
            System.out.println("Password should be less than 8 characters");
        }if(pass.contains("!")){
          System.out.println("password should no cantain !");
        }
    }
    public static void main(String[] args){
        try {
            Scanner sc= new Scanner(System.in);
            String p = sc.nextLine();
            throw new Task3(p);
        } catch (Exception e) {
        }
    }
}
