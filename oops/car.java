class Car {
    String color;   // state
    int speed;      // state

    void drive() {  // behavior
        System.out.println("Car is moving");
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car(); // object creation

        myCar.color = "Red";
        myCar.speed = 100;

        myCar.drive();
    }
}