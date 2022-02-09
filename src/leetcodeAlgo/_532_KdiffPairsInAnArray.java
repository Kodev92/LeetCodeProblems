package leetcodeAlgo;

public class _532_KdiffPairsInAnArray {
    public int findPairs(int[] nums, int k) {

        int[] freq = new int[20000001];
        int pairsCounter = 0;

        for (int num : nums) freq[num + 10000000]++;

        for (int i = 0; i < freq.length; i++)
            if ((i + k) < freq.length && (0 != k) && freq[i + k] > 0)
                pairsCounter ++;
            else if (0 == k && freq[i] > 1)
                pairsCounter ++;

        return pairsCounter;


    }
}
