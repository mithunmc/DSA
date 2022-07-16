package Phase1.Topic5_Arrays;

public class Topic8_BinarySearch {
    public static void main(String[] args) {
         int[] even = {2,4,6,8,12,18};
         int[] odd = {3,8,11,14,16};
        System.out.println(binarySearch(even,6,18));
        System.out.println(binarySearch(even,6,10));
        System.out.println(binarySearch(odd,5,16));
        System.out.println(binarySearch(odd,5,6));
    }

    private static int binarySearch(int[] arr, int size, int key) {
        int start = 0;
        int end = size ;

        int mid = start + (end - start)/2; // This is to avoid errors for large number =  start + (e-s) /2 = s + e/2 - s/2
                                            // = s/2 + e/2 = (s + e)/2
        while(start<=end){
            if(arr[mid] == key){
                return mid ;
            }
            if(arr[mid]>key){
                    end = mid - 1;
            }
            else{
               start = mid + 1;
            }
            mid = start + (end - start)/2;
        }

        return -1;
    }
}
