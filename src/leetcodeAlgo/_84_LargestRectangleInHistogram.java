package leetcodeAlgo;

public class _84_LargestRectangleInHistogram {
    public int largestRectangleArea(int[] heights) {

        if (heights.length == 0) return 0;
        int maxRectangleArea = 0;
        int i = 0;
        while (i <= heights.length - 1) {
            int l = i, r = i;
            while (l >= 0 && heights[l] >= heights[i]) l--;
            boolean shift = true;
            while (r <= heights.length - 1 && heights[r] >= heights[i]) {
                if (heights[r] == heights[i] && shift)
                    i = r;
                else shift = false;
                r++;
            }
            int area = ((r - 1) - (l + 1) + 1) * heights[i];
            maxRectangleArea = Math.max(maxRectangleArea, area);
            i++;
        }
        return maxRectangleArea;

    }
}
