package Lesson19;

import static java.util.Collections.swap;

import java.util.Scanner;

import static java.util.Collections.swap;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {12,5,74,16,52,75,25,37};
        SelectionSort(arr);

        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");

    }
    private static void SelectionSort(int[] arr){ //Это метот
        int n = arr.length; // в переменную "n" мы поставили длинну аррея, он щас 8
        for (int i = 0; i < n; i++){ // тут идет цикл for, смотрим i меньше "n" длинны аррея, идет до 8 и выходит из цикла
            int min = i; // i приравнилось 0, соответственно мы на "min" поставили i, то-есть 0, на втором цикле min будет равен 1 и так далее с каждым циклом подниматься будет
            for (int j = i +1; j < n; j++){ //тут еще цикл for, тут на j мы прибавили  кругом цикла 5, получается j равен 5
                if (arr[min] > arr[j]) { // тут проверяем arr[min] меньше arr[j], то-есть у нас min равен 0 индекс, а arr[j] равень 1 индексу, на втором круге min 1, а j 2 и так далее
                    min = j; // тут мы значение j которое равен 1, поставили на min, получается min равен 1
                }
            }
            swap(i, min, arr); // тут мы меняем местами переменные, тут i равен 0 индуксу, а min равен 1 индексу
        }
    }
    private static void swap(int i, int min, int[] arr){
        int temp = arr[i];
        arr[i] = arr[min];
        arr[min] = temp;



    }
}



