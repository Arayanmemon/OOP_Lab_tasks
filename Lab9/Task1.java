
// Interface methods are by default abstract and public
// Interface attributes are by default public, static and final
class vehicle {
    private String color;
    private int weight;
    private String model;

    void accelerate(){}
    void decelerate(){}

    public void setColor(String color) {
        this.color = color;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getColor() {
        return color;
    }
    public int getWeight() {
        return weight;
    }
    public String getModel() {
        return model;
    }
}

class Bus extends vehicle{}
class Truck extends vehicle{}
class Car extends vehicle{}

class SchoolBus extends Bus{}
class HondaCar extends Car{}
class VigoTruck extends Truck{}

public class Task1{
    public static void main(String[] args) {
        
    }
}