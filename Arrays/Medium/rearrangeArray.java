public class rearrangeArray {
    static int[] rearrangearray(int[] arr){
        int[] pos = new int[arr.length];
        int[] neg = new int[arr.length];
        for(int i =0;i<arr.length;i++){
            if(arr[i]>0){
                pos[i] = arr[i];
            }
            else{
                neg[i] = arr[i];
            }
        }
        if(pos.length > neg.length){
            for(int i =0;i<neg.length;i++){
                arr[2 * i] = pos[i];
                arr[2 * i + 1] = neg[i];
            }
            int indx = neg.length * 2;
            for(int i = neg.length;i<pos.length;i++){
                arr[indx] = pos[i];
                indx++;
            }
        }
        else{
            for(int i =0;i<pos.length;i++){
                arr[2 * i] = pos[i];
                arr[2 * i + 1] = neg[i];
            }
            int indx = pos.length * 2;
            for(int i = pos.length;i<neg.length;i++){
                arr[indx] = neg[i];
                indx++;
            }
        }
        return arr;
    }



    //Optimal way

    static int[] rearrangesign(int[] arr){
        int j = 0;
        int k =1;
        int[] arr1 = new int[arr.length];
        for(int i =0;i<arr.length;i++){
            if(arr[i]>0){
                arr1[j] = arr[i];
                j = j+2;
            }
            else{
                arr1[k] = arr[i];
                k +=2;
            }
        }
        return arr1;
    }
    static void printArray(int[] arr){
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {3,1,-2,-5,2,-4};
        // int [] ans = rearrangesign(arr);
        int[] ans2 = rearrangearray(arr);
        printArray(ans2);
    }
} 
