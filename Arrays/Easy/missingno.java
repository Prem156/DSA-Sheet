public class missingno {
    static int missingnumber(int[] arr){
        int xor1 = 0,xor2=0;
        int n = arr.length;
        for(int i =0;i<n-1;i++){
            xor2 = xor2 ^ arr[i];
            xor1 = xor1 ^ (i+1);
        }
        xor1 = xor1 ^ n;
        return (xor1 ^ xor2);
    }

    
    static int missing_number(int[] arr){
        int n = arr.length;
        int sum = n*(n+1)/2;
        int s2 = 0;
        for(int i=0;i<n-1;i++){
            s2 += arr[i];
        }
        return sum - s2;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,4,5};
        System.out.println(missing_number(arr));
    }
}
