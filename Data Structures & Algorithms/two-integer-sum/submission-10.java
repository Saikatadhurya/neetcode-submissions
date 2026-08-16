class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> resArr = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            resArr.put(nums[i], i);
        }
        for(int i=0;i<nums.length;i++){
            int diff = target - nums[i];
            if(resArr.containsKey(diff) && resArr.get(diff) != i){
                return new int[]{i, resArr.get(diff)};
            }
        }
         return new int[0];
    }
}
