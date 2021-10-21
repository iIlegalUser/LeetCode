package problem;

import java.util.HashMap;

/*
 * 给定一个字符串s，请你找出其中不含有重复字符的最长子串的长度。
 * 链接：https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/
 */
public class _03_LongestSubstringWithoutRepeatingCharacters {
    static class Solution {
        static int lengthOfLongestSubstring(String s) {
            HashMap<Character, Integer> map = new HashMap<>();
            int max = 0, start = 0, n = s.length();
            for (int end = 0; end < n; end++) {
                char ch = s.charAt(end);
                if (map.containsKey(ch)) {
                    max = Math.max(max, end - start);
                    start = Math.max(map.get(ch) + 1, start);
                }
                map.put(ch, end);
            }
            max = Math.max(max, n - start);
            return max;
        }
    }

    public static void main(String[] args) {
        System.out.println(Solution.lengthOfLongestSubstring(""));
    }
}



