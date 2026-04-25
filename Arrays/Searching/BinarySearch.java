package Arrays.Searching;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {10,45,120,12,14,1};
        int target = 1;
        System.out.println("The index of the elemeent is: " + binarySearch(arr, target));    
    }

    public static int binarySearch(int[] arr, int target){
        int left = 0;
        int right = arr.length - 1;

        while(left<=right){
            int mid = (left+right)/2;

            if(arr[mid] == target) return mid;
            else if(target < arr[mid]) right = mid-1;
            else left = mid+1;
        }

        return -1;
    }
}
