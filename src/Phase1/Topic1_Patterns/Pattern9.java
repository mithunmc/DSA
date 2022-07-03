package Phase1.Topic1_Patterns;

import java.util.Scanner;

/*
   j=  1 2 3 4
i = 1  1
i = 2  2 1
i = 3  3 2 1
i = 4  4 3 2 1

formula = i - j + 1
 */
public class Pattern9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int row = 1;
        while (row <= n) {
            int col = 1;
            while (col <= row) {
                System.out.print((row - col + 1) + " ");
                col++;
            }
            System.out.println();
            row++;
        }
    }

}
