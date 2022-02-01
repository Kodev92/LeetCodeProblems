package leetcodeDS;

public class _566_ReshapeTheMatrix {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int ro = mat.length;
        int co = mat[0].length;
        if ( (ro * co != r * c) || (ro == r && co == c)) return mat;

        int[][] newMat = new int[r][c];

        int a = 0, b = 0;
        for (int i = 0; i < mat.length; i++)
            for (int j = 0; j < mat[0].length; j++) {
                if (b > c - 1) {
                    b = 0;
                    a++;
                }
                newMat[a][b] = mat[i][j];

        }
        return newMat;
    }

}
