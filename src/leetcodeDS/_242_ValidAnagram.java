package leetcodeDS;

import java.util.HashMap;

public class _242_ValidAnagram {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) return false;
        HashMap<Character, Integer> sFreq = freq(s);
        HashMap<Character, Integer> tFreq = freq(t);

        for (Character character : sFreq.keySet())
            if (!tFreq.containsKey(character) || !tFreq.get(character).equals(sFreq.get(character)))
                return false;

        return true;
    }

    private static HashMap<Character, Integer> freq(String str) {
        HashMap<Character, Integer> strFreq = new HashMap<>();
        for (int i = 0; i < str.length(); i++)
            strFreq.put(str.charAt(i), strFreq.getOrDefault(str.charAt(i), 0) + 1);
        return strFreq;
    }
}
