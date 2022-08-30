public class Task2 {
    public static void main(String[] args) {
        try {
            Integer a=null;
            throw new NullPointerException();
        } catch (NullPointerException e) {
            // System.out.println(e);
        }

        System.out.println("Rest of code");
    }
}
