import java.util.Arrays;

public class Duplicateno {
    static int duplicate(int[] arr){
        Arrays.sort(arr);
        for(int i =0;i<arr.length;i++){
            if(arr[i]==arr[i+1]){
                return arr[i];
            }
        }
        return 0;
    }

    static boolean IsDuplicate(int[] arr){
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,4,1,2};
        System.out.println(duplicate(arr));
        System.out.println(IsDuplicate(arr));
    }
}
