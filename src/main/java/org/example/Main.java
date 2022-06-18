package org.example;

public class Main {
    public static void main(String[] args) {

        // toString() = special method that all objects inherit,
        //    that returns a string that "textually represents" an object.
        //    can be used both implicitly and explicitly

        Car car = new Car();
        System.out.println(car.make);
        System.out.println(car.color);
        System.out.println(car.model);
        System.out.println(car.year);

        System.out.println(car);
        System.out.println(car.toString());

        System.out.println("---------------------");
        //overriding toString method to print wat we want instead of object address in memory  -> see CarMod object
        CarMod car2 = new CarMod();
        System.out.println(car2);



    }
}