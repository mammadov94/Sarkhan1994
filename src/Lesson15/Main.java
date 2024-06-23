package Lesson15;


public class Main {
    public static void main(String[] args) {
        Vehicle bmw = new Bmw("X6", "Black", 2024);
        bmw.info();
        bmw.drive();
        bmw.gasoline();
        bmw.pickUpSpeed();

        System.out.println("");

        Vehicle ferrari = new Ferrari("F4","Grey", 2018);
        ferrari.info();
        ferrari.drive();
        ferrari.gasoline();
        ferrari.pickUpSpeed();

        System.out.println("");

        Vehicle audi = new Audi("Q7", "Red", 2019);
        audi.info();
        audi.drive();
        audi.gasoline();
        audi.pickUpSpeed();






    }
}
