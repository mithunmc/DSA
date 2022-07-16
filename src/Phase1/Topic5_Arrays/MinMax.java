package Phase1.Topic5_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();

        int[] num = new int[100];

        for (int i = 0; i < size; i++) {
            num[i] = input.nextInt();
        }

        int getMax = getMax(num, size);
        int getMin = getMin(num, size);

        System.out.println("Maximum value = " + getMax + " Minimum Value = " + getMin);

    }

    public static int getMin(int[] num, int size) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            max = Math.max(max,num[i]);
        }
        return max;
    }

    public static int getMax(int[] num, int size) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < size; i++) {
            min = Math.min(min, num[i]);
        }
        return min;
    }
}
