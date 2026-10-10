public class Solution {

    public String encode(List<String> strs) {
        if (strs.isEmpty()) return "";
        String res = "";
        List<Integer> sizes = new ArrayList<>();
        for (String str : strs) {
            sizes.add(str.length());
        }
        for (int size : sizes) {
            res += size+",";
        }
        res = res + '#';
        for (String str : strs) {
            res +=str;
        }
        return res;
    }

    public List<String> decode(String str) {
        if (str.length() == 0) {
            return new ArrayList<>();
        }
        List<String> res = new ArrayList<>();
        List<Integer> sizes = new ArrayList<>();
        int i = 0;
        while (str.charAt(i) != '#') {
            String cur = "";
            while (str.charAt(i) != ',') {
                cur += str.charAt(i);
                i++;
            }
            sizes.add(Integer.parseInt(cur));
            i++;
        }
        i++;
        for (int sz : sizes) {
            res.add(str.substring(i, i + sz));
            i += sz;
        }
        return res;
    }
}