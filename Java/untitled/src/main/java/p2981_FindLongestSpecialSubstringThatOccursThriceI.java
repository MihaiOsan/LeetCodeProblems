import java.util.HashMap;

public class p2981_FindLongestSpecialSubstringThatOccursThriceI {
    public int maximumLength(String s) {
        int n = s.length();
        for (int len = n; len > 0; len--) {
            HashMap<String, Integer> map = new HashMap<>();
            for (int i = 0; i <= n - len; i++) {
                String sub = s.substring(i, i + len);
                if (isSpecial(sub)) {
                    map.put(sub, map.getOrDefault(sub, 0) + 1);
                    if (map.get(sub) >= 3) {
                        return len;
                    }
                }
            }
        }
        return -1;
    }

    private boolean isSpecial(String s) {
        char first = s.charAt(0);
        for (char c : s.toCharArray()) {
            if (c != first) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        p2981_FindLongestSpecialSubstringThatOccursThriceI solution = new p2981_FindLongestSpecialSubstringThatOccursThriceI();
        System.out.println(solution.maximumLength("aaaa")); // Output: 2
        System.out.println(solution.maximumLength("abcdef")); // Output: -1
        System.out.println(solution.maximumLength("abcaba")); // Output: 1
    }
}
