package leetcodeAlgo;

import java.util.Arrays;

public class _733_FloodFill {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int oldColor = image[sr][sc];
        if (oldColor == newColor) return image;

        int[][] newImage = new int[image.length][image[0].length];
        for (int i = 0; i < image.length; i++)
            for (int j = 0; j < image[0].length; j++)
                newImage[i][j] = image[i][j];

        paint(newImage, sr, sc, oldColor, newColor);
        return newImage;
    }

    private void paint(int[][] im, int x, int y, int oldColor, int newColor) {
        if (x < 0 || x > im.length - 1) return;
        if (y < 0 || y > im[0].length - 1) return;
        if (im[x][y] != oldColor /*&& im[x][y] != newColor*/)
            return;
        else {
            im[x][y] = newColor;
            paint(im, x - 1, y, oldColor, newColor);
            paint(im, x + 1, y, oldColor, newColor);
            paint(im, x, y - 1, oldColor, newColor);
            paint(im, x, y + 1, oldColor, newColor);
        }
    }

}
