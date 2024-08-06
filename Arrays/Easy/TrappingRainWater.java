
public class TrappingRainWater {
    static int[] NGER(int[] arr){
        int maxElement = 0;
        int nger[] = new int[arr.length];
        for(int i = arr.length-1;i>=0;i--){
            nger[i] = maxElement;
            maxElement = Math.max(maxElement, arr[i]);
        }
        return nger;
    }

    static int[] NGEL(int [] arr){
        int maxElement = 0;
        int [] ngel = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            ngel[i] = maxElement;
            maxElement = Math.max(maxElement, arr[i]);
        }
        return ngel;
       } 

       static int rainWater(int[] arr){
        int min = 0;
        int count = 0;
        int height = 0;
        int[] arr1 = NGEL(arr);
        int[] arr2 = NGER(arr);
        for(int i=0;i<arr.length;i++){
            min = Math.min(arr1[i], arr2[i]);
            if(arr[i] < min){
                height = min-arr[i];
                count += height;
            }
        }
        return count;
       }
    public static void main(String[] args) {
        int[] arr = {4,2,0,3,2,5};
         System.out.println(rainWater(arr));
    }
}
