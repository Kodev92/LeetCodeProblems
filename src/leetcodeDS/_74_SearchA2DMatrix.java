package leetcodeDS;

public class _74_SearchA2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int l = 0;
        int r = matrix.length * matrix[0].length - 1;
        int m;

        while (l <= r) {
            m = l + (r - l) / 2;
            int mElemValue = matrix[m / matrix.length][m % matrix.length];
            if (mElemValue < target)
                l = m + 1;
            else if (mElemValue > target)
                r = m - 1;
            else return true;
        }
        return false;

    }
}
