package Lesson15;

public class Audi extends Vehicle implements Drive {

    public Audi(String model, String color, int age) {
        super(model, color, age);
    }

    @Override
    public void drive() {
        System.out.println("Audi ездит");

    }

    @Override
    public void gasoline() {
        System.out.println("Электрический");

    }

    @Override
    public void pickUpSpeed() {
        System.out.println("560км/ч");

    }
}
