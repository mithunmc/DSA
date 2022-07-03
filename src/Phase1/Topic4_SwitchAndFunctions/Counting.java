package Phase1.Topic4_SwitchAndFunctions;

import java.util.Scanner;

public class Counting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        printCount(n);
    }

    private static void printCount(int num) {
        for(int i = 1; i<= num; i++){
            System.out.print(i+" ");
        }
    }
}
