package Phase1.Topic1_patterns;

import java.util.Scanner;

/*
   j=  1 2 3 4
i = 1  1 2 3 4
i = 2    2 3 4
i = 3      3 4
i = 4        4
 */
public class Pattern17_HW5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int row = 1;
        while(row<=n){
            int space = 1;
            while(space<=row - 1){
                System.out.print(" ");
                space++;
            }
            int col = row;
            while (col<=n){
                System.out.print(col);
                col++;
            }
            System.out.println();
            row++;
        }
    }
}
