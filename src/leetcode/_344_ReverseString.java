package leetcode;

public class _344_ReverseString {
    public void reverseString(char[] s) {
        for (int i = 0; i < s.length / 2; i++) {
            char b = s[0];
            s[i] = s[s.length - 1 - i];
            s[s.length - 1 - i] = b;
        }
    }

}
