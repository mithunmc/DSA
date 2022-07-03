package Phase1.Topic1_patterns;

import java.util.Scanner;

/*
   j=  1 2 3 4
i = 1  1
i = 2  2 2
i = 3  3 3 3
i = 4  4 4 4 4
 */
public class Pattern6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= i) {
                System.out.print(i + " ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
