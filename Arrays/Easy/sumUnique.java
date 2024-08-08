public class sumUnique {
    
    static int sum_unique(int[] arr){
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            boolean isunique = true;
            for(int j=0;j<arr.length;j++){
                if(i!=j && arr[i]==arr[j]){
                    isunique = false;
                    break;
                }
                
            }
            if(isunique){
                sum += arr[i];
            }
            System.out.print(arr[i] + " ");
            System.out.println("i = " + i);
            System.out.println("sum = " + sum);
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,2};
        System.out.println(sum_unique(arr));
    }
}
