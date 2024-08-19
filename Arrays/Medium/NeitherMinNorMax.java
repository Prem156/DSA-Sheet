public class NeitherMinNorMax {

    public static int findNonMinOrmax(int[] nums) {
        if(nums.length==2 || nums.length==1)return -1;
        if(nums[0]<nums[1] && nums[1]<nums[2] || nums[0]>nums[1] && nums[1]>nums[2])
        {
            return nums[1];
        }
        else if(nums[1]<nums[0] && nums[0]<nums[2] || nums[0]<nums[1] && nums[0]>nums[2])
        {
            return nums[0];
        }

        return nums[2];
    }

        static int findNonMinOrMax(int[] nums) {
            if(nums.length <= 2) {
                return -1;
            } else {
                int min = Integer.MAX_VALUE;
                int max = Integer.MIN_VALUE;
                for(int i = 0; i < nums.length; i++) {
                    if(nums[i] < min) {
                        min = nums[i];
                    }
                    if(nums[i] > max) {
                        max = nums[i];
                    }
                }
                for(int i = 0; i < nums.length; i++) {
                    if(nums[i] != min && nums[i] != max) {
                        return nums[i];
                    }
                }
            }
            return -1;
        }
    public static void main(String[] args) {
        int[] arr = {3,2,4,1};
        System.out.println(findNonMinOrMax(arr));
    }
}
