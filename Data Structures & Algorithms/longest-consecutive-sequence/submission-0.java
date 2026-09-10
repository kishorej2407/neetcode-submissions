class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<Integer>();

        for(int num : nums) {
            numSet.add(num);
        }
        int longest = 0;
        for(int num : nums) {
            if(!numSet.contains(num -1)) {
                int l = 1;
                while(numSet.contains(num+l)) {
                    l++;
                }
                longest = Math.max(l,longest);
            }
        }

        return longest;
    }
}
