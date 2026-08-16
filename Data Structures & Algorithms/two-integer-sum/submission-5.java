class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> resArr = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            resArr.put(nums[i], i);
        }
        for(int i=0;i<nums.length;i++){
            if(resArr.containsKey(target - nums[i]) && resArr.get(target - nums[i])!=i){
                return new int[]{i, resArr.get(target - nums[i])};
            }
        }
         return new int[0];
    }
}
