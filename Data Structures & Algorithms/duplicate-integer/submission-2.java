class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> temp = new HashSet<>();

        for(int num : nums) {
            if(!temp.add(num)) {
                return true;
            }
        }

        return false;
        
    }
}