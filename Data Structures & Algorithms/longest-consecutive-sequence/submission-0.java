class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        HashSet<Integer> numSet = new HashSet<>();
        for(int num :nums)
        {
            numSet.add(num);
        }
        int longest = 0;

        for(int num:numSet){
            if(!numSet.contains(num-1)){
                int tempLongest = 1;
                while(numSet.contains(num + tempLongest)){
                    tempLongest++;
                }
                longest = Math.max(longest, tempLongest);
            }
        }
        return longest;
    }
}
