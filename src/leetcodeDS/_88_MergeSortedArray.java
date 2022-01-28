package leetcodeDS;

public class _88_MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        if (n == 0) return;

        int[] b = new int[m + n];
        int i1 = 0, i2 = 0;

        for (int i = 0; i < m + n; i++)
            if (i2 > n - 1 || (i1 < m && nums1[i1] < nums2[i2])) {
                b[i] = nums1[i1];
                i1++;
            } else {
                b[i] = nums2[i2];
                i2++;
            }

        for (int i = 0; i < m + n; i++) nums1[i] = b[i];

        // best solution, moving from tail, not from head!
 /*       int tail1 = m - 1, tail2 = n - 1, finished = m + n - 1;
        while (tail1 >= 0 && tail2 >= 0) {
            nums1[finished--] = (nums1[tail1] > nums2[tail2]) ?
                    nums1[tail1--] : nums2[tail2--];
        }

        while (tail2 >= 0) { //only need to combine with remaining nums2
            nums1[finished--] = nums2[tail2--];
        }*/

    }


}
