package leetcodeDS;

import java.util.*;
import java.util.stream.Collectors;

public class _387_FirstUniqueCharacterInAString {
    public int firstUniqChar(String s) {
        if (s.length() == 1) return 0;

        HashMap<Character, Integer> freq = new HashMap<>();
        for (int i = 0; i < s.length(); i++)
            if (!freq.containsKey(s.charAt(i)))
                freq.put(s.charAt(i),i);
            else
                freq.replace(s.charAt(i),-1);

        int min = -1;
        for (Integer integer : new ArrayList<>(freq.values())) if (integer >= 0 && (integer < min || min < 0)) min = integer;
        return min;
    }
}
