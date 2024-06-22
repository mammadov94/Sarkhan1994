package Lesson15;

public class Bmw extends Vehicle implements Drive{


    public Bmw(String model, String color, int age) {
        super(model, color, age);
    }

    @Override
    public void drive() {
        System.out.println("Bmw ездит");

    }

    @Override
    public void gasoline() {
        System.out.println("Дизельный");

    }

    @Override
    public void pickUpSpeed() {
        System.out.println("460км/ч");


    }
}
