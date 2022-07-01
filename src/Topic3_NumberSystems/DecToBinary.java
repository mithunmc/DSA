package Topic3_NumberSystems;

import java.util.Scanner;
/*
taking a digit and anding it with one will generate the last bits value.
and then multiplying it with the powers of 10 will give the exact value in bits
 */
public class DecToBinary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int answer = 0;

            int i = 0;
            while (n != 0) {
                int digit = n & 1;
                answer = (digit * (int) Math.pow(10, i)) + answer;
                n = n >> 1;
                i++;
            }
            System.out.println(answer);
        }
    }

