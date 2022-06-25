package Topic1_patterns;

import java.util.Scanner;
/*
   j=  1 2 3 4
i = 1        *
i = 2      * *
i = 3    * * *
i = 4  * * * *


 */
public class Pattern17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int row = 1;
        while (row<=n){
            int space = n - row;
            while(space!=0){
                System.out.print(" ");
                space--;
            }
            int col = 1;
            while(col<=row){
                System.out.print('*');
                col++;
            }
            System.out.println();
            row++;


        }
    }
}
