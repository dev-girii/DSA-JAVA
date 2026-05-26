public class MaxSubArray {
    public static int maxSubArray(int[] arr, int k){
        int n = arr.length;
        if(n<k) return -1;

        int windowSum = 0;

        for(int i=0; i<k; i++){
            windowSum += arr[i];
        }

        int maxSum = windowSum;
        for(int i=k; i< n; i++){
            windowSum += arr[i] - arr[i-k];
            maxSum = Math.max(windowSum, maxSum);
        }
        return maxSum;
    } 

    public static void main(String[] args){
        int arr[] = {1,2,3,4,5};
        System.out.println(maxSubArray(arr, 3));
    }
}
