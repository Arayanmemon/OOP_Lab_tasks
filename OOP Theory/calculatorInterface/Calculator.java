interface Main{
    void add(int a, int b);
    void sub(int a, int b);
    void mul(int a, int b);
    void div(int a, int b);
}

class Calculator implements Main{
    public void sqr(int a){}
    public void sqrt(int a){}
}

class Example{
    public static void main(String[] args) {
        Calculator c = new Calculator() {
            public void add(int a, int b){
                System.out.println(a+b);
            }
            public void sub(int a, int b){
                System.out.println(a-b);
            }
            public void mul(int a, int b){
                System.out.println(a*b);
            }
            public void div(int a, int b){
                System.out.println(a/b);
            }
            public void sqr(int a){
                System.out.println(a*a);
            }
            public void sqrt(int a){
                System.out.println(Math.sqrt(a));
            }
        };
        c.add(5,7);
        c.sub(5,7);
        c.mul(5,7);
        c.div(5,7);
        c.sqr(5);
        c.sqrt(5);
    }
}