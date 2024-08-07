package oops.op.inheritance;
// Superclass
class Vehicle {
    // Attributes
    String brand;
    int year;

    // Constructor
    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    // Method
    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
    }
}
