class Solution {
    public int maxArea(int[] heights) {
      int maxAr = 0;

      for(int i=0;i<heights.length;i++){
        int tempArea=0;
        for(int j=i+1;j<heights.length;j++){
            tempArea = (j-i) * Math.min(heights[i], heights[j]);
            maxAr = Math.max(maxAr, tempArea);
        }
      }

      return maxAr;

    }
}