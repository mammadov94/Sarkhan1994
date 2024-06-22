package Lesson15;


public class Main {
    public static void main(String[] args) {
        Bmw bmw = new Bmw("X6","Black",2024);
        System.out.println(bmw.model);
        bmw.drive();
        bmw.gasoline();
        bmw.pickUpSpeed();
        System.out.println();

        Ferrari ferrari = new Ferrari("F5","Blue",2022);
        System.out.println(ferrari.model);
        ferrari.drive();
        ferrari.gasoline();
        ferrari.pickUpSpeed();

        System.out.println();

        Audi audi = new Audi("Q7","Red", 2023);
        System.out.println(audi.model);
        audi.drive();
        audi.gasoline();
        audi.pickUpSpeed();
    }
}
