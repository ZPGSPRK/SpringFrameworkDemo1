package org.genspark;

public class Tire {
    public String brand;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int size;

    @Override
    public String toString() {
        return "Tire{" +
                "brand='" + brand + '\'' +
                ", size=" + size +
                '}';
    }

    public Tire(String brand, int size) {
        this.brand = brand;
        this.size = size;
    }
}
