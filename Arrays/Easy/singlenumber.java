public class singlenumber {
    static int single_number(int[] arr){
        int ans = 0;
        for(int i =0;i<arr.length;i++){
            ans = ans ^ arr[i];
        }
        return ans;
    }
    public static void main(String[] args) {
       int[] arr = {1,2,1,2,4};
       System.out.println(single_number(arr));
    }   
}
