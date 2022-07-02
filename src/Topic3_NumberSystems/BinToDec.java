package Topic3_NumberSystems;

import java.util.Scanner;

public class BinToDec {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();  //110
        int ans = 0;
        int i = 0;
        while (n != 0) {
            int digit = n % 10;
            if (digit == 1) {
                ans = (ans + (int) Math.pow(2, i));
            }
            i++;
            n = n / 10;
        }
        System.out.println(ans);
    }
}
