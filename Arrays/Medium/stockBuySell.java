public class stockBuySell {
    static int stocks(int[] arr){
        int maxpro = 0;
        for(int i = 0;i<arr.length;i++){
            for(int j =i+1;j<arr.length;j++){
                if(arr[j] > arr[i]){
                    maxpro = Math.max(maxpro, arr[j] - arr[i]);
                }
            }
        }
        return maxpro;
    }

    //OPTIMAL WAY

    static int stock(int[]arr){
        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for(int i =0;i<arr.length;i++){
            minprice = Math.min(minprice, arr[i]);
            maxprofit = Math.max(maxprofit, arr[i] - minprice);
        }
        return maxprofit;
    }
    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        System.out.println(stocks(arr));
    }
    
}
