public class majorityElement {
    static int majorityelement(int[] arr){
        int n = (arr.length)/2;
        int ans = 0;
        for(int i=0;i<arr.length;i++){
            int count =0;
            for(int j=0;j<arr.length;j++){
                if(arr[j]==arr[i]){
                    count++;
                }
                if(count>n){
                    ans = arr[i];
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {3,3,4};
        System.out.println(majorityelement(arr));
    }
}
