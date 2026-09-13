class Solution {
    public int maxArea(int[] heights) {
        int start = 0,end = heights.length -1;
        int maxArea = 0;

        while(start < end) {
           
            int b = end - start ;
            int l = Math.min(heights[start],heights[end]);
            maxArea = Math.max(maxArea,b*l);

            if(heights[start] <= heights[end]) {
                start ++;
            } else {
                end --;
            }
        }
        
        return maxArea;
    }
}
