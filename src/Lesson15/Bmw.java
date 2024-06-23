package Lesson15;

public class Bmw extends Vehicle implements Drive{


    public Bmw(String model, String color, int age) {
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
        System.out.println("Bmw ездит");

    }

    @Override
    public void gasoline() {
        System.out.println("Тип топлива: Дизель");

    }

    @Override
    public void pickUpSpeed() {
        System.out.println("Скорость: 460км/ч");

    }
}
