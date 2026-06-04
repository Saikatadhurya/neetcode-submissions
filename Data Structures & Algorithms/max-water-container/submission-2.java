class Solution {
    public int maxArea(int[] heights) {
      //two pointer technique
      int left = 0;
      int right = heights.length - 1;
      int maxAr = 0;
      int tempMaxAr;
      while(left <= right){
        int height = Math.min(heights[left],heights[right]);
        int width = right - left;
        tempMaxAr = height * width;
        maxAr = Math.max(tempMaxAr, maxAr);
        if(heights[left] < heights[right]){
            left ++;
        }
        else{
            right --;
        }
      }
    return maxAr;

    }
}