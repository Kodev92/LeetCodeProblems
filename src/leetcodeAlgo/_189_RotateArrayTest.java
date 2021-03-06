package leetcodeAlgo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _189_RotateArrayTest {

    @Test
    void rotateArrayTestCase1() {
        int[] nums = {1,2,3,4,5,6};
        int k = 4;

        int[] res = {3, 4, 5, 6, 1, 2};

        _189_RotateArray solution189 = new _189_RotateArray();
        solution189.rotate(nums,k);
        assertArrayEquals(res, nums);
    }

    @Test
    void rotateArrayTestCase34() {
        int[] nums = {1,2,3,4,5,6};
        int k = 3;

        int[] res = {4,5,6,1,2,3};

        _189_RotateArray solution189 = new _189_RotateArray();
        solution189.rotate(nums,k);
        assertArrayEquals(res, nums);
    }

    @Test
    void rotateArrayTestCase35() {
        int[] nums = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54};
        int k = 45;

        int[] res = {10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,1,2,3,4,5,6,7,8,9};

        _189_RotateArray solution189 = new _189_RotateArray();
        solution189.rotate(nums,k);
        assertArrayEquals(res, nums);
    }


}