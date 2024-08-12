import java.util.Collection;

public class sort012 {
    static void sort(int[] arr){
        int count0 = 0,count1 = 0,count2 = 0;
        for(int i =0;i<arr.length;i++){
            if(arr[i] == 0) count0++;
            else if (arr[i] == 1) count1++;
            else count2++;
        }
        for(int i=0;i<count0;i++) arr[i] = 0;
        for(int i=count0;i<count0+count1;i++) arr[i] = 1;
        for(int i=count0+count1;i<arr.length;i++) arr[i] = 2;
    }

    // OPTIMAL SOLUTION
    static void Sort(int[] arr){
        int low = 0,mid = 0,high = arr.length-1;
        while (mid<=high) {
            if(arr[mid]==0){
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                low++;
                mid++;
            }
            else if (arr[mid] == 1){
                mid++;
            }
            else if(arr[mid]==2)
            {
                int temp2 = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp2;
                high--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,0,2,1,1,0};
        Sort(arr);
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}
