package Lesson15;

public class Ferrari  extends Vehicle implements Drive{


    public Ferrari(String model, String color, int age) {
        super(model, color, age);
    }

    @Override
    void info() {
        System.out.println("Модель: " +model);
        System.out.println("Цвет: " +color);
        System.out.println("Год выпуска: " +age);
    }

    @Override
    public void drive() {
        System.out.println("Ferrari ездит");

    }

    @Override
    public void gasoline() {
        System.out.println("Тип топлива: Бензин");

    }

    @Override
    public void pickUpSpeed() {
        System.out.println("Скорость: 850км/ч");


    }
}
