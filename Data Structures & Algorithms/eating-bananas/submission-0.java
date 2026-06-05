class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);

        int l = 1;
        int r = piles[piles.length - 1];
        int res = r;

        while (l <= r) {
            int k = l + (r - l) / 2;

            long totalTime = 0;
            for (int p : piles) {
                totalTime += (p + k - 1) / k; // ceil(p/k)
            }

            if (totalTime <= h) {
                res = k;
                r = k - 1;
            } else {
                l = k + 1;
            }
        }

        return res;
    }
}
