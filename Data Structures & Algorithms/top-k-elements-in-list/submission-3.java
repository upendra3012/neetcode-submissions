class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> intVsFrequency = new HashMap<>();
        int[] resultArray = new int[k];
        for(int i : nums){
            intVsFrequency.putIfAbsent(i,0);
            intVsFrequency.put(i, intVsFrequency.get(i)+1);
        }
        
        HashMap<Integer,List<Integer>> frequencyVsInt = new HashMap<>();
        for(int j : intVsFrequency.keySet()){
            frequencyVsInt.putIfAbsent(intVsFrequency.get(j), new ArrayList<Integer>());
            frequencyVsInt.get(intVsFrequency.get(j)).add(j);
        }


        int numsLen = nums.length;
        while(numsLen > 0 && k > 0){
            List<Integer> temp = frequencyVsInt.getOrDefault(numsLen, new ArrayList<Integer>());
            for(int i : temp){
                if(k > 0){
                    resultArray[k-1] = i;
                    k--;
                }
            }
            numsLen --;
        }
        return resultArray;
    }
}
