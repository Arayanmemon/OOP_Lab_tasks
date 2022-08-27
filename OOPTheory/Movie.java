 class Movie {
    private String name ; 
    private String release;
    private int year;
    private String duration;
    private Actor actor;
    private Genre genre;
    private Director director;
    private Cameraman cman;
    public void shoot(String n , String r , int y , String d , Actor a , Genre g , Director d ,Cameraman c){
        name = n;
        release = r;
        year  = y;
        duration = d;
        actor = a;
        director = d;
        cman = c;
        genre = g;
    }
    public void display(){
        System.out.println("Movie = " + name);
        System.out.println("Release = " + release);
        System.out.println("Year = " + year);
        System.out.println("Duration = " + duration);
        System.out.println("Actor = " + actor.name);
        System.out.println("Director = " + Director.name);
        System.out.println("Cameraman = " + cman.name);
        System.out.println("Genre = " + genre.type);




    }
    public void post_production(){

    }
    public void theatre_release(){

    }
    
}
class Actor{
    String name;
    Actor(String n){
        name = n;
    }
}
class Director{
    String name;
    Director(String n){
        name = n;
    }
}
class Cameraman{
    String name;
    Cameraman(String n){
        name = n;
    }
}
class Genre{
    String type;
    Genre(String n){
        type = n;
    }
}
public Main{
    public static void main(String[] args) {
        Movie m1 = new Movie();

        Actor a1 = new Actor("Leonardo");
        Director d1 = new Director("Chris");
        Genre g1 = new Genre("Action");
        Cameraman c1 = new Cameraman("Alan");
        m1.shoot("Aviator", "1st jan", 2004, "3 hours", a1, g1, d1, c1);
        
        Movie m2 = new Movie();

        Actor a2 = new Actor("Leonardo");
        Director d2 = new Director("Chris");
        Genre g2 = new Genre("Action");
        Cameraman c2 = new Cameraman("Alan");
        m2.shoot("Inception", "1st jan", 2010, "3 hours", a2, g2, d2, c2);
        
        Movie m3 = new Movie();

        Actor a3 = new Actor("Brad Pitt");
        Director d3 = new Director("Alan");
        Genre g3 = new Genre("Romance");
        Cameraman c3 = new Cameraman("Adam");
        m1.shoot("Se7en", "1st July", 1994, "3 hours", a3, g3, d3, c3);
        
    }
}