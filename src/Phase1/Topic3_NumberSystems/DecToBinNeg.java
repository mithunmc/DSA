package Phase1.Topic3_NumberSystems;

import java.util.Arrays;
import java.util.Scanner;

/*
taking a digit and anding it with one will generate the last bits value.
and then multiplying it with the powers of 10 will give the exact value in bits
 */
public class DecToBinNeg {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input number: ");
        int n = in.nextInt();
        int temp = n;
        int[] array;
        array = new int[32];
        boolean isNeg = false;
        if (n < 0) {
            n = n * (-1);
            isNeg = true;
        }
        System.out.println(n);
        /*
        Finding the binary equivalent of the number considering that it is a positive and then taking one's complement
         there itself
         */
        if(isNeg){

            Arrays.fill(array,1);

            int i = 31;
            while (n!=0){
                int digit = n & 1;
                if(digit == 0){
                    digit = 1;
                }
                else{
                    digit = 0;
                }
                array[i] = (digit);
                i--;
                n = n >> 1;
            }

            //Making 2's complement
            for (int k = 31; k>=0; k--){
                if(array[k] == 0){
                    array[k] = 1;
                    break;
                }
            }

            System.out.print("Two's Complement of "+ temp + " is ");
            for (int j : array) {
                System.out.print(j + " ");

            }


        }

    }
}




