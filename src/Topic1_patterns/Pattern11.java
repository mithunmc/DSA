package Topic1_patterns;
/*
   j=  1 2 3
i = 1  A B C
i = 2  A B C
i = 3  A B C

 */

import java.util.Scanner;

public class Pattern11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int row = 1;
        while (row <= n) {
            int col = 1;
            while (col <= n) {
                System.out.print((char) ('A' + col - 1) + " ");
                col++;
            }
            System.out.println();
            row++;
        }
    }
}
