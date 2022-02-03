package leetcodeAlgo;

import java.util.HashSet;
import java.util.Set;

public class _695_MaxAreaOfIsland {

    Set<Integer> checked = new HashSet<>();
    int size = 0;

    public int maxAreaOfIsland(int[][] grid) {

        if (grid.length * grid[0].length == 1) return grid[0][0];
        int maxIsland = 0;
        for (int i = 0; i < grid.length * grid[0].length; i++)
            if (!checked.contains(i) && grid[i / grid[0].length][i % grid[0].length] == 1){
                roam(grid, i);
                maxIsland = Math.max(size, maxIsland);
                size = 0;
            }
        return maxIsland;
    }

    public void roam(int[][] grid, int i){
        if (!checked.contains(i) && grid[i / grid[0].length][i % grid[0].length] == 1) {
            size++;
            checked.add(i);
        } else return;

        // go left
        if (i % grid[0].length > 0) roam(grid, i - 1); // x-1,y
        // go rigth
        if (i % grid[0].length < grid[0].length - 1) roam(grid, i + 1); // x+1,y
        // go up
        if (i / grid[0].length > 0) roam(grid, i - grid[0].length); // x,y-1
        // go down
        if (i / grid[0].length < grid.length - 1) roam(grid, i + grid[0].length); // x,y+1
    }

}
