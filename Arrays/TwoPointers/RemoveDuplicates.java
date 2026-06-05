package Arrays.TwoPointers;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int arr[] = {2,2,2,2,2,3,3,3,3,4,5,6};
        System.out.println(removeDuplicates(arr));
        for(int i: arr) System.out.print(i + " ");
    }

    static int removeDuplicates(int arr[]){
        int slow = 0;        

        for(int fast=1; fast<arr.length; fast++){
            if(arr[slow] != arr[fast]){
                slow++;
                arr[slow] = arr[fast];
            }
        }
        return slow;
    }
}
