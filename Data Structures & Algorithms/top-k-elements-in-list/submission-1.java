class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer> output = new ArrayList<>();
        Map<Integer,Integer> temp = new HashMap<>();

        for(int num : nums) {
            int count = temp.getOrDefault(num,0) + 1;
            temp.put(num,count);
        }

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(
            (a, b) -> temp.get(b).compareTo(temp.get(a))
        );

        maxHeap.addAll(temp.keySet());

        int count = 0;
        while (!maxHeap.isEmpty() && count < k) {
            output.add(maxHeap.poll());
            count++;
        }
        
        return output.stream()
        .mapToInt(Integer::intValue)
        .toArray();
    }
}
