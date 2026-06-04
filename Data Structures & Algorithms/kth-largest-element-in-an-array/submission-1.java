class Solution {
    public int findKthLargest(int[] nums, int k) {
        //min heap i.e. smallest at the top (1st element of array) 
        //2i+1 is 1st child and 2i+2 is second child
        // min heap in PriorityQueue by default and max heap is PriorityQueue<>(Colletions.reverseOrder)
// heap.offer(x);   // Insert
// heap.poll();     // Remove root
// heap.peek();     // View root
// heap.size();     // Size
// heap.isEmpty();  // Check empty
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int i : nums){
            minHeap.offer(i);
            if(minHeap.size() > k){
                minHeap.poll();
            }
        }
    return minHeap.peek();
    }
}

