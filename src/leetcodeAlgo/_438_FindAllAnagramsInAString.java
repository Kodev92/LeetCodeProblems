package leetcodeAlgo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class _438_FindAllAnagramsInAString {
    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> result = new ArrayList<>();
        int[] pFreq = freq(p);

        for (int i = 0; i < s.length() - p.length() + 1; i++)
            if (isFreqEqual(freq(s.substring(i, i + p.length())), pFreq))
                result.add(i);
        return result;
    }

    private boolean isFreqEqual(int[] a, int[] b) {
        for (int i = 0; i < 26; i++)
            if (a[i] != b[i]) return false;
        return true;
    }

    private int[] freq(String str) {
        int[] f = new int[26];
        for (int i = 0; i < str.length(); i++)
            f[str.charAt(i) - 'a']++;
        return f;
    }



// Worked well, but not fast enough

/*
    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> result = new ArrayList<>();
        HashMap<Character, Integer> pFreq = freq(p);

        for (int i = 0; i < s.length() - p.length() + 1; i++)
            if (isFreqEqual(freq(s.substring(i, i + p.length())), pFreq))
                result.add(i);
        return result;
    }

    private boolean isFreqEqual(HashMap<Character, Integer> a, HashMap<Character, Integer> b) {
        for (Character c : a.keySet())
            if (!b.containsKey(c) || !a.get(c).equals(b.get(c))) return false;
        return true;
    }

    private HashMap<Character, Integer> freq(String str) {
        HashMap<Character, Integer> f = new HashMap<>();
        for (int i = 0; i < str.length(); i++)
            if (!f.containsKey(str.charAt(i)))
                f.put(str.charAt(i), 1);
            else
                f.replace(str.charAt(i), f.get(str.charAt(i)) + 1);
        return f;
    }
*/
}
