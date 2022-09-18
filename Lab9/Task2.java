class Mother{
    void display(){
        System.out.println("Display from mother");
    }
}

class Daughter extends Mother{
    void display(){
        System.out.println("Display from daughter");
    }
}

public class Task2 {
    public static void main(String[] args) {
        Daughter d = new Daughter();
        d.display();
    }
}
