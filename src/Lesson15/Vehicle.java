package Lesson15;

public abstract class Vehicle implements Drive{
    String model;
    String color;
    int age;

    void info(){

    }

    public Vehicle(String model, String color, int age) {
        this.model = model;
        this.color = color;
        this.age = age;

    }


}
