package Phase1.Topic5_Arrays;
/*
Find Topic9_Pivot in an Sorted & Rotated Array using Binary Search
eg: arr = [1,2,3,7,8]
    sorted and rotated arr = [7,8,1,2,3];

    in our case I would consider the pivot to be one here instead of 8
 */
public class Topic9_Pivot {
    public static void main(String[] args) {
        int[] arr = {8,10,1,2,3};
        System.out.println("Topic9_Pivot is "+getPivot(arr,4));

    }

    public static int getPivot(int[] arr, int n) {
        int s = 0;
        int e = n - 1;
        int mid  = s + (e - s)/2;

        while(s<e){
            if(arr[mid]>= arr[0]){
                s = mid + 1;
            }
            else{
                e = mid; // This is because we do not want the pivot to be 8 as shown in the comments we want it as 1.
            }
            mid = s + (e - s)/2;
        }
        return mid; // returning s or e or mid will result in the same answer
    }
}
