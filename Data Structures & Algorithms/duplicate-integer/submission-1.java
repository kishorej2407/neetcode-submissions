class Solution {
    public boolean hasDuplicate(int[] nums) {
        List<Integer> temp = new ArrayList<Integer>();

        for(int num : nums) {
            if(temp.contains(num)) {
                return true;
            } else {
                temp.add(num);
            }
        }

        return false;
        
    }
}