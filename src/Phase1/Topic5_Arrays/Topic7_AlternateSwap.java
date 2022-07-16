package Phase1.Topic5_Arrays;

import java.util.Scanner;

/*
input = 1 2 3 4 5 6 7 8 9
output = 2 1 4 3 6 5 8 7 9
 */
public class Topic7_AlternateSwap {
    public static void main(String[] args) {
        int[] arr = {5,2,9,4,7,6,1,0};
        int[] brr = {11,33,9,76,43};

        swapAlternate(arr,8);
        printArray(arr,8);

        swapAlternate(brr,5);
        printArray(brr,5);

    }

    private static void printArray(int[] arr, int size) {
        for(int i = 0; i<size; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    private static void swapAlternate(int[] arr, int size) {
        for(int i = 0; i<size; i = i+2){
            if(i+1<size){
                swap(arr,i,i+1);
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


}
