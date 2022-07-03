package Phase1.Topic4_SwitchAndFunctions;

import java.util.Scanner;

//Find power of A with B (A^B)
public class Power {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();

        System.out.println(powerOf(a, b));
    }

    public static int powerOf(int a, int b) {
        int ans = 1;

        for (int i = 1; i <= b; i++) {
            ans *= a;
        }
        return ans;
    }
}
