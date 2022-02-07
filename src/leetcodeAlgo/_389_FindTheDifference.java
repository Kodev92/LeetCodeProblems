package leetcodeAlgo;

public class _389_FindTheDifference {
    public char findTheDifference(String s, String t) {

        int[] charFreq = new int[26];

        for (int i = 0; i < t.length(); i++)
            charFreq[t.charAt(i)-'a']++;

        for (int i = 0; i < s.length(); i++)
            charFreq[s.charAt(i)-'a']--;

        for (int i = 0; i < charFreq.length; i++)
            if (charFreq[i] == 1) return Character.toChars(i + 'a')[0];

        return '-';
    }
}
