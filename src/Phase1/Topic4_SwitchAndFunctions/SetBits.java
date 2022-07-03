package Phase1.Topic4_SwitchAndFunctions;

import java.util.Scanner;

public class SetBits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();

        System.out.println(countSetBits(a, b));
    }

    private static int countSetBits(int a, int b) {
        int setbits = 0;
        while(a !=0 | b !=0){
            if(a !=0){
                int bit = a & 1;
                if(bit == 1){
                    setbits++;
                }
                a = a >>1;
            }
            if(b !=0){
                int bit = b & 1;
                if(bit == 1){
                    setbits++;
                }
                b = b >> 1;
            }
        }
        return setbits;
    }
}
