public class Heaps {
    public static void runningSum(int[] nums) {
            int n = nums.length;

            for(int i = 1; i<n;i++){
                nums[i]=nums[i]+nums[i-1];
            }
        }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        runningSum(nums);
        for(int i = 0 ;i<10;i++) System.out.print(nums[i]+" ");


    }
    }

