package org.genspark;

import org.springframework.beans.factory.annotation.Autowired;

public class Car implements Vehicle {
    public Tire getTire() {
        return tire;
    }

    public void setTire(Tire tire) {
        this.tire = tire;
    }

    @Autowired
    public Tire tire;
    public void drive() {
        System.out.println("I am driving a car...");
    }
}
