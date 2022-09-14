interface Main{
    void add();
    void sub();
    void mul();
    void div();
}

public class Calculator implements Main{
    public void add(){
        System.out.println("Add");
    }
    public void sub(){
        System.out.println("Subtract");
    }
    public void mul(){
        System.out.println("Multiply");
    }
    public void div(){
        System.out.println("Divide");
    }
    public void sqr(){
        System.out.println("Square");
    }
    public void sqrt(){
        System.out.println("Square root");
    }



    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.add();
        c.sub();
        c.sqr();
        c.sqrt();
    }
}