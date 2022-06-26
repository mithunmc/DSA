package Topic2_OperatorsLoopsVarScoping;

public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 10;
        int first = 0;
        int sec = 1;
        System.out.print(first + " " + sec + " ");
        for (int i = 1; i <= n; i++) {

            int temp = first + sec;
            System.out.print(temp + " ");
            first = sec;
            sec = temp;


        }
    }
}
