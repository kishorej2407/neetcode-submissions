class Solution {
    public int[] countBits(int n) {
            int[] output = new int[n+1];
        for(int i = 0;i<=n;i++) {
            output[i] = count1(i);
        }
        return output;
    }

    public int count1(int n) {
        int count = 0;
        while(n != 0) {
            n &= (n-1);
            count++;
        }

        return count;
    }
}
