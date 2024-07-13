package Lesson19;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int [] arr = {78,24,53,74,12,};

        for (int i = 0; i < arr.length; i++) {
            int c =0;
            for (int j = 0; j < arr.length-1; j++) {
                if (arr[i] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=temp;
                    c=1;
                }
            }
            System.out.println(Arrays.toString(arr));
        }
    }
}
