package ch3;
//keyword new requests memory from the system to store an object, then calls the corresponding
//class’s constructor to initialize the object

public class CarTest {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota");

        System.out.println("Model of my car is: " + myCar.model);
    }
}

class Car {
    String model;

    Car(String carModel) {
        model = carModel;
        System.out.println("Car constructor called for: " + model);
    }
}

