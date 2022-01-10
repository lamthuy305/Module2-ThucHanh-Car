package com.codegym;

public class Main {

    public static void main(String[] args) {
	Car car1 = new Car("Mazda 3","Skyactiv 3");

        System.out.print(Car.numberOfCars + "\t");
        System.out.println(car1);

        Car car2 = new Car("Mazda 6","Skyactiv 6");

        System.out.print(Car.numberOfCars + "\t");
        System.out.println(car2);
    }
}
