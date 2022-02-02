package leetcodeDS;

import java.util.HashMap;

public class _383_RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {

        HashMap<Character, Integer> ransomFreq = new HashMap<>();
        for (int i = 0; i < ransomNote.length(); i++)
            if (!ransomFreq.containsKey(ransomNote.charAt(i)))
                ransomFreq.put(ransomNote.charAt(i), 1);
            else
                ransomFreq.replace(ransomNote.charAt(i), ransomFreq.get(ransomNote.charAt(i)) + 1);

        HashMap<Character, Integer> magazineFreq = new HashMap<>();
        for (int i = 0; i < magazine.length(); i++)
            if (!magazineFreq.containsKey(magazine.charAt(i)))
                magazineFreq.put(magazine.charAt(i), 1);
            else
                magazineFreq.replace(magazine.charAt(i), magazineFreq.get(magazine.charAt(i)) + 1);

        for (Character c : ransomFreq.keySet())
            if (!magazineFreq.containsKey(c) || magazineFreq.get(c) < ransomFreq.get(c)) return false;
        return true;
    }
}
