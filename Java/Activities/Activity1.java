package activities;

public class Activity1 extends Car{
    public static void main(String[] args) {
        Car carObj = new Car();
        carObj.make = 2014;
        carObj.color = "Black";
        carObj.transmission = "Manual";

        carObj.displayCharacteristics();
        carObj.accelerate();
        carObj.brake();

    }

}
