public class twosum {
    static int[] two_sum(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{}; 
    }


    static boolean twoSum(int[] arr,int target){
        int left = 0;
        int right = arr.length-1;
        while(left<=right){
            int sum = arr[left] + arr[right];
            if(sum==target){
                return true;
            }
            else if (sum > target){
                right--;
            }
            else{
                left++;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        System.out.println(twoSum(arr, 9));
        
        // int[] result = two_sum(arr, 9);
        // Output the result
        // if(result[0] != -1) {
        //     System.out.println("Indices: " + result[0] + ", " + result[1]);
        // } else {
        //     System.out.println("No pair found");
        // }
    }
}
