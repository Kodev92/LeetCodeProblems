package leetcodeAlgo;

import java.util.*;

public class _3_LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {

        if (s.length() == 0) return 0;

        Set<Character> hashset = new HashSet<>();
        int l = 0;
        int r = 0;
        int max = 0;

        while (r < s.length()) {
            if (!hashset.contains(s.charAt(r))) {
                hashset.add(s.charAt(r));
                r++;
            } else {
                hashset.remove(s.charAt(l));
                l++;
            }
            max = Math.max(max, hashset.size());
        }

        return max;
    }

    // "Time Limit Exceeded" solution
//    public int lengthOfLongestSubstring(String s) {
//
//        List<Character> subStrCharSet = new LinkedList<>();
//        int max = Integer.MIN_VALUE;
//        int sum = 0;
//
//        if (s.length() == 0) return 0;
//
//        for (int i = 0; i < s.length(); i++) {
//
//            if (!subStrCharSet.contains(s.charAt(i))) {
//                subStrCharSet.add(s.charAt(i));
//                sum++;
//            } else {
//                subStrCharSet.add(s.charAt(i));
//                sum++;
//                subStrCharSet = subStrCharSet.
//                        subList(subStrCharSet.indexOf(s.charAt(i)) + 1, sum);
//                sum = subStrCharSet.size();
//            }
//            max = Math.max(max, sum);
//
//        }
//        return max;
//
//    }
}
