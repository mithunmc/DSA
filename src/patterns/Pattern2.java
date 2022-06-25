package patterns;

import java.util.Scanner;

/*   j=1 2 3 4
i = 1  1 2 3 4
i = 2  1 2 3 4
i = 3  1 2 3 4
i = 4  1 2 3 4
 */
public class Pattern2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= n) {
                System.out.print(j);
                j++;
            }
            System.out.println();
            i++;

        }
    }

}
