class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> numberVsIndex = new HashMap<>();
        for(int i =0 ; i< nums.length; i++ ){
            if(numberVsIndex.get(target - nums[i]) != null){
                return new int[]{numberVsIndex.get(target - nums[i]), i};
            }
            else{
                numberVsIndex.put(nums[i],i);
            }
        }
        return new int[]{};
    }
}
