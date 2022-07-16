package Phase1.Topic1_Patterns;

import java.util.Scanner;

/*

      j = 1  2  3  4
    i = 1 *
    i = 2 *  *
    i = 3 *  *  *
    i = 4 *  *  *  *
 */
public class Pattern5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
