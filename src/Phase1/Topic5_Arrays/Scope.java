package Phase1.Topic5_Arrays;

public class Scope {
    public static void main(String[] args) {
        int[] arr = {1,2,3};

        UpdateArray(arr, 3);
        System.out.println("Printing Main Function");
        for(int i = 0; i<3; i++){
            System.out.print(arr[i]+ " ");
        }
    }

    private static void UpdateArray(int[] arr, int size) {
        System.out.println("Inside the Function");
        arr[0] = 120;
        for(int i = 0; i<size; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        System.out.println("Going back to the Main method");
    }
}
