package Phase1.Topic4_SwitchAndFunctions;

import java.util.Scanner;

public class ChangeCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int Rs100, Rs50, Rs20, Rs1;
        switch (1) {
            case 1:
                Rs100 = n / 100;
                n = n % 100;
                System.out.println("Rs 100 = " + Rs100);

            case 2:
                Rs50 = n / 50;
                n = n % 50;
                System.out.println("Rs 50 = " + Rs50);

            case 3:
                Rs20 = n / 20;
                n = n % 20;
                System.out.println("Rs 20 = " + Rs20);

            case 4:
                Rs1 = n;
                System.out.println("Rs 1 = " + Rs1);

        }
    }


}
