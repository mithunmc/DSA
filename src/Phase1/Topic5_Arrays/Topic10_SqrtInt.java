package Phase1.Topic5_Arrays;

import java.util.Scanner;
/*
Give square root with precision using binary search
1. Do binary seatch to find the square root in integer
2. initilise the factor to be 1 and divide it by 10 to get more precision and then check if the ans < the number
 */
public class Topic10_SqrtInt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Enter the number");
        n = input.nextInt();
        int tempSol = (int)sqrtInt(n);
        System.out.println("Enter the precision ");
        int precision = input.nextInt();
        String prec = "%."+precision+"f";
        System.out.println( String.format(prec,morePrecision(n,precision, tempSol)));
    }
    public static double morePrecision(int n, int precision, int tempSol){
            double factor = 1;
            double ans = tempSol;
            for(int i = 0;i<precision; i++){
                factor /= 10;
                for(double j = ans; j*j<n; j= j+factor){
                   ans = j;
                }
            }
            return ans;
    }
    public static long sqrtInt(int n){
        long s = 0;
        long e = n;
        long mid = s + (e - s)/2;
        long ans = -1;

        while(s<=e){
            long square = mid * mid;
            if(square == n){
                return mid;
            }
            if(square < n){
                ans = mid;
                s = mid + 1;

            }
            else{
                e = mid - 1;
            }
            mid = s +(e - s)/2;
        }
        return ans;
    }
}
