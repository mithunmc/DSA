package Phase1.Topic4_SwitchAndFunctions;
/*
nCr = n!/(r!*(n-r)!)
*/

import java.util.Scanner;

public class Combination {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int r = input.nextInt();
        if (n >= r) {
            System.out.println(nCr(n, r));
        }
        else{
            System.out.println("Combination not possible");
        }
    }

    public static int nCr(int n, int r) {
        return (Factorial(n) / (Factorial(r) * Factorial(n - r)));
    }

    public static int Factorial(int n) {
        int Fact = 1;
        while (n != 0) {
            Fact *= n;
            n--;
        }
        return Fact;
    }
}
