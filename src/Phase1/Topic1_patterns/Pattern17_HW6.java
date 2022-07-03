package Phase1.Topic1_patterns;

import java.util.Scanner;

/*
   j=  1 2 3 4
i = 1        1
i = 2      2 3
i = 3    4 5 6
i = 4  7 8 9 10
 */
public class Pattern17_HW6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int row = 1;
        int count = 1;
        while (row<=n){
            int space = 1;
            while(space<= n - row){
                System.out.print(" ");
                space++;
            }
            int col = 1;
            while (col<=row){
                System.out.print(count);
                col++;
                count++;
            }
            System.out.println();
            row++;
        }

    }
}
