package leetcodeAlgo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _704_BinarySearchTest {

    @Test
    public void runExample1() {
        int[] arr = {-1,0,3,5,9,12};
        int targ = 9;

        Solution704 solution = new Solution704();
        assertEquals(4,solution.search(arr,targ));
    }

    @Test
    public void runExample2() {
        int[] arr = {-1,0,3,5,9,12};
        int targ = 2;

        Solution704 solution = new Solution704();
        assertEquals(-1,solution.search(arr,targ));
    }

    @Test
    public void runExample15() {
        int[] arr = {-1,0,3,5,9,12};
        int targ = 13;

        Solution704 solution = new Solution704();
        assertEquals(-1,solution.search(arr,targ));
    }

    @Test
    public void runExample40() {
        int[] arr = {2,5};
        int targ = 2;

        Solution704 solution = new Solution704();
        assertEquals(0,solution.search(arr,targ));
    }

    @Test
    public void runExampleMine1() {
        int[] arr = {-1,0,3,5,9,12,21,22,23,25,27,33,41,55};
        int targ = 41;

        Solution704 solution = new Solution704();
        assertEquals(12,solution.search(arr,targ));
    }

}