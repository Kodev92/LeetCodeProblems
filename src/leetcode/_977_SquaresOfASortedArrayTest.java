package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _977_SquaresOfASortedArrayTest {

    @Test
    void sortedSquaresCase1() {
        int[] arr = {-4,-1,0,3,10};
        int[] res = {0,1,9,16,100};

        _977_SquaresOfASortedArray solution977 = new _977_SquaresOfASortedArray();
        assertArrayEquals(res, solution977.sortedSquares(arr));
    }

    @Test
    void sortedSquaresCase2() {
        int[] arr = {1};
        int[] res = {1};

        _977_SquaresOfASortedArray solution977 = new _977_SquaresOfASortedArray();
        assertArrayEquals(res, solution977.sortedSquares(arr));
    }

    @Test
    void sortedSquaresCase17() {
        int[] arr = {0, 2};
        int[] res = {0, 4};

        _977_SquaresOfASortedArray solution977 = new _977_SquaresOfASortedArray();
        assertArrayEquals(res, solution977.sortedSquares(arr));
    }
}