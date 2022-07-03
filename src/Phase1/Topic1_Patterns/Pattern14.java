package Phase1.Topic1_Patterns;

import java.util.Scanner;

/*
   j=  1 2 3
i = 1  A
i = 2  B C
i = 3  D E F
 */
public class Pattern14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int row = 1;
        char st = 'A';
        while(row<=n){
            int col = 1;
            while(col<=row){
                System.out.print(st + " ");
                st++;
                col++;
            }
            System.out.println();
            row++;
        }
    }
}
