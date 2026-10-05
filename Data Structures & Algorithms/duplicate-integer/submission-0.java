class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> uniqueArray = new HashSet<>();
        for(int i=0 ; i< nums.length; i++){
            if(uniqueArray.contains(nums[i])){
                return true;
            }
            uniqueArray.add(nums[i]);
        }
        return false;
    }
}