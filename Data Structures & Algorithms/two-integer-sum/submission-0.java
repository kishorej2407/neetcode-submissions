class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> tempMap = new HashMap<>();
        for(int i=0;i<nums.length;i++) {
            int rem = target - nums[i];
            if(tempMap.containsKey(rem)) {
                return new int[]{tempMap.get(rem),i};
            } else {
                tempMap.put(nums[i],i);
            }
        }

        return null;
    }
}
