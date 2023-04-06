package org.genspark;

public class Bike implements Vehicle {
    public Tire tire;

    public Bike(Tire tire) {
        this.tire = tire;
    }
    public void drive() {
        System.out.println("I am riding a bike...");
    }
}
