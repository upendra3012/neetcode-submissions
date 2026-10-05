class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> charVsFrequency = new HashMap<>();
        if(s.length() != t.length()){
            return false;
        }
        for(int i = 0 ; i < s.length(); i++){
            Character schar = s.charAt(i);
            Character tchar = t.charAt(i);
            if(schar == tchar){
                continue;
            }
            if(charVsFrequency.get(schar) == null){
                charVsFrequency.put(schar, 1);
            }
            else{
                charVsFrequency.put(schar, charVsFrequency.get(schar)+1);
            }
            if(charVsFrequency.get(tchar) == null){
                charVsFrequency.put(tchar, -1);
            }
            else{
                 charVsFrequency.put(tchar, charVsFrequency.get(tchar)-1);
            }
           
        }
        for(Character c : charVsFrequency.keySet()){
            if(charVsFrequency.get(c) != 0){
                return false;
            }
        }
        return true;
    }
}
