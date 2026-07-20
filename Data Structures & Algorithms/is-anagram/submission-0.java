class Solution {
    public boolean isAnagram(String s, String t) {
        int[] sN = new int[26];
        int[] tN = new int[26];

        if(s.length() != t.length()) {
            return false;
        }

        for(int i=0;i<s.length();i++) {
            sN[s.charAt(i) - 'a'] ++;
            tN[t.charAt(i) - 'a'] ++;
        }

        for(int i=0;i<26;i++) {
            if(sN[i] != tN[i]) {
                return false;
            }
        }

        return true;
    }
}
