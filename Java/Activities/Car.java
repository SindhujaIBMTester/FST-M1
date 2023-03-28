package activities;

public class Car {
    String color,transmission;
    int make,tyres,doors;
    Car(){
        tyres = 4;
        doors = 4;
    }
    public void displayCharacteristics(){
        System.out.println(("The color of the car is:"+color));
        System.out.println(("The Transmission of the car is:"+transmission));
        System.out.println(("The Make of the car is:"+make));
        System.out.println(("The Number of tyres of the car is:"+tyres));
        System.out.println(("The Number of doors of the car is:"+doors));
    }
    public void accelerate(){
        System.out.println("Car is moving forward");
    }
    public void brake() {
        System.out.println("Car has stopped");
    }

}
