package leetcodeAlgo;

public class _557_ReverseWordsInAStringIII {
    public String reverseWords(String s) {

        String result = "";
        int b = 0; // first char in word
        int e = 0; // last char in word

        while (e < s.length()) {

            // moving to last char in word
            while (e < s.length() && s.charAt(e) != ' ')
                e++;

            // adding reversed word to result; e pointing at space or at s.length()
            for (int i = e - 1; i >= b; i --) {
                result += s.charAt(i);
            }

            // adding spaces after word
            while (e < s.length() && s.charAt(e) == ' ') {
                e++;
                result += ' ';
            }

            b = e;
        }
        return result;

    }
}
