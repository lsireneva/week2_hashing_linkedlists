import java.util.HashSet;

public class LongestSubstringWithoutRepeat {

    public static void main (String[] args) {

        String text = "abcabcbb";

        System.out.println(lengthOfLongestSubstring (text));

    }


    public static int lengthOfLongestSubstring(String A) {

        int left = 0, right = 0, max = 0;
        int n = A.length();
        HashSet<Character> set = new HashSet<>();

        while (right < n && left < n) {
            if (!set.contains(A.charAt(right))) {
                set.add(A.charAt(right++));
                max = Math.max(max, set.size());
            } else {
                set.remove(A.charAt(left++));
            }
        }

        return max;
    }
}
