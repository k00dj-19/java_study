package study;
import java.io.IOException;

class Car{
    private String modelName;
    private int modelYear;
    private String color;
    private int maxSpeed;
    private int currentSpeed;
    static int classVar = 10;         // 클래스 변수의 명시적 초기화

    int instanceVar = 10;             // 인스턴스 변수의 명시적 초기화
    static { classVar = 20; }   
    Car() { instanceVar = 30; }// 클래스 초기화 블록을 이용한 초기화
    { instanceVar = 20; }             // 인스턴스 초기화 블록을 이용한 초기화
 // 생성자를 이용한 초기화
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
        Car car2 = new Car();
        System.out.println(car2.instanceVar);
    }
}
