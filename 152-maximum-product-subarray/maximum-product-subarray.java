class Solution {
    public int maxProduct(int[] nums) {
        int result = nums[0];
        int minEnding = nums[0];
        int maxEnding = nums[0];
        for(int i=1;i<nums.length;i++){
            int min=minEnding*nums[i];
            int max=maxEnding*nums[i];
            minEnding = Math.min(nums[i],Math.min(min,max));
            maxEnding = Math.max(nums[i],Math.max(min,max));
            result= Math.max(result,maxEnding);
        }
        return result;
    }
}