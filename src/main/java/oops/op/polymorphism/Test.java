package oops.op.polymorphism;

public class Test {
    public static void main(String[] args) {
        Vehicle myVehicle;
     //   Vehicle myVehicle2 =new Vehicle();
      //  myVehicle2.start();
        myVehicle = new Car(); // Upcasting to Vehicle
        myVehicle.start(); // Calls the overridden method in Car class

        myVehicle = new Bike(); // Upcasting to Vehicle
        myVehicle.start(); // Calls the overridden method in Bike class
    }
}
