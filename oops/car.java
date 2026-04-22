package oops;

public class car {
    //instance variables
    int noOfWheels;
    string color;
    float maxSpeed;
    float currentFuelInLiters;
    int noOfSeats;

    //instance methods
    public void drive(){
        System.out.println("Car is driving" );
        currentFuelInLiters--;
    }
    public void addFuel(float fuel){
        currentFuelInLiters = currentFuelInLiters + fuel;
    }
    public float getCurrentFuelLevel(){
        return currentFuelInLiters;
    }
}
