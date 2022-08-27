public class Task3 {
    public static void main(String[] args) {
        float a=0;
        for (int i = 0; i < args.length; i++) {
            a += Float.parseFloat(args[i]);
        }
    System.out.println("Sum of 5 runtime floating numbers : "+a);
    System.out.println("Average of 5 runtime floating numbers : "+a/5);
    }
}
