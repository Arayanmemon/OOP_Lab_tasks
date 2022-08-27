
class clock{
    int hours,minutes,seconds;

    void setHour(int h){
        this.hours=h;
    }
    void setMinute(int m){
        this.minutes= m;
    }
    void setSecond(int s){
        this.seconds=s;
    }
    int getHour(){
        return hours;
    }
    int getMinute(){
        return minutes;
    }
    int getSecond(){
        return seconds;
    }

    int convertToSeconds(float hours,float minutes){
        int a = (int)hours*60 + (int)minutes;
        return a*60;
    }
    float convertToHour(float minutes,int seconds){
        float m = seconds/60 + minutes;
        return m/60;
    }
}
public class Main{
public static void main(String[] args) {
        clock c1 = new clock();
        int a = c1.convertToSeconds(3, 50);
        System.out.println(a+" seconds");
        float b = c1.convertToHour(0, a);
        System.out.println(b+" hours");
    }
}