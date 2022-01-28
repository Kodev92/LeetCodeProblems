package leetcodeAlgo;

import java.util.HashMap;

public class _567_PermutationInString {
    public boolean checkInclusion(String s1, String s2) {

        if (s2.length()<s1.length()) return false;
        HashMap<Character, Integer> s1fp = charFrequencyProfile(s1);
        for (int i = 0; i < s2.length() - s1.length() + 1; i++) {
            String subs2 = s2.substring(i , s1.length() + i);
            HashMap<Character, Integer> subs2fp = charFrequencyProfile(subs2);
            if (hasSameFrequencies(s1fp, subs2fp)) return true;
        }
        return false;
    }

    public HashMap<Character, Integer> charFrequencyProfile(String s){
        HashMap<Character, Integer> f = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (f.containsKey(s.charAt(i)))
                f.put(s.charAt(i), f.get(s.charAt(i)) + 1);
            else
                f.put(s.charAt(i), 1);
        }
        return f;
    }

    public boolean hasSameFrequencies(HashMap<Character, Integer> a, HashMap<Character, Integer> b){
        for (Character c : a.keySet())
            if (!b.containsKey(c) || !b.get(c).equals(a.get(c))) return false; // !b.get(c).equals(a.get(c)) NOT b.get(c) != a.get(c)   !!!
        return true;
    }

}
