package patterns;

import java.util.Scanner;

/*
   j=  1 2 3
i = 1  A A A
i = 2  B B B
i = 3  C C C
n = 3
 */
public class Pattern10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int row = 1;
        while (row <= n) {
            int col = 1;
            while (col <= n) {
                System.out.print((char) ('A' + row - 1) + " ");
                col++;
            }
            System.out.println();
            row++;
        }
    }
}
