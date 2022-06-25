package patterns;

import java.util.Scanner;

/*
package patterns;

import java.util.Scanner;

/*
 Pattern  -
   j = 1 2 3
i = 1  1 2 3
i = 2  4 5 6
i = 3  7 8 9

 */

public class Pattern4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int i = 1;
        int count = 1;
        while (i <= n) {
            int j = 1;
            while (j <= n) {
                System.out.print(count);
                count++;
                j++;
            }
            System.out.println();
            i++;

        }
    }
}
