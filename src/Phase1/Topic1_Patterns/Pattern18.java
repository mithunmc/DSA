package Phase1.Topic1_Patterns;

import java.util.Scanner;

/*
   j=  1 2 3 4 5 6 7
i = 1        1
i = 2      1 2 1
i = 3    1 2 3 2 1
i = 4  1 2 3 4 3 2 1
 */
public class Pattern18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int row = 1;
        while (row<=n){
            int space = 1;
            while(space<=n - row){
                System.out.print(" ");
                space++;
            }
            int col = 1;
            while (col<=row){
                System.out.print(col);
                col++;
            }
            int start = row - 1;
            while(start!=0){
                System.out.print(start);
                start--;
            }
            System.out.println();
            row++;
        }

    }
}
