package Phase1.Topic4_SwitchAndFunctions;

import java.util.Scanner;

// To give nth Fibonacci
public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        System.out.println(n+"th Fibonacci number is "+ fibonacci(n));

    }

    public static int fibonacci(int num){
        int first = 0;
        int sec = 1;
        int fib = 0;
        for(int i = 2; i<num; i++){
            fib = first + sec;
            first = sec;
            sec = fib;
        }

        return fib;
    }
}
