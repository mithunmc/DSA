package Topic1_patterns;

import java.util.Scanner;

/*
   j=  1 2 3 4
i = 1  D
i = 2  C D
i = 3  B C D
i = 4  A B C D

formula = 'A' + n - i + j - 1;
 */
public class Pattern16_HW {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int row = 1;
        while (row<=n){
            int col = 1;
            while(col<=row){
                System.out.print((char)('A' + n - row + col - 1) + " ");
                col++;
            }
            System.out.println();
            row++;
        }
    }
}