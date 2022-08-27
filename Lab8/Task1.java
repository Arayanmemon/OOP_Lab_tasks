import java.io.IOException;
public class Task1 extends Exception{
    void zerodivide(int n){
        try {
            int a = n/0;
        } catch (Exception e) {
            System.out.println("divide by zero");
        }
    }
    public static void main(String[] args) {
        Task1 t = new Task1();
        t.zerodivide(5);
    }
}
