class Solution {
    public int[] twoSum(int[] numbers, int target) {
         		int f=0,b=numbers.length -1 ;
		 
		 while(f < b) {
			 
			 int sum = numbers[f] + numbers[b];
			 if(sum > target) {
				 b --;
			 } else if(sum < target) {
				 f++;
			 } else {
				 return new int[] {f+1,b+1};
			 }
			 
			
		 }
		 
		 return new int[] {};
    }
}
