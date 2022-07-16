package Phase1.Topic5_Arrays;

public class ArraysIntro {
    public static void main(String[] args) {
        int[] number = new int[15];

        // Accessing an array
        System.out.println(number[14]);

        printArray(number);

    }

    private static void printArray(int[] number) {
        for(int i = 0; i<number.length; i++){
            System.out.print(number[i]+" ");
        }
    }
}
