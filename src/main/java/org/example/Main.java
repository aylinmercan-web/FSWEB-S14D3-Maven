package org.example;

import org.example.arge.*;

public class Main {
    public static void main(String[] args) {
        CarSkeleton gas = new GasPoweredCar("Corolla", "Gas car", 15.5, 4);
        CarSkeleton electric = new ElectricCar("Model 3", "Electric car", 450, 75);
        CarSkeleton hybrid = new HybridCar("Prius", "Hybrid car", 25.0, 8, 4);

        CarSkeleton[] cars = {gas, electric, hybrid};

        for (CarSkeleton car : cars) {
            car.startEngine();
            car.drive();
            System.out.println();
        }
    }
}
//done