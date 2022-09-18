interface inter{
}

class parent implements inter{      // implements keyword is used to inherit from an interface
    parent(int a){
        System.out.println("parent class"+ a);
    }
}

class child extends parent{     // extends keyword is used to inherit from the parent class

    final int CONST;    // final keyword is used to declare the constant 
    {
        this.CONST = 5;    // this keyword is used to call the attribute of current class
    }
    child(int a){
        super(a);   //super keyword is used to call the parent class from sub class 
        System.out.println("Child class");
    }
}

public class Task3 {
    public static void main(String[] args) {
        
    }
}
