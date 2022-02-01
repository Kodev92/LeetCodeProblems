package leetcodeDS;

import java.util.ArrayList;
import java.util.List;

public class _118_PascalsTriangle {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> t = new ArrayList<>();

        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        t.add(firstRow);
        if (numRows == 1) return t;

        for (int i = 1; i < numRows; i++) {
            List<Integer> newRow = new ArrayList<>();
            newRow.add(1);
            for (int j = 1; j < t.get(i - 1).size(); j++)
                newRow.add(t.get(i - 1).get(j - 1) + t.get(i - 1).get(j));
            newRow.add(1);
            t.add(newRow);
        }
        return t;
    }
}
