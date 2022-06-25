package patterns;

import java.util.Scanner;

/*
   j=  1 2 3
i = 1  A
i = 2  B C
i = 3  C D E
i = 4  D E F G

 */
public class Pattern15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int row = 1;
        while (row<=n){
            int col = 1;
            while(col<=row){
                System.out.print((char)('A' + row + col - 2)+" ");
                col++;
            }
            System.out.println();
            row++;
        }
    }
}
