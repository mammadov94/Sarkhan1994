package Lesson19;

import java.util.Arrays;

public class ReverseNumber {
    public static void main(String[] args) {
      int[] arr = {25,20,15,10,5};
        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void reverse (int[] arr){
        int left = 0;
        int right = arr.length-1;

        while(left < right){
            int rever = arr[left];
            arr[left] = arr[right];
            arr[right] = rever;

            left++;
            right--;
        }
    }
}