class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {

            // Skip duplicate first values
            if (i != 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int right = i + 1;
            int left = nums.length - 1;

            while (right < left) {

                int sum = nums[i] + nums[right] + nums[left];

                if (sum == 0) {
                    result.add(Arrays.asList(
                        nums[i],
                        nums[right],
                        nums[left]
                    ));

                    right++;
                    left--;

                    // Skip duplicate right values
                    while (right < left && nums[right] == nums[right - 1]) {
                        right++;
                    }

                    // Skip duplicate left values
                    while (right < left && nums[left] == nums[left + 1]) {
                        left--;
                    }

                } else if (sum > 0) {
                    left--;
                } else {
                    right++;
                }
            }
        }

        return result;
    }
}