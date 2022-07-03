package Phase1.Topic1_patterns;

import java.util.Scanner;

/*
   j=  1 2 3
i = 1  A B C
i = 2  B C D
i = 3  C D E
ch = A
formula = ch + i + j - 2
 */
public class Pattern12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int row = 1;
        char st = 'A';
        while(row<=n){
            int col = 1;
            while(col<=n){
                System.out.print((char)(st + row + col - 2) + " ");
                col++;
            }
            System.out.println();
            row++;

        }
    }
}
