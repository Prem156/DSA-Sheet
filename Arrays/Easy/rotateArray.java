public class rotateArray {
    static void rotateLeftBy1(int[] arr){
        int temp = arr[0];
        for(int i=0;i<arr.length-1;i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = temp;
    }

    static void rotateArrayByD(int []arr,int d){
        int temp[] = new int[arr.length];
        for(int i=0;i<d;i++){
            temp[i] = arr[i];
        }
        for(int i = d;i<arr.length;i++){
            arr[i-d] = arr[i];
        }
        for(int i =arr.length-d;i<arr.length;i++ ){
            arr[i] = temp[i-(arr.length-d)];
        }
    }

    static void reverse(int[] arr,int start,int end){
        while (start<=end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    static void rotate(int[] arr,int k){
        int n = arr.length;
        reverse(arr, 0, k-1);
        reverse(arr, k, n-1);
        reverse(arr, 0, n-1);
    }
    public static void main(String[] args) {
        int[] arr = {3,7,8,9,10,11};
        int d = 3; 
        rotate(arr, d);
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}
