package Topic1_patterns;

import java.util.Scanner;

/*
   j=  1 2 3 4
i = 1  1
i = 2  2 3
i = 3  4 5 6
i = 4  7 8 9 10
 */
public class Pattern7_HW {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int i = 1;
        int count = 1;
        while (i <= n) {
            int j = 1;
            while (j <= i) {
                System.out.print(count + " ");
                count++;
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
