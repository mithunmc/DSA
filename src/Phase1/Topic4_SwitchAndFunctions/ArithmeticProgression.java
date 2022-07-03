package Phase1.Topic4_SwitchAndFunctions;

import java.util.Scanner;

public class ArithmeticProgression {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        System.out.println("nth term is " + nthTerm(n));
    }
    public static int nthTerm(int num){

        return (3 * num + 7);

    }



}
