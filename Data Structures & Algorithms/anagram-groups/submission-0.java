class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> temp = new HashMap<>();

        for(String str : strs) {
            char[] AlArr = new char[26];
            for(char a: str.toCharArray()){
                AlArr[a - 'a'] ++;
            }
            String charC = Arrays.toString(AlArr);
            List<String> tempList = temp.getOrDefault(charC, 
            new ArrayList());
            tempList.add(str);
            temp.put(charC,tempList);
        }

        return new ArrayList(temp.values());
    }
}
