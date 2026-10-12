class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> uniqueNums = new HashSet<>();
        Set<Integer> subSetPossibleNums = new HashSet<>();
        for (int num : nums) {
            uniqueNums.add(num);
        }
        for(int num : uniqueNums){
            if(!uniqueNums.contains(num-1)){
                subSetPossibleNums.add(num);
            }
        }

        int returnableCount = 0;
        for(int num : subSetPossibleNums){
            int tempCount = 0;
            while(tempCount+subSetPossibleNums.size() < nums.length){
                if(uniqueNums.contains(num+1)){
                    tempCount++;
                    num++;
                }
                else{
                    break;
                }
            }
            tempCount++;
            if( tempCount > returnableCount){
                returnableCount = tempCount;
            }
        }
        return returnableCount;
    }
}
