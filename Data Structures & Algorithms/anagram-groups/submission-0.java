class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> res = new HashMap<>();
        for (String str : strs){
            char[] charArr = str.toCharArray();
            Arrays.sort(charArr);
            String sortedStr = new String(charArr);
            res.putIfAbsent(sortedStr, new ArrayList<>());
            res.get(sortedStr).add(str);
        }
        return new ArrayList<>(res.values());
    }
}
