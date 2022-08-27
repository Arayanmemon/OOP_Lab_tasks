import java.util.ArrayList;
public class library {
    ArrayList <book> books; 
        library(ArrayList<book> books){
            this.books = books;
        }
        ArrayList<book> getBooks(){
            return books;
        }
    public static class book{
    String name;
    String author;

    book(String name,String author){
        this.name= name;
        this.author= author;
    }

    }
    public static void main(String[] args) {
        book b1 = new book("Wellness","Fahad");
        book b2 = new book("dxfcvhb","bnmc");
        book b3 = new book("dxfghjkml","zxcv");

        ArrayList<book> books = new ArrayList<book>();
        books.add(b1);
        books.add(b2);
        books.add(b3);

        library l1 = new library(books);


    }
}
