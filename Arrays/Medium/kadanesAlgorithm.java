public class kadanesAlgorithm {
    static int maxSumArray(int[] arr){
        int maxsum = Integer.MIN_VALUE;
        int currsum = 0;
        int ansStart = -1;
        int ansEnd = -1;
        int start = 0;
        for(int i=0;i<arr.length;i++){
            if(currsum==0){
                start = i;
            }
            currsum +=arr[i];
            // maxsum = Math.max(maxsum, currsum);
            if(currsum > maxsum){
                maxsum = currsum;
                ansStart = start;
                ansEnd = i;
            }
            if(currsum < 0){
                currsum = 0;
            }
        }
        return maxsum;
    }
    
    public static void main(String[] args) {
        int arr[] = {-2,-1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSumArray(arr));
    }
}
