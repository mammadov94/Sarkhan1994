package Lesson19;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {54, 25, 94, 45, 67, 87};
        bubbleSort(arr);

    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n -i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
            System.out.print(arr[i] + " ");
        }
    }
}