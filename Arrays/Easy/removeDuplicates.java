public class removeDuplicates{
    static int removeduplicate(int[] arr){
        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[j]!=arr[i]){
                arr[i+1] = arr[j];
                i++;
            }
        }
        return i+1;
    }
    public static void main(String[] args) {
       int [] arr = {1,1,2,2,2,3,3};
       int k = removeduplicate(arr);
       System.out.println(k);
       int j=0;
       for(int i=0;i<arr.length;i++){
        if(i >= k){
            System.out.print("-1" + " ");
        }
        else{
            System.out.print(arr[i] + " ");
        }
       }
    }
}

//$ 3
//$ 1 2 3 -1 -1 -1 -1 