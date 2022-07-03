package Phase1.Topic1_Patterns;

import java.util.Scanner;

/*
 Pattern  -
   j=  1 2 3
i = 1  1 1 1
i = 2  2 2 2
i = 3  3 3 3

    ...
 */
public class Pattern1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= n) {
                System.out.print(i);
                j++;
            }
            System.out.println();
            i++;
        }

    }
}