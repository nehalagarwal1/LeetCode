class Solution {
    public void nextPermutation(int[] nums) {
        
        int n = nums.length;
        int index = -1;

        for(int i=n-2; i>=0; i--){

            if(nums[i] < nums[i+1]){

                index = i;
                break;

            }
        }


        if(index == -1){

            for(int i=0; i<n/2; i++){

                int temp = nums[i];
                nums[i] = nums[n-i-1];
                nums[n-i-1] = temp;

            }

            return;
        }

        for(int i=n-1; i>=0; i--){

            if(nums[i] > nums[index]){

                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
                break;

            }
        }

        int left = index + 1;
        int right = n - 1;

        while(left < right){

            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;

        }


    }
}