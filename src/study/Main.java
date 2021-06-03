package study;
import java.io.IOException;

class Car{
    private String modelName;
    private int modelYear;
    private String color;
    private int maxSpeed;
    private int currentSpeed;
    
    Car(String modelName, int modelYear, String color, int maxSpeed){
        this.modelName = modelName;
        this.modelYear = modelYear;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.currentSpeed = 0;
    }
    
    public String getModel(){
        return this.modelYear + "년식 " + this.modelName + " " + this.color;
    }
}

public class Main {
    public static void main(String[] args){
        Car myCar = new Car("아반떼",2017, "흰색", 200);
        System.out.println(myCar.getModel());
    }
}
