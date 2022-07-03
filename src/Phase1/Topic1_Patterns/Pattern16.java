package Phase1.Topic1_Patterns;

import java.util.Scanner;

/*
   j=  1 2 3 4
i = 1  D
i = 2  C D
i = 3  B C D
i = 4  A B C D

char st = 'A' + n - i;
     st++
 */
public class Pattern16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int row = 1;
        while (row<=n){
            int col = 1;
            char start = (char )('A' + n - row);
            while(col<=row){
                System.out.print((start) + " ");
                start++;
                col++;
            }
            System.out.println();
            row++;
        }
    }
}
