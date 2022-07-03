package Phase1.Topic4_SwitchAndFunctions;

import java.util.Scanner;

public class PrimeNo {
    private static boolean isPrime (int n) {
        for(int i = 2; i< n; i++){
            if(n %i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        boolean isPrime = isPrime (n);
        if(isPrime){
            System.out.println(n+" is a prime");
        }
        else{
            System.out.println(n + " is not prime");
        }
    }



}
