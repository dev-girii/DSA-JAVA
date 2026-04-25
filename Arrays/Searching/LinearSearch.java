package Arrays.Searching;

public class LinearSearch{
    public static void main(String[] args) {
        int[] arr = {10,25,21,0,45,101,1};
        int n = arr.length;
        int target = 45;
        System.out.println("The index of the element is: " + linearSearch(arr, n, target));
    }

    public static int linearSearch(int arr[], int n, int target){
        for(int i=0; i<n; i++){
            if(arr[i] == target) return i;
        }

        return -1;
    }
}