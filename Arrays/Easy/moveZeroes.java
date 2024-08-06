public class moveZeroes {
    static void movezeroes(int[] arr){
        int n = arr.length;
        int j=1;
        for(int i =0;i<n;i++){
            if(arr[i]==0){
                arr[i] = arr[i+1];
                arr[n-j] = 0;
                j++;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,0,2,3,0,4,0,1};
        movezeroes(arr);
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}
