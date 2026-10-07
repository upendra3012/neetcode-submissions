class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> freqArrVsStrings = new HashMap<>();
        for(String str : strs){
            String currentArray = getFrequencyArray(str);
            List<String> tempArray = freqArrVsStrings.getOrDefault(currentArray, new ArrayList<String>());
            tempArray.add(str);
            freqArrVsStrings.put(currentArray,tempArray);
        }
        List<List<String>> result = new ArrayList<>();
        for(String key : freqArrVsStrings.keySet()){
            result.add(freqArrVsStrings.get(key));
        }
        return result;
    }
    public String getFrequencyArray(String s){
        int[] charFrequency = new int[26];
        for(char c : s.toCharArray()){
            charFrequency[c-'a'] =  charFrequency[c-'a']+1;
        }
        return Arrays.toString(charFrequency);
    }
}
