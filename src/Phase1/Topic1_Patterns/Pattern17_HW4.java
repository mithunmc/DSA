package Phase1.Topic1_Patterns;

import java.util.Scanner;

/*
   j=  1 2 3 4
i = 1        1
i = 2      2 2
i = 3    3 3 3
i = 4  4 4 4 4
 */
public class Pattern17_HW4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int row = 1;
        while(row<=n){
            int space = 1;
            while (space<=(n-row)){
                System.out.print(" ");
                space++;
            }
            int col = 1;
            while (col<=row){
                System.out.print(row);
                col++;
            }
            row++;
            System.out.println();
        }
    }
}
