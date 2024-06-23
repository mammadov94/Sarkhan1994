package Lesson15;

public class Audi extends Vehicle implements Drive {

    public Audi(String model, String color, int age) {
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
        System.out.println("Audi ездит");

    }

    @Override
    public void gasoline() {
        System.out.println("Тип топлива: Гибрид");

    }

    @Override
    public void pickUpSpeed() {
        System.out.println("Скорость: 560км/ч");


    }
}
