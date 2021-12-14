package com.company;
class Vehicle{
    int wheels;
    int headlight;
    String color;
    //creating a constructor
    Vehicle(int wheels){
        this.wheels=wheels;
        headlight=78;
    }
    Vehicle(int num_w, String color){
        wheels=num_w;
        this.color=color;
    }

}
public class constructor {

    public static void main(String[] args) {
        Vehicle car = new Vehicle(4);
        Vehicle bike = new Vehicle(2);
       // Vehicle light = new Vehicle();

        System.out.println(car.wheels);
        System.out.println(bike.wheels);
       // System.out.println(light.headlight);


        Vehicle erikhsaw = new Vehicle(44,"yellow");
        System.out.println(erikhsaw.wheels + erikhsaw.color);


    }
}
