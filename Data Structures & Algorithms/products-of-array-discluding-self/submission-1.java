class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product = 1;
        int zeroCount = 0;
        for(int i : nums){
            if(i != 0){
                product *= i;
            }
            else{
                zeroCount++;
            }
        }
        for(int i =0; i< nums.length; i++){
            if(nums[i] == 0 && zeroCount == 1){
                nums[i] = product;
            }
            else if(nums[i] != 0 && zeroCount == 1){
                nums[i] = 0;
            }
            else if(zeroCount > 1){
                nums[i] = 0;
            }
            else{
                int temp = product/nums[i];
                nums[i] = temp;
            }
        }
        return nums;
    }
}  
