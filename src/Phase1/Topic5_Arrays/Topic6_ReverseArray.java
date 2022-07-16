package Phase1.Topic5_Arrays;

import java.util.Scanner;

public class Topic6_ReverseArray {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {1, 4, 0, 5, -2, 15};
        int[] brr = {2, 6, 3, 9, 4};

        reverse(arr, 6);
        reverse(brr, 5);

        printArray(arr, 6);
        printArray(brr, 5);


    }

    private static void printArray(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    private static void reverse(int[] arr, int size) {
        int start = 0;
        int end = size - 1;
        while (start <= end) {
            swap(arr, start, end);
            start++;
            end--;
        }

    }
}
