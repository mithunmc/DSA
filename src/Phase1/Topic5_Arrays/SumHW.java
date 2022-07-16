package Phase1.Topic5_Arrays;

import java.util.Scanner;

public class SumHW {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] arr = new int[100];
        for(int i = 0; i<size; i++){
            arr[i] = input.nextInt();
        }
        System.out.println("Sum is "+Sum(size, arr));
    }

    private static int Sum(int size, int[] arr) {
        int  sum = 0;
        for(int i = 0; i< size; i++){
            sum += arr[i];
        }
        return sum;
    }
}
