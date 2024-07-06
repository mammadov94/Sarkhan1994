package Lesson18;


public class Main {
    public static void main(String[] args) {
        //      Season season = Season.SUMMER;
        //      switch (season) {
        //          case AUTUMN:
        //               System.out.println("Время года Осень");
        //              break;
        //          case SPRING:
        //              System.out.println("Время года Весна");
        //             break;
        //         case SUMMER:
        //              System.out.println("Время года Лето");
        //             break;
        //          case WINTER:
        //              System.out.println("Время года Зима");
        //              break;
        //          default:
        //             System.out.println("Такого времени года нету");


        //    Season season = Season.valueOf("WINTER");
        //  System.out.println(season.getTemperature());

        Season winter = Season.WINTER;
        System.out.println(winter.ordinal());

    }
}