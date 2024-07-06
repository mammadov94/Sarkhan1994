package Lesson17;


import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] test = {25, 15, 47, 23, 54};
        for (int i = 0; i < test.length; i++) {
            System.out.println("Введите любое число: ");
            int a = sc.nextInt();
            if (test[i] == a) {
                System.out.println("Введенное число есть в массиве: " + a);
                break;
            } else {
                System.out.println("Введиенное число отсутствует в массиве: " + a);
                break;
            }
        }
    }
}
