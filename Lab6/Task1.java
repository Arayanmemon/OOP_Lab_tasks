public class Task1 {
    public static void main(String[] args) {
       String[] name= new String[]{"Arayan","Memon","Fahad","Jawad"};
        for (int i = 0; i < name.length; i++) {
            if (name[i].equals(args[0])) {
                System.out.println("Position is "+i);
                break;
            }
            else if(i==3){
                System.out.println("value not found");
            }
       }    
    }
}
