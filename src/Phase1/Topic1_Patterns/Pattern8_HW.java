package Phase1.Topic1_Patterns;

import java.util.Scanner;

/*
   j=  1 2 3 4
i = 1  1
i = 2  2 3
i = 3  3 4 5
i = 4  4 5 6 7
 */
public class Pattern8_HW {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= i) {
                System.out.print((j + i - 1) + " ");
                j++;

            }
            System.out.println();
            i++;
        }
    }
}
