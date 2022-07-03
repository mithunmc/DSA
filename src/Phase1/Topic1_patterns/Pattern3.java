package Phase1.Topic1_patterns;
/*
          j=   1 2 3
        i = 1  3 2 1
        i = 2  3 2 1
        i = 3  3 2 1
 n = 3
 j = 1 2 3
 print (3 2 1)
 formula = n - j + 1
            3 - 1 + 1
            3-  2 + 1
            3 - 3 + 1
 */

import java.util.Scanner;

public class Pattern3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= n) {
                System.out.print(n - j + 1);
                j++;
            }
            System.out.println();
            i++;
        }
    }

}
