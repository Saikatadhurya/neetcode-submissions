class Solution {
    public int trap(int[] height) {
        int[] leftMaxArr = new int[height.length];
        int[] rightMaxArr = new int[height.length];
        int tempMaxLeft = 0;
        int tempMaxRight = 0;
        int totalTrapSum=0;
        leftMaxArr[0] = 0;
        rightMaxArr[height.length - 1] = 0;
        for(int i = 1 ; i<height.length; i++){
            tempMaxLeft = Math.max(tempMaxLeft, height[i-1]);
            leftMaxArr[i] = tempMaxLeft;
        }

        for(int i=height.length-2; i>=0; i--){
            tempMaxRight = Math.max(tempMaxRight, height[i+1]);
            rightMaxArr[i] = tempMaxRight;
        }

        for(int i=0; i<height.length; i++) {
            int trapWater = Math.min(leftMaxArr[i], rightMaxArr[i]) - height[i];
            if(trapWater > 0 ){
                totalTrapSum += trapWater;
            }
        }
    return totalTrapSum;
    }
}
