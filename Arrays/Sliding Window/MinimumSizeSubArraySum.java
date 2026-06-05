public class MinimumSizeSubArraySum {
    public static void main(String[] args){
        int[] nums = {1,4,4};
        int target = 4;
        int val = msss(nums, target);
        System.out.println(val);
    }

    public static int msss(int nums[], int target){
        int left = 0;
        int right = 0;

        int currSum = 0;
        int minLength = Integer.MAX_VALUE;
        while(right<nums.length){
            currSum += nums[right];

            while(currSum >= target){
                minLength = Math.min(minLength, right-left + 1);
                currSum -= nums[left];
                left++;
            }
            right++;
        }
        if(minLength == Integer.MAX_VALUE) return 0;
        else return minLength;
    }
}
