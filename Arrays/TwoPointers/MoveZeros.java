package Arrays.TwoPointers;

public class MoveZeros {
    public static void main(String[] args) {
        int arr[] = {0,0,1,0,1,12};
        moveZeros(arr);
        for(int i: arr) System.out.print(i + " ");
    }

    static void moveZeros(int arr[]){
        int fast = 0; 
        int slow = 0;

        while(fast<arr.length){
            if(arr[fast] ==0){
                fast++;
            } else{
                int temp = arr[fast];
                arr[fast] = arr[slow];
                arr[slow] = temp;
                
                slow++; fast++;
            }
        }
    }
}
