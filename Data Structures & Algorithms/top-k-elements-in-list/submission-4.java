class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // hashmap with n,size
        Map<Integer,Integer> temp = new HashMap<>();
        for(int num : nums) {
            temp.put(num,temp.getOrDefault(num,0) +1);
        }
         // pass it priority queue
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) ->    temp.get(b) - temp.get(a));

        pq.addAll(temp.keySet());
        // return top k
        int[] output = new int[k];
        for(int i=0;i<k;i++) {
            if (!pq.isEmpty()) {
                output[i] = pq.poll();
            }
        }

        return output;
    }
}
