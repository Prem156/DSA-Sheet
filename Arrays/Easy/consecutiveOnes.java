public class consecutiveOnes {
    static int countConsecutiveOnes(int[] arr){
        int count = 0;
        int maxcount = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                count++;
            }
            else{
                count = 0;
            }
            maxcount = Math.max(maxcount, count);
        }
        return maxcount;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,0,1,1,1,1};
        System.out.print(countConsecutiveOnes(arr));
    }
}
