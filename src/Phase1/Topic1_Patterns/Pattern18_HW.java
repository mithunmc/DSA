package Phase1.Topic1_Patterns;

import java.util.Scanner;

/*
j =   1 2 3 4 5 6 7 8 9 10
i = 1 1 2 3 4 5 5 4 3 2 1
i = 2 1 2 3 4 * * 4 3 2 1
i = 3 1 2 3 * * * * 3 2 1
i = 4 1 2 * * * * * * 2 1
i = 5 1 * * * * * * * * 1
 */
public class Pattern18_HW {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int row = 1;
        while(row<=n){
            int col = 1;
            // to print the first part
            while(col<=n - row + 1){
                System.out.print(col);
                col++;
            }
            // to print the starts instead of space
            int space = 1;
            while(space<row){
                System.out.print("**");
                space++;
            }
            // to print the last numbers
            int start = n - row + 1;
            while (start>0){
                System.out.print(start);
                start--;
            }
            row++;
            System.out.println();
        }
    }
}
