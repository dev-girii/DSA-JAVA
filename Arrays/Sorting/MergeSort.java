package Arrays.Sorting;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {10,54,2,124,9,45,321};
        int len = arr.length;
        mergeSort(arr, 0, len-1);

        for(int i: arr) System.out.print(i + " ");
    }

    public static void mergeSort(int arr[], int left, int right){
        if(left>=right) return;
        int mid = (left+right)/2;
        mergeSort(arr, left, mid);
        mergeSort(arr, mid+1, right);

        merge(arr, left, mid, right);
    }

    public static void merge(int[] arr, int left, int mid, int right){
        int n1 = mid + 1 - left;
        int n2 = right - mid;

        int a1[] = new int[n1];
        int a2[] = new int[n2];

        for(int i=0; i<n1; i++){
            a1[i] = arr[left+i];
        }
        for(int j=0; j<n2; j++){
            a2[j] = arr[mid+j+1];
        }

        int i=0, j=0, k=left;
        while(i<n1 && j<n2){
            if(a1[i] < a2[j]){
                arr[k++] = a1[i++];
            } else{
                arr[k++] = a2[j++];
            }
        }

        while(i<n1) arr[k++] = a1[i++];
        while(j<n2) arr[k++] = a2[j++];
    }
}
