package patterns;

import java.util.Scanner;

/*
   j=  1 2 3
i = 1  A B C
i = 2  D E F
i = 3  G H I
 */
public class Pattern11_HW {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int row = 1;
        char st  ='A';
        while(row<=n){
            int col = 1;
            while (col<=n){
                System.out.print(st +" ");
                col++;
                st++;
            }
            System.out.println();
            row++;
        }
    }
}
