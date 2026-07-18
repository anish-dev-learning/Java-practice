package oops;

public class Driver {
    public static void main(String[] args) {
        Car myCar = new Car(); //constructur creation
        myCar.drive();
        System.out.println(myCar.getCurrentFuelLevel());        
    }

}
