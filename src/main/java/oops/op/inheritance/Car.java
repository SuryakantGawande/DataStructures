package oops.op.inheritance;

// Subclass
class Car extends Vehicle {
    // Additional attribute
    int numberOfSeats;

    // Constructor
    public Car(String brand, int year, int numberOfSeats) {
        // Call the superclass constructor
        super(brand, year);
        this.numberOfSeats = numberOfSeats;
    }

    // Method
    void displayCarDetails() {
        // Call the superclass method
        super.displayDetails();
        System.out.println("Number of Seats: " + numberOfSeats);
    }
}
