package Arrays.TwoPointers;

public class TwoSum {
    public static void main(String[] args) {
        int arr[] = {10,12,45,85,100};
        int res[] = twoSum(arr, 110);

        for(int i: res) System.out.print(i + " ");
    }

    static int[] twoSum(int arr[], int target){
        int start = 0;
        int end = arr.length - 1;
        
        while(start<end){
            int sum = arr[start] + arr[end];
            if(sum == target){
                return new int[]{start,end};
            } else if(sum< target){
                start++;
            } else{
                end--;
            }
        }
        return new int[] {start, end};
    }
}
