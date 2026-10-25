class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            seen.add(nums[i]);
        }
        int maxLength=0;
        for(int num : seen){
            if (!seen.contains(num - 1)) {
                int currentLength=1;
                while(seen.contains(num+1)){
                    currentLength++;
                    num=num+1;
                }
                maxLength=Math.max(currentLength,maxLength);
            }  
        }
        return maxLength;
    }
}