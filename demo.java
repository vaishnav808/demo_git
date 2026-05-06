


abstract  class Vehicle{
    private String brand;
    private String model;

    public Vehicle(String brand, String model) {
        this.brand = brand;  // encapsulation: using private fields and public constructor
        this.model = model;
    }

    public String getDetails (){
        return "Brand: " + brand + ", Model: " + model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public abstract void start(); // abstraction: defining an abstract method

}


class Car extends Vehicle {
    public Car(String brand, String model) {
        super(brand, model); // inheritance: using the constructor of the parent class
    }

    @Override
    public void start() { // polymorphism: providing a specific implementation of the abstract method
        System.out.println("The car is starting.");
    }
}


class Motorcycle extends Vehicle {
    public Motorcycle(String brand, String model) {
        super(brand, model); // inheritance: using the constructor of the parent class
    }

    @Override
    public void start() { // polymorphism: providing a specific implementation of the abstract method
        System.out.println("The motorcycle is starting.");
    }
}


public class demo {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry");
        Motorcycle motorcycle = new Motorcycle("Honda", "CBR500R");

        System.out.println(car.getDetails());
        car.start();

        System.out.println(motorcycle.getDetails());
        motorcycle.start();
    }
}