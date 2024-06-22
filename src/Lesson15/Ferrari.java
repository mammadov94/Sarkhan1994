package Lesson15;

public class Ferrari  extends Vehicle implements Drive{


    public Ferrari(String model, String color, int age) {
        super(model, color, age);
    }

    @Override
    public void drive() {
        System.out.println("Ferrari ездит");

    }

    @Override
    public void gasoline() {
        System.out.println("Бензин");

    }

    @Override
    public void pickUpSpeed() {
        System.out.println("850км/ч");


    }
}
