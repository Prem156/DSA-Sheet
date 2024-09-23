public class longestSubarray {
    static int longestsubarray(int [] arr,int n){
        int len = 0;
        for(int i=0;i<arr.length;i++){
            int sum = 0;
            for(int j=i;j<arr.length;j++){
                sum += arr[j];
                // int sum = 0;
                // for(int k=i;k<j;k++){
                //     sum += arr[k];
                // }
                if(sum==n){
                    len = Math.max(len, j-i+1);
                }
            }
        }
        return len;
    }

    //Optimal Two Pointer approach
    static int longestSub(int[] arr,int k){
        int left = 0;
        int right = 0;
        int len = 0;
        int sum = arr[0];
        while(right < arr.length){
            while (left<=right && sum > k) {
                sum -= arr[left];
                left++;
            }
            if(sum==k){
                len = Math.max(len, right - left+1);
            }
            right++;
            if(right<arr.length){
                sum+=arr[right];
            }
        }
        return len;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,1,1,1,4,2,3};
        System.out.println(longestsubarray(arr, 14));
        System.out.println(longestSub(arr,7));
    }
}

