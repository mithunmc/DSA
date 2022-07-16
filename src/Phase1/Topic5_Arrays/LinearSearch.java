package Phase1.Topic5_Arrays;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arr[] = {5, 7, -2, 10, 22, -2, 0, 5, 22, 1};
        System.out.println("Enter Key to Search");
        int key = input.nextInt();
        boolean found = search(arr, 10, key);
        if (found) {
            System.out.println("key is present in the array");
        } else {
            System.out.println("key is not present in the array");
        }
    }

    private static boolean search(int[] arr, int i, int key) {
        for (int j = 0; j < i; j++) {
            if (arr[j] == key) {
                return true;
            }
        }
        return false;
    }
}
