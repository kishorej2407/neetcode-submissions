class Solution {
    public int[] productExceptSelf(int[] nums) {
        int l = nums.length;
        int[] output = new int[l];
        int[] preSum = new int[l];
        int[] sufSum = new int[l];
        
        preSum[0] = 1;
        sufSum[l-1] = 1;

        for(int i=1;i<l;i++) {
            preSum[i] = preSum[i-1] * nums[i-1];
        }

        for(int j= l-2;j>=0;j--) {
            sufSum[j] = sufSum[j+1] * nums[j+1];
        }

        for(int i=0;i<l;i++) {
            output[i] = preSum[i] * sufSum[i];
        }
        return output;
    }
}  
