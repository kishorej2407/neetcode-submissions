class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int[] prefixProd = new int[nums.length];
	        int[] postfixProd = new int[nums.length];
	        prefixProd[0] = 1;
	        int j = nums.length - 1;
	        postfixProd[j] = 1;
	        for(int i=0;i<nums.length;i++) {
	            if(i >0) {
	                prefixProd[i] = prefixProd[i-1] * nums[i-1];
	            }
	            if((j - i) < (nums.length -1)) {
	                postfixProd[j - i] =  postfixProd[j - i + 1] * nums[j - i + 1];
	            }
	        }
	        
	        int[] output = new int[nums.length];
	        for(int i=0;i<nums.length;i++) {
	            output[i] = prefixProd[i] * postfixProd[i];
	        }

	        return output;
    }
}  
